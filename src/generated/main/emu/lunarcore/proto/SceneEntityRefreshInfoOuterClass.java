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

public final class SceneEntityRefreshInfoOuterClass {
  /**
   * Protobuf type {@code SceneEntityRefreshInfo}
   */
  public static final class SceneEntityRefreshInfo extends ProtoMessage<SceneEntityRefreshInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 del_entity = 13;</code>
     */
    private int delEntity;

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     */
    private final SceneEntityInfoOuterClass.SceneEntityInfo addEntity = SceneEntityInfoOuterClass.SceneEntityInfo.newInstance();

    private SceneEntityRefreshInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneEntityRefreshInfo}
     */
    public static SceneEntityRefreshInfo newInstance() {
      return new SceneEntityRefreshInfo();
    }

    /**
     * <code>optional uint32 del_entity = 13;</code>
     * @return whether the delEntity field is set
     */
    public boolean hasDelEntity() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 del_entity = 13;</code>
     * @return this
     */
    public SceneEntityRefreshInfo clearDelEntity() {
      bitField0_ &= ~0x00000001;
      delEntity = 0;
      return this;
    }

    /**
     * <code>optional uint32 del_entity = 13;</code>
     * @return the delEntity
     */
    public int getDelEntity() {
      return delEntity;
    }

    /**
     * <code>optional uint32 del_entity = 13;</code>
     * @param value the delEntity to set
     * @return this
     */
    public SceneEntityRefreshInfo setDelEntity(final int value) {
      bitField0_ |= 0x00000001;
      delEntity = value;
      return this;
    }

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     * @return whether the addEntity field is set
     */
    public boolean hasAddEntity() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     * @return this
     */
    public SceneEntityRefreshInfo clearAddEntity() {
      bitField0_ &= ~0x00000002;
      addEntity.clear();
      return this;
    }

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAddEntity()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public SceneEntityInfoOuterClass.SceneEntityInfo getAddEntity() {
      return addEntity;
    }

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public SceneEntityInfoOuterClass.SceneEntityInfo getMutableAddEntity() {
      bitField0_ |= 0x00000002;
      return addEntity;
    }

    /**
     * <code>optional .SceneEntityInfo add_entity = 8;</code>
     * @param value the addEntity to set
     * @return this
     */
    public SceneEntityRefreshInfo setAddEntity(
        final SceneEntityInfoOuterClass.SceneEntityInfo value) {
      bitField0_ |= 0x00000002;
      addEntity.copyFrom(value);
      return this;
    }

    @Override
    public SceneEntityRefreshInfo copyFrom(final SceneEntityRefreshInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        delEntity = other.delEntity;
        addEntity.copyFrom(other.addEntity);
      }
      return this;
    }

    @Override
    public SceneEntityRefreshInfo mergeFrom(final SceneEntityRefreshInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasDelEntity()) {
        setDelEntity(other.delEntity);
      }
      if (other.hasAddEntity()) {
        getMutableAddEntity().mergeFrom(other.addEntity);
      }
      return this;
    }

    @Override
    public SceneEntityRefreshInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      delEntity = 0;
      addEntity.clear();
      return this;
    }

    @Override
    public SceneEntityRefreshInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      addEntity.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneEntityRefreshInfo)) {
        return false;
      }
      SceneEntityRefreshInfo other = (SceneEntityRefreshInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasDelEntity() || delEntity == other.delEntity)
        && (!hasAddEntity() || addEntity.equals(other.addEntity));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(delEntity);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 66);
        output.writeMessageNoTag(addEntity);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(delEntity);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(addEntity);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneEntityRefreshInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 104: {
            // delEntity
            delEntity = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // addEntity
            input.readMessage(addEntity);
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
        output.writeUInt32(FieldNames.delEntity, delEntity);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.addEntity, addEntity);
      }
      output.endObject();
    }

    @Override
    public SceneEntityRefreshInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1279926322:
          case 314362519: {
            if (input.isAtField(FieldNames.delEntity)) {
              if (!input.trySkipNullValue()) {
                delEntity = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -405435420:
          case 1653776705: {
            if (input.isAtField(FieldNames.addEntity)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(addEntity);
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
    public SceneEntityRefreshInfo clone() {
      return new SceneEntityRefreshInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneEntityRefreshInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneEntityRefreshInfo(), data).checkInitialized();
    }

    public static SceneEntityRefreshInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityRefreshInfo(), input).checkInitialized();
    }

    public static SceneEntityRefreshInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneEntityRefreshInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneEntityRefreshInfo messages
     */
    public static MessageFactory<SceneEntityRefreshInfo> getFactory() {
      return SceneEntityRefreshInfoFactory.INSTANCE;
    }

    private enum SceneEntityRefreshInfoFactory implements MessageFactory<SceneEntityRefreshInfo> {
      INSTANCE;

      @Override
      public SceneEntityRefreshInfo create() {
        return SceneEntityRefreshInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName delEntity = FieldName.forField("delEntity", "del_entity");

      static final FieldName addEntity = FieldName.forField("addEntity", "add_entity");
    }
  }
}
