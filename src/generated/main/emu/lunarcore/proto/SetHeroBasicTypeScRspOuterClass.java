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

public final class SetHeroBasicTypeScRspOuterClass {
  /**
   * Protobuf type {@code SetHeroBasicTypeScRsp}
   */
  public static final class SetHeroBasicTypeScRsp extends ProtoMessage<SetHeroBasicTypeScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 13;</code>
     */
    private int retcode;

    /**
     * <code>optional .HeroBasicType basic_type = 12;</code>
     */
    private int basicType;

    private SetHeroBasicTypeScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetHeroBasicTypeScRsp}
     */
    public static SetHeroBasicTypeScRsp newInstance() {
      return new SetHeroBasicTypeScRsp();
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return this
     */
    public SetHeroBasicTypeScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 13;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetHeroBasicTypeScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 12;</code>
     * @return whether the basicType field is set
     */
    public boolean hasBasicType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 12;</code>
     * @return this
     */
    public SetHeroBasicTypeScRsp clearBasicType() {
      bitField0_ &= ~0x00000002;
      basicType = 0;
      return this;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 12;</code>
     * @return the basicType
     */
    public HeroBasicTypeOuterClass.HeroBasicType getBasicType() {
      return HeroBasicTypeOuterClass.HeroBasicType.forNumber(basicType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SetHeroBasicTypeScRsp#getBasicType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getBasicTypeValue() {
      return basicType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link HeroBasicTypeOuterClass.HeroBasicType}. Setting an invalid value
     * can cause {@link SetHeroBasicTypeScRsp#getBasicType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SetHeroBasicTypeScRsp setBasicTypeValue(final int value) {
      bitField0_ |= 0x00000002;
      basicType = value;
      return this;
    }

    /**
     * <code>optional .HeroBasicType basic_type = 12;</code>
     * @param value the basicType to set
     * @return this
     */
    public SetHeroBasicTypeScRsp setBasicType(final HeroBasicTypeOuterClass.HeroBasicType value) {
      bitField0_ |= 0x00000002;
      basicType = value.getNumber();
      return this;
    }

    @Override
    public SetHeroBasicTypeScRsp copyFrom(final SetHeroBasicTypeScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        basicType = other.basicType;
      }
      return this;
    }

    @Override
    public SetHeroBasicTypeScRsp mergeFrom(final SetHeroBasicTypeScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasBasicType()) {
        setBasicTypeValue(other.basicType);
      }
      return this;
    }

    @Override
    public SetHeroBasicTypeScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      basicType = 0;
      return this;
    }

    @Override
    public SetHeroBasicTypeScRsp clearQuick() {
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
      if (!(o instanceof SetHeroBasicTypeScRsp)) {
        return false;
      }
      SetHeroBasicTypeScRsp other = (SetHeroBasicTypeScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasBasicType() || basicType == other.basicType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeEnumNoTag(basicType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(basicType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetHeroBasicTypeScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // basicType
            final int value = input.readInt32();
            if (HeroBasicTypeOuterClass.HeroBasicType.forNumber(value) != null) {
              basicType = value;
              bitField0_ |= 0x00000002;
            }
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.basicType, basicType, HeroBasicTypeOuterClass.HeroBasicType.converter());
      }
      output.endObject();
    }

    @Override
    public SetHeroBasicTypeScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1699147640:
          case -1123950421: {
            if (input.isAtField(FieldNames.basicType)) {
              if (!input.trySkipNullValue()) {
                final HeroBasicTypeOuterClass.HeroBasicType value = input.readEnum(HeroBasicTypeOuterClass.HeroBasicType.converter());
                if (value != null) {
                  basicType = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public SetHeroBasicTypeScRsp clone() {
      return new SetHeroBasicTypeScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetHeroBasicTypeScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetHeroBasicTypeScRsp(), data).checkInitialized();
    }

    public static SetHeroBasicTypeScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetHeroBasicTypeScRsp(), input).checkInitialized();
    }

    public static SetHeroBasicTypeScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetHeroBasicTypeScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetHeroBasicTypeScRsp messages
     */
    public static MessageFactory<SetHeroBasicTypeScRsp> getFactory() {
      return SetHeroBasicTypeScRspFactory.INSTANCE;
    }

    private enum SetHeroBasicTypeScRspFactory implements MessageFactory<SetHeroBasicTypeScRsp> {
      INSTANCE;

      @Override
      public SetHeroBasicTypeScRsp create() {
        return SetHeroBasicTypeScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName basicType = FieldName.forField("basicType", "basic_type");
    }
  }
}
