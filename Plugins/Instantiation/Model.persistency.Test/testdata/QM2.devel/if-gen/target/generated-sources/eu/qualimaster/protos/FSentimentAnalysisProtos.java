// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FSentimentAnalysis.proto

package eu.qualimaster.protos;

public final class FSentimentAnalysisProtos {
  private FSentimentAnalysisProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SIFSentimentAnalysisAnalyzedStreamOutputOrBuilder extends
      // @@protoc_insertion_point(interface_extends:eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string symbolId = 1;</code>
     */
    boolean hasSymbolId();
    /**
     * <code>required string symbolId = 1;</code>
     */
    java.lang.String getSymbolId();
    /**
     * <code>required string symbolId = 1;</code>
     */
    com.google.protobuf.ByteString
        getSymbolIdBytes();

    /**
     * <code>required int64 timestamp = 2;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    long getTimestamp();

    /**
     * <code>required double value = 3;</code>
     */
    boolean hasValue();
    /**
     * <code>required double value = 3;</code>
     */
    double getValue();

    /**
     * <code>required int32 volume = 4;</code>
     */
    boolean hasVolume();
    /**
     * <code>required int32 volume = 4;</code>
     */
    int getVolume();
  }
  /**
   * Protobuf type {@code eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput}
   */
  public static final class SIFSentimentAnalysisAnalyzedStreamOutput extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput)
      SIFSentimentAnalysisAnalyzedStreamOutputOrBuilder {
    // Use SIFSentimentAnalysisAnalyzedStreamOutput.newBuilder() to construct.
    private SIFSentimentAnalysisAnalyzedStreamOutput(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SIFSentimentAnalysisAnalyzedStreamOutput(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SIFSentimentAnalysisAnalyzedStreamOutput defaultInstance;
    public static SIFSentimentAnalysisAnalyzedStreamOutput getDefaultInstance() {
      return defaultInstance;
    }

    public SIFSentimentAnalysisAnalyzedStreamOutput getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SIFSentimentAnalysisAnalyzedStreamOutput(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              symbolId_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              timestamp_ = input.readInt64();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              value_ = input.readDouble();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              volume_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return eu.qualimaster.protos.FSentimentAnalysisProtos.internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.qualimaster.protos.FSentimentAnalysisProtos.internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.class, eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.Builder.class);
    }

    public static com.google.protobuf.Parser<SIFSentimentAnalysisAnalyzedStreamOutput> PARSER =
        new com.google.protobuf.AbstractParser<SIFSentimentAnalysisAnalyzedStreamOutput>() {
      public SIFSentimentAnalysisAnalyzedStreamOutput parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SIFSentimentAnalysisAnalyzedStreamOutput(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SIFSentimentAnalysisAnalyzedStreamOutput> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SYMBOLID_FIELD_NUMBER = 1;
    private java.lang.Object symbolId_;
    /**
     * <code>required string symbolId = 1;</code>
     */
    public boolean hasSymbolId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string symbolId = 1;</code>
     */
    public java.lang.String getSymbolId() {
      java.lang.Object ref = symbolId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          symbolId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string symbolId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSymbolIdBytes() {
      java.lang.Object ref = symbolId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        symbolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int VALUE_FIELD_NUMBER = 3;
    private double value_;
    /**
     * <code>required double value = 3;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double value = 3;</code>
     */
    public double getValue() {
      return value_;
    }

    public static final int VOLUME_FIELD_NUMBER = 4;
    private int volume_;
    /**
     * <code>required int32 volume = 4;</code>
     */
    public boolean hasVolume() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 volume = 4;</code>
     */
    public int getVolume() {
      return volume_;
    }

    private void initFields() {
      symbolId_ = "";
      timestamp_ = 0L;
      value_ = 0D;
      volume_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSymbolId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVolume()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSymbolIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, value_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, volume_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSymbolIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, value_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, volume_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput)
        eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutputOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return eu.qualimaster.protos.FSentimentAnalysisProtos.internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return eu.qualimaster.protos.FSentimentAnalysisProtos.internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.class, eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.Builder.class);
      }

      // Construct using eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        symbolId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        volume_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return eu.qualimaster.protos.FSentimentAnalysisProtos.internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor;
      }

      public eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput getDefaultInstanceForType() {
        return eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.getDefaultInstance();
      }

      public eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput build() {
        eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput buildPartial() {
        eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput result = new eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.symbolId_ = symbolId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.volume_ = volume_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput) {
          return mergeFrom((eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput other) {
        if (other == eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput.getDefaultInstance()) return this;
        if (other.hasSymbolId()) {
          bitField0_ |= 0x00000001;
          symbolId_ = other.symbolId_;
          onChanged();
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        if (other.hasVolume()) {
          setVolume(other.getVolume());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSymbolId()) {
          
          return false;
        }
        if (!hasTimestamp()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        if (!hasVolume()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (eu.qualimaster.protos.FSentimentAnalysisProtos.SIFSentimentAnalysisAnalyzedStreamOutput) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object symbolId_ = "";
      /**
       * <code>required string symbolId = 1;</code>
       */
      public boolean hasSymbolId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string symbolId = 1;</code>
       */
      public java.lang.String getSymbolId() {
        java.lang.Object ref = symbolId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            symbolId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string symbolId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSymbolIdBytes() {
        java.lang.Object ref = symbolId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          symbolId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string symbolId = 1;</code>
       */
      public Builder setSymbolId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbolId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string symbolId = 1;</code>
       */
      public Builder clearSymbolId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        symbolId_ = getDefaultInstance().getSymbolId();
        onChanged();
        return this;
      }
      /**
       * <code>required string symbolId = 1;</code>
       */
      public Builder setSymbolIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        symbolId_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private double value_ ;
      /**
       * <code>required double value = 3;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double value = 3;</code>
       */
      public double getValue() {
        return value_;
      }
      /**
       * <code>required double value = 3;</code>
       */
      public Builder setValue(double value) {
        bitField0_ |= 0x00000004;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double value = 3;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = 0D;
        onChanged();
        return this;
      }

      private int volume_ ;
      /**
       * <code>required int32 volume = 4;</code>
       */
      public boolean hasVolume() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 volume = 4;</code>
       */
      public int getVolume() {
        return volume_;
      }
      /**
       * <code>required int32 volume = 4;</code>
       */
      public Builder setVolume(int value) {
        bitField0_ |= 0x00000008;
        volume_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 volume = 4;</code>
       */
      public Builder clearVolume() {
        bitField0_ = (bitField0_ & ~0x00000008);
        volume_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput)
    }

    static {
      defaultInstance = new SIFSentimentAnalysisAnalyzedStreamOutput(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:eu.qualimaster.families.protobuf.SIFSentimentAnalysisAnalyzedStreamOutput)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030FSentimentAnalysis.proto\022 eu.qualimast" +
      "er.families.protobuf\"n\n(SIFSentimentAnal" +
      "ysisAnalyzedStreamOutput\022\020\n\010symbolId\030\001 \002" +
      "(\t\022\021\n\ttimestamp\030\002 \002(\003\022\r\n\005value\030\003 \002(\001\022\016\n\006" +
      "volume\030\004 \002(\005B1\n\025eu.qualimaster.protosB\030F" +
      "SentimentAnalysisProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_eu_qualimaster_families_protobuf_SIFSentimentAnalysisAnalyzedStreamOutput_descriptor,
        new java.lang.String[] { "SymbolId", "Timestamp", "Value", "Volume", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
