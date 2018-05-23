// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package protobuf.protos;

public final class Auth {
  private Auth() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface LoginOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Login)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    java.lang.String getToken();
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code Login}
   */
  public  static final class Login extends
      com.google.protobuf.GeneratedMessageLite<
          Login, Login.Builder> implements
      // @@protoc_insertion_point(message_implements:Login)
      LoginOrBuilder {
    private Login() {
      token_ = "";
    }
    public static final int TOKEN_FIELD_NUMBER = 1;
    private java.lang.String token_;
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public java.lang.String getToken() {
      return token_;
    }
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(token_);
    }
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    private void setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
    }
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    private void clearToken() {
      
      token_ = getDefaultInstance().getToken();
    }
    /**
     * <pre>
     * 标识
     * </pre>
     *
     * <code>string token = 1;</code>
     */
    private void setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!token_.isEmpty()) {
        output.writeString(1, getToken());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getToken());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf.protos.Auth.Login parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Login parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Login parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf.protos.Auth.Login parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Login parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Login parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(protobuf.protos.Auth.Login prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code Login}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          protobuf.protos.Auth.Login, Builder> implements
        // @@protoc_insertion_point(builder_implements:Login)
        protobuf.protos.Auth.LoginOrBuilder {
      // Construct using protobuf.protos.Auth.Login.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 标识
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public java.lang.String getToken() {
        return instance.getToken();
      }
      /**
       * <pre>
       * 标识
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        return instance.getTokenBytes();
      }
      /**
       * <pre>
       * 标识
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        copyOnWrite();
        instance.setToken(value);
        return this;
      }
      /**
       * <pre>
       * 标识
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder clearToken() {
        copyOnWrite();
        instance.clearToken();
        return this;
      }
      /**
       * <pre>
       * 标识
       * </pre>
       *
       * <code>string token = 1;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTokenBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Login)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf.protos.Auth.Login();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          protobuf.protos.Auth.Login other = (protobuf.protos.Auth.Login) arg1;
          token_ = visitor.visitString(!token_.isEmpty(), token_,
              !other.token_.isEmpty(), other.token_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  java.lang.String s = input.readStringRequireUtf8();

                  token_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (protobuf.protos.Auth.Login.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Login)
    private static final protobuf.protos.Auth.Login DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Login();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf.protos.Auth.Login getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Login> PARSER;

    public static com.google.protobuf.Parser<Login> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *返回码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     */
    int getCode();

    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    java.lang.String getDesc();
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    com.google.protobuf.ByteString
        getDescBytes();
  }
  /**
   * <pre>
   *code：
   *200 -- ok
   *400 -- error
   * </pre>
   *
   * Protobuf type {@code Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageLite<
          Response, Response.Builder> implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
    private Response() {
      desc_ = "";
    }
    public static final int CODE_FIELD_NUMBER = 1;
    private int code_;
    /**
     * <pre>
     *返回码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <pre>
     *返回码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     */
    private void setCode(int value) {
      
      code_ = value;
    }
    /**
     * <pre>
     *返回码
     * </pre>
     *
     * <code>int32 code = 1;</code>
     */
    private void clearCode() {
      
      code_ = 0;
    }

    public static final int DESC_FIELD_NUMBER = 2;
    private java.lang.String desc_;
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    public java.lang.String getDesc() {
      return desc_;
    }
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(desc_);
    }
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    private void setDesc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      desc_ = value;
    }
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    private void clearDesc() {
      
      desc_ = getDefaultInstance().getDesc();
    }
    /**
     * <pre>
     *描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     */
    private void setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      desc_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (code_ != 0) {
        output.writeInt32(1, code_);
      }
      if (!desc_.isEmpty()) {
        output.writeString(2, getDesc());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (code_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, code_);
      }
      if (!desc_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getDesc());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf.protos.Auth.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf.protos.Auth.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf.protos.Auth.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf.protos.Auth.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(protobuf.protos.Auth.Response prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     *code：
     *200 -- ok
     *400 -- error
     * </pre>
     *
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          protobuf.protos.Auth.Response, Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        protobuf.protos.Auth.ResponseOrBuilder {
      // Construct using protobuf.protos.Auth.Response.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *返回码
       * </pre>
       *
       * <code>int32 code = 1;</code>
       */
      public int getCode() {
        return instance.getCode();
      }
      /**
       * <pre>
       *返回码
       * </pre>
       *
       * <code>int32 code = 1;</code>
       */
      public Builder setCode(int value) {
        copyOnWrite();
        instance.setCode(value);
        return this;
      }
      /**
       * <pre>
       *返回码
       * </pre>
       *
       * <code>int32 code = 1;</code>
       */
      public Builder clearCode() {
        copyOnWrite();
        instance.clearCode();
        return this;
      }

      /**
       * <pre>
       *描述
       * </pre>
       *
       * <code>string desc = 2;</code>
       */
      public java.lang.String getDesc() {
        return instance.getDesc();
      }
      /**
       * <pre>
       *描述
       * </pre>
       *
       * <code>string desc = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        return instance.getDescBytes();
      }
      /**
       * <pre>
       *描述
       * </pre>
       *
       * <code>string desc = 2;</code>
       */
      public Builder setDesc(
          java.lang.String value) {
        copyOnWrite();
        instance.setDesc(value);
        return this;
      }
      /**
       * <pre>
       *描述
       * </pre>
       *
       * <code>string desc = 2;</code>
       */
      public Builder clearDesc() {
        copyOnWrite();
        instance.clearDesc();
        return this;
      }
      /**
       * <pre>
       *描述
       * </pre>
       *
       * <code>string desc = 2;</code>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setDescBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Response)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf.protos.Auth.Response();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          protobuf.protos.Auth.Response other = (protobuf.protos.Auth.Response) arg1;
          code_ = visitor.visitInt(code_ != 0, code_,
              other.code_ != 0, other.code_);
          desc_ = visitor.visitString(!desc_.isEmpty(), desc_,
              !other.desc_.isEmpty(), other.desc_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 8: {

                  code_ = input.readInt32();
                  break;
                }
                case 18: {
                  java.lang.String s = input.readStringRequireUtf8();

                  desc_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (protobuf.protos.Auth.Response.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:Response)
    private static final protobuf.protos.Auth.Response DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Response();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf.protos.Auth.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Response> PARSER;

    public static com.google.protobuf.Parser<Response> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
