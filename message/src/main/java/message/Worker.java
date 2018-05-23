package message;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import message.handler.IMHandler;
import message.starter.MeaageStarter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dell on 2016/3/2.
 */
public class Worker extends Thread {

    private static final Logger logger = LoggerFactory.getLogger(Worker.class);
    private static Worker[] _workers;
    private volatile boolean _stop = false;
    private final BlockingQueue<IMHandler> _tasks = new LinkedBlockingDeque<>();

    public static void dispatch(String userId, IMHandler handler) {
        int workId = getWorkId(userId);
        if (handler == null) {
            logger.error("handler is null");
        }
        _workers[workId]._tasks.offer(handler);
    }

    @Override
    public void run() {
        while (!_stop) {
            IMHandler handler = null;
            try {
                handler = _tasks.poll(600, TimeUnit.MILLISECONDS);
                if (handler == null) {
                    continue;
                }
            } catch (InterruptedException e) {
                logger.error("Caught Exception");
            }
            try {
                assert handler != null;
                handler.excute(this);
            } catch (Exception e) {
                logger.error("Caught Exception");
            }
        }
    }

    private static int getWorkId(String str) {
        return str.hashCode() % MeaageStarter.workNum;
    }

    public static void startWorker(int workNum) {
        _workers = new Worker[workNum];
        for (int i = 0; i < workNum; i++) {
            _workers[i] = new Worker();
            _workers[i].start();
        }
    }

    public static void stopWorkers() {
        for (int i = 0; i < MeaageStarter.workNum; i++) {
            _workers[i]._stop = true;
        }
    }
}
