// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class LockRelicCsReqOuterClass {
  /**
   * Protobuf type {@code LockRelicCsReq}
   */
  public static final class LockRelicCsReq extends ProtoMessage<LockRelicCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 relic_unique_id = 10;</code>
     */
    private int relicUniqueId;

    /**
     * <code>optional bool is_protected = 9;</code>
     */
    private boolean isProtected;

    private LockRelicCsReq() {
    }

    /**
     * @return a new empty instance of {@code LockRelicCsReq}
     */
    public static LockRelicCsReq newInstance() {
      return new LockRelicCsReq();
    }

    /**
     * <code>optional uint32 relic_unique_id = 10;</code>
     * @return whether the relicUniqueId field is set
     */
    public boolean hasRelicUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 relic_unique_id = 10;</code>
     * @return this
     */
    public LockRelicCsReq clearRelicUniqueId() {
      bitField0_ &= ~0x00000001;
      relicUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 relic_unique_id = 10;</code>
     * @return the relicUniqueId
     */
    public int getRelicUniqueId() {
      return relicUniqueId;
    }

    /**
     * <code>optional uint32 relic_unique_id = 10;</code>
     * @param value the relicUniqueId to set
     * @return this
     */
    public LockRelicCsReq setRelicUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      relicUniqueId = value;
      return this;
    }

    /**
     * <code>optional bool is_protected = 9;</code>
     * @return whether the isProtected field is set
     */
    public boolean hasIsProtected() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool is_protected = 9;</code>
     * @return this
     */
    public LockRelicCsReq clearIsProtected() {
      bitField0_ &= ~0x00000002;
      isProtected = false;
      return this;
    }

    /**
     * <code>optional bool is_protected = 9;</code>
     * @return the isProtected
     */
    public boolean getIsProtected() {
      return isProtected;
    }

    /**
     * <code>optional bool is_protected = 9;</code>
     * @param value the isProtected to set
     * @return this
     */
    public LockRelicCsReq setIsProtected(final boolean value) {
      bitField0_ |= 0x00000002;
      isProtected = value;
      return this;
    }

    @Override
    public LockRelicCsReq copyFrom(final LockRelicCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        relicUniqueId = other.relicUniqueId;
        isProtected = other.isProtected;
      }
      return this;
    }

    @Override
    public LockRelicCsReq mergeFrom(final LockRelicCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRelicUniqueId()) {
        setRelicUniqueId(other.relicUniqueId);
      }
      if (other.hasIsProtected()) {
        setIsProtected(other.isProtected);
      }
      return this;
    }

    @Override
    public LockRelicCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      relicUniqueId = 0;
      isProtected = false;
      return this;
    }

    @Override
    public LockRelicCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LockRelicCsReq)) {
        return false;
      }
      LockRelicCsReq other = (LockRelicCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasRelicUniqueId() || relicUniqueId == other.relicUniqueId)
        && (!hasIsProtected() || isProtected == other.isProtected);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeBoolNoTag(isProtected);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LockRelicCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // relicUniqueId
            relicUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // isProtected
            isProtected = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.relicUniqueId, relicUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.isProtected, isProtected);
      }
      output.endObject();
    }

    @Override
    public LockRelicCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1966200481:
          case 49648253: {
            if (input.isAtField(FieldNames.relicUniqueId)) {
              if (!input.trySkipNullValue()) {
                relicUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 569879972:
          case -1919645991: {
            if (input.isAtField(FieldNames.isProtected)) {
              if (!input.trySkipNullValue()) {
                isProtected = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public LockRelicCsReq clone() {
      return new LockRelicCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LockRelicCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LockRelicCsReq(), data).checkInitialized();
    }

    public static LockRelicCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockRelicCsReq(), input).checkInitialized();
    }

    public static LockRelicCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LockRelicCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating LockRelicCsReq messages
     */
    public static MessageFactory<LockRelicCsReq> getFactory() {
      return LockRelicCsReqFactory.INSTANCE;
    }

    private enum LockRelicCsReqFactory implements MessageFactory<LockRelicCsReq> {
      INSTANCE;

      @Override
      public LockRelicCsReq create() {
        return LockRelicCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName relicUniqueId = FieldName.forField("relicUniqueId", "relic_unique_id");

      static final FieldName isProtected = FieldName.forField("isProtected", "is_protected");
    }
  }
}
