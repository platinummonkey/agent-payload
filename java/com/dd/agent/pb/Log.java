// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/logs/agent_logs_payload.proto

package com.dd.agent.pb;

/**
 * Protobuf type {@code pb.Log}
 */
public  final class Log extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.Log)
    LogOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Log.newBuilder() to construct.
  private Log(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Log() {
    message_ = "";
    status_ = "";
    timestamp_ = 0L;
    hostname_ = "";
    service_ = "";
    source_ = "";
    tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Log(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          case 24: {

            timestamp_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            hostname_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            service_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            source_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              tags_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000040;
            }
            tags_.add(s);
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
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        tags_ = tags_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dd.agent.pb.AgentPayload.internal_static_pb_Log_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dd.agent.pb.AgentPayload.internal_static_pb_Log_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dd.agent.pb.Log.class, com.dd.agent.pb.Log.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object status_;
  /**
   * <pre>
   * previously known as "severity"
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * previously known as "severity"
   * </pre>
   *
   * <code>string status = 2;</code>
   */
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 3;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int HOSTNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object hostname_;
  /**
   * <pre>
   * from host
   * </pre>
   *
   * <code>string hostname = 4;</code>
   */
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * from host
   * </pre>
   *
   * <code>string hostname = 4;</code>
   */
  public com.google.protobuf.ByteString
      getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_FIELD_NUMBER = 5;
  private volatile java.lang.Object service_;
  /**
   * <pre>
   * from config
   * </pre>
   *
   * <code>string service = 5;</code>
   */
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * from config
   * </pre>
   *
   * <code>string service = 5;</code>
   */
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 6;
  private volatile java.lang.Object source_;
  /**
   * <code>string source = 6;</code>
   */
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>string source = 6;</code>
   */
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAGS_FIELD_NUMBER = 7;
  private com.google.protobuf.LazyStringList tags_;
  /**
   * <pre>
   * from config, container tags, ...
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTagsList() {
    return tags_;
  }
  /**
   * <pre>
   * from config, container tags, ...
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <pre>
   * from config, container tags, ...
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   */
  public java.lang.String getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <pre>
   * from config, container tags, ...
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   */
  public com.google.protobuf.ByteString
      getTagsBytes(int index) {
    return tags_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (!getStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(3, timestamp_);
    }
    if (!getHostnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, hostname_);
    }
    if (!getServiceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, service_);
    }
    if (!getSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, source_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, tags_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (!getStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, timestamp_);
    }
    if (!getHostnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, hostname_);
    }
    if (!getServiceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, service_);
    }
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, source_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tags_.size(); i++) {
        dataSize += computeStringSizeNoTag(tags_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTagsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.dd.agent.pb.Log)) {
      return super.equals(obj);
    }
    com.dd.agent.pb.Log other = (com.dd.agent.pb.Log) obj;

    boolean result = true;
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getStatus()
        .equals(other.getStatus());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getHostname()
        .equals(other.getHostname());
    result = result && getService()
        .equals(other.getService());
    result = result && getSource()
        .equals(other.getSource());
    result = result && getTagsList()
        .equals(other.getTagsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dd.agent.pb.Log parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dd.agent.pb.Log parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dd.agent.pb.Log parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dd.agent.pb.Log parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dd.agent.pb.Log parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dd.agent.pb.Log parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dd.agent.pb.Log parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dd.agent.pb.Log parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dd.agent.pb.Log parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dd.agent.pb.Log parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dd.agent.pb.Log parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dd.agent.pb.Log parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.dd.agent.pb.Log prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code pb.Log}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.Log)
      com.dd.agent.pb.LogOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dd.agent.pb.AgentPayload.internal_static_pb_Log_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dd.agent.pb.AgentPayload.internal_static_pb_Log_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dd.agent.pb.Log.class, com.dd.agent.pb.Log.Builder.class);
    }

    // Construct using com.dd.agent.pb.Log.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      message_ = "";

      status_ = "";

      timestamp_ = 0L;

      hostname_ = "";

      service_ = "";

      source_ = "";

      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dd.agent.pb.AgentPayload.internal_static_pb_Log_descriptor;
    }

    public com.dd.agent.pb.Log getDefaultInstanceForType() {
      return com.dd.agent.pb.Log.getDefaultInstance();
    }

    public com.dd.agent.pb.Log build() {
      com.dd.agent.pb.Log result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dd.agent.pb.Log buildPartial() {
      com.dd.agent.pb.Log result = new com.dd.agent.pb.Log(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.message_ = message_;
      result.status_ = status_;
      result.timestamp_ = timestamp_;
      result.hostname_ = hostname_;
      result.service_ = service_;
      result.source_ = source_;
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        tags_ = tags_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.tags_ = tags_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.dd.agent.pb.Log) {
        return mergeFrom((com.dd.agent.pb.Log)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dd.agent.pb.Log other) {
      if (other == com.dd.agent.pb.Log.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        onChanged();
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.tags_.isEmpty()) {
        if (tags_.isEmpty()) {
          tags_ = other.tags_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureTagsIsMutable();
          tags_.addAll(other.tags_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.dd.agent.pb.Log parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dd.agent.pb.Log) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object status_ = "";
    /**
     * <pre>
     * previously known as "severity"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * previously known as "severity"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * previously known as "severity"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * previously known as "severity"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * previously known as "severity"
     * </pre>
     *
     * <code>string status = 2;</code>
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 3;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object hostname_ = "";
    /**
     * <pre>
     * from host
     * </pre>
     *
     * <code>string hostname = 4;</code>
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * from host
     * </pre>
     *
     * <code>string hostname = 4;</code>
     */
    public com.google.protobuf.ByteString
        getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * from host
     * </pre>
     *
     * <code>string hostname = 4;</code>
     */
    public Builder setHostname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostname_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from host
     * </pre>
     *
     * <code>string hostname = 4;</code>
     */
    public Builder clearHostname() {
      
      hostname_ = getDefaultInstance().getHostname();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from host
     * </pre>
     *
     * <code>string hostname = 4;</code>
     */
    public Builder setHostnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostname_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object service_ = "";
    /**
     * <pre>
     * from config
     * </pre>
     *
     * <code>string service = 5;</code>
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * from config
     * </pre>
     *
     * <code>string service = 5;</code>
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * from config
     * </pre>
     *
     * <code>string service = 5;</code>
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config
     * </pre>
     *
     * <code>string service = 5;</code>
     */
    public Builder clearService() {
      
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config
     * </pre>
     *
     * <code>string service = 5;</code>
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <code>string source = 6;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source = 6;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source = 6;</code>
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string source = 6;</code>
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <code>string source = 6;</code>
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        tags_ = new com.google.protobuf.LazyStringArrayList(tags_);
        bitField0_ |= 0x00000040;
       }
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTagsList() {
      return tags_.getUnmodifiableView();
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public int getTagsCount() {
      return tags_.size();
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public java.lang.String getTags(int index) {
      return tags_.get(index);
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public com.google.protobuf.ByteString
        getTagsBytes(int index) {
      return tags_.getByteString(index);
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public Builder setTags(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public Builder addTags(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTagsIsMutable();
      tags_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public Builder addAllTags(
        java.lang.Iterable<java.lang.String> values) {
      ensureTagsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tags_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public Builder clearTags() {
      tags_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from config, container tags, ...
     * </pre>
     *
     * <code>repeated string tags = 7;</code>
     */
    public Builder addTagsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTagsIsMutable();
      tags_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.Log)
  }

  // @@protoc_insertion_point(class_scope:pb.Log)
  private static final com.dd.agent.pb.Log DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dd.agent.pb.Log();
  }

  public static com.dd.agent.pb.Log getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Log>
      PARSER = new com.google.protobuf.AbstractParser<Log>() {
    public Log parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Log(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Log> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Log> getParserForType() {
    return PARSER;
  }

  public com.dd.agent.pb.Log getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

