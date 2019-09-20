// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protores.proto

package yang.shuai.ysservice.domain;

public final class Protores {
  private Protores() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface comment_COrBuilder extends
      // @@protoc_insertion_point(interface_extends:log.comment_C)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    boolean hasMsg();
    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    String getMsg();
    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * <pre>
   * 提交评论
   * </pre>
   *
   * Protobuf type {@code log.comment_C}
   */
  public  static final class comment_C extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:log.comment_C)
      comment_COrBuilder {
  private static final long serialVersionUID = 0L;
    // Use comment_C.newBuilder() to construct.
    private comment_C(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private comment_C() {
      msg_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new comment_C();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private comment_C(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              msg_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Protores.internal_static_log_comment_C_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Protores.internal_static_log_comment_C_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Protores.comment_C.class, Protores.comment_C.Builder.class);
    }

    private int bitField0_;
    public static final int MSG_FIELD_NUMBER = 1;
    private volatile Object msg_;
    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    public String getMsg() {
      Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * 评论内容
     * </pre>
     *
     * <code>optional string msg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msg_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msg_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Protores.comment_C)) {
        return super.equals(obj);
      }
      Protores.comment_C other = (Protores.comment_C) obj;

      if (hasMsg() != other.hasMsg()) return false;
      if (hasMsg()) {
        if (!getMsg()
            .equals(other.getMsg())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMsg()) {
        hash = (37 * hash) + MSG_FIELD_NUMBER;
        hash = (53 * hash) + getMsg().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Protores.comment_C parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protores.comment_C parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protores.comment_C parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protores.comment_C parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protores.comment_C parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Protores.comment_C parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Protores.comment_C parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Protores.comment_C parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Protores.comment_C parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Protores.comment_C parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Protores.comment_C parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Protores.comment_C parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Protores.comment_C prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * 提交评论
     * </pre>
     *
     * Protobuf type {@code log.comment_C}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:log.comment_C)
        Protores.comment_COrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Protores.internal_static_log_comment_C_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Protores.internal_static_log_comment_C_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Protores.comment_C.class, Protores.comment_C.Builder.class);
      }

      // Construct using log.Protores.comment_C.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Protores.internal_static_log_comment_C_descriptor;
      }

      @Override
      public Protores.comment_C getDefaultInstanceForType() {
        return Protores.comment_C.getDefaultInstance();
      }

      @Override
      public Protores.comment_C build() {
        Protores.comment_C result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Protores.comment_C buildPartial() {
        Protores.comment_C result = new Protores.comment_C(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Protores.comment_C) {
          return mergeFrom((Protores.comment_C)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Protores.comment_C other) {
        if (other == Protores.comment_C.getDefaultInstance()) return this;
        if (other.hasMsg()) {
          bitField0_ |= 0x00000001;
          msg_ = other.msg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Protores.comment_C parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Protores.comment_C) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Object msg_ = "";
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public String getMsg() {
        Object ref = msg_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            msg_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public Builder setMsg(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 评论内容
       * </pre>
       *
       * <code>optional string msg = 1;</code>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        msg_ = value;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:log.comment_C)
    }

    // @@protoc_insertion_point(class_scope:log.comment_C)
    private static final Protores.comment_C DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Protores.comment_C();
    }

    public static Protores.comment_C getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @Deprecated public static final com.google.protobuf.Parser<comment_C>
        PARSER = new com.google.protobuf.AbstractParser<comment_C>() {
      @Override
      public comment_C parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new comment_C(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<comment_C> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<comment_C> getParserForType() {
      return PARSER;
    }

    @Override
    public Protores.comment_C getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_log_comment_C_descriptor;
  private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_log_comment_C_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016protores.proto\022\003log\"\030\n\tcomment_C\022\013\n\003ms" +
      "g\030\001 \001(\t"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_log_comment_C_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_log_comment_C_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_log_comment_C_descriptor,
        new String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
