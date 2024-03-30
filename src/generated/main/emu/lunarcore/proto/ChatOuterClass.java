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
import us.hebi.quickbuf.Utf8String;

public final class ChatOuterClass {
  /**
   * Protobuf type {@code Chat}
   */
  public static final class Chat extends ProtoMessage<Chat> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 sent_time = 15;</code>
     */
    private long sentTime;

    /**
     * <code>optional uint32 sender_uid = 4;</code>
     */
    private int senderUid;

    /**
     * <code>optional uint32 emote = 11;</code>
     */
    private int emote;

    /**
     * <code>optional .MsgType msg_type = 10;</code>
     */
    private int msgType;

    /**
     * <code>optional string text = 8;</code>
     */
    private final Utf8String text = Utf8String.newEmptyInstance();

    private Chat() {
    }

    /**
     * @return a new empty instance of {@code Chat}
     */
    public static Chat newInstance() {
      return new Chat();
    }

    /**
     * <code>optional uint64 sent_time = 15;</code>
     * @return whether the sentTime field is set
     */
    public boolean hasSentTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 sent_time = 15;</code>
     * @return this
     */
    public Chat clearSentTime() {
      bitField0_ &= ~0x00000001;
      sentTime = 0L;
      return this;
    }

    /**
     * <code>optional uint64 sent_time = 15;</code>
     * @return the sentTime
     */
    public long getSentTime() {
      return sentTime;
    }

    /**
     * <code>optional uint64 sent_time = 15;</code>
     * @param value the sentTime to set
     * @return this
     */
    public Chat setSentTime(final long value) {
      bitField0_ |= 0x00000001;
      sentTime = value;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 4;</code>
     * @return whether the senderUid field is set
     */
    public boolean hasSenderUid() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 sender_uid = 4;</code>
     * @return this
     */
    public Chat clearSenderUid() {
      bitField0_ &= ~0x00000002;
      senderUid = 0;
      return this;
    }

    /**
     * <code>optional uint32 sender_uid = 4;</code>
     * @return the senderUid
     */
    public int getSenderUid() {
      return senderUid;
    }

    /**
     * <code>optional uint32 sender_uid = 4;</code>
     * @param value the senderUid to set
     * @return this
     */
    public Chat setSenderUid(final int value) {
      bitField0_ |= 0x00000002;
      senderUid = value;
      return this;
    }

    /**
     * <code>optional uint32 emote = 11;</code>
     * @return whether the emote field is set
     */
    public boolean hasEmote() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 emote = 11;</code>
     * @return this
     */
    public Chat clearEmote() {
      bitField0_ &= ~0x00000004;
      emote = 0;
      return this;
    }

    /**
     * <code>optional uint32 emote = 11;</code>
     * @return the emote
     */
    public int getEmote() {
      return emote;
    }

    /**
     * <code>optional uint32 emote = 11;</code>
     * @param value the emote to set
     * @return this
     */
    public Chat setEmote(final int value) {
      bitField0_ |= 0x00000004;
      emote = value;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 10;</code>
     * @return whether the msgType field is set
     */
    public boolean hasMsgType() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .MsgType msg_type = 10;</code>
     * @return this
     */
    public Chat clearMsgType() {
      bitField0_ &= ~0x00000008;
      msgType = 0;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 10;</code>
     * @return the msgType
     */
    public MsgTypeOuterClass.MsgType getMsgType() {
      return MsgTypeOuterClass.MsgType.forNumber(msgType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link Chat#getMsgType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getMsgTypeValue() {
      return msgType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MsgTypeOuterClass.MsgType}. Setting an invalid value
     * can cause {@link Chat#getMsgType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public Chat setMsgTypeValue(final int value) {
      bitField0_ |= 0x00000008;
      msgType = value;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 10;</code>
     * @param value the msgType to set
     * @return this
     */
    public Chat setMsgType(final MsgTypeOuterClass.MsgType value) {
      bitField0_ |= 0x00000008;
      msgType = value.getNumber();
      return this;
    }

    /**
     * <code>optional string text = 8;</code>
     * @return whether the text field is set
     */
    public boolean hasText() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional string text = 8;</code>
     * @return this
     */
    public Chat clearText() {
      bitField0_ &= ~0x00000010;
      text.clear();
      return this;
    }

    /**
     * <code>optional string text = 8;</code>
     * @return the text
     */
    public String getText() {
      return text.getString();
    }

    /**
     * <code>optional string text = 8;</code>
     * @return internal {@code Utf8String} representation of text for reading
     */
    public Utf8String getTextBytes() {
      return this.text;
    }

    /**
     * <code>optional string text = 8;</code>
     * @return internal {@code Utf8String} representation of text for modifications
     */
    public Utf8String getMutableTextBytes() {
      bitField0_ |= 0x00000010;
      return this.text;
    }

    /**
     * <code>optional string text = 8;</code>
     * @param value the text to set
     * @return this
     */
    public Chat setText(final CharSequence value) {
      bitField0_ |= 0x00000010;
      text.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string text = 8;</code>
     * @param value the text to set
     * @return this
     */
    public Chat setText(final Utf8String value) {
      bitField0_ |= 0x00000010;
      text.copyFrom(value);
      return this;
    }

    @Override
    public Chat copyFrom(final Chat other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        sentTime = other.sentTime;
        senderUid = other.senderUid;
        emote = other.emote;
        msgType = other.msgType;
        text.copyFrom(other.text);
      }
      return this;
    }

    @Override
    public Chat mergeFrom(final Chat other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasSentTime()) {
        setSentTime(other.sentTime);
      }
      if (other.hasSenderUid()) {
        setSenderUid(other.senderUid);
      }
      if (other.hasEmote()) {
        setEmote(other.emote);
      }
      if (other.hasMsgType()) {
        setMsgTypeValue(other.msgType);
      }
      if (other.hasText()) {
        getMutableTextBytes().copyFrom(other.text);
      }
      return this;
    }

    @Override
    public Chat clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      sentTime = 0L;
      senderUid = 0;
      emote = 0;
      msgType = 0;
      text.clear();
      return this;
    }

    @Override
    public Chat clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      text.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Chat)) {
        return false;
      }
      Chat other = (Chat) o;
      return bitField0_ == other.bitField0_
        && (!hasSentTime() || sentTime == other.sentTime)
        && (!hasSenderUid() || senderUid == other.senderUid)
        && (!hasEmote() || emote == other.emote)
        && (!hasMsgType() || msgType == other.msgType)
        && (!hasText() || text.equals(other.text));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt64NoTag(sentTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(emote);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(msgType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 66);
        output.writeStringNoTag(text);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(sentTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(emote);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(msgType);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(text);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Chat mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 120: {
            // sentTime
            sentTime = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // senderUid
            senderUid = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // emote
            emote = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // msgType
            final int value = input.readInt32();
            if (MsgTypeOuterClass.MsgType.forNumber(value) != null) {
              msgType = value;
              bitField0_ |= 0x00000008;
            }
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // text
            input.readString(text);
            bitField0_ |= 0x00000010;
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
        output.writeUInt64(FieldNames.sentTime, sentTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.senderUid, senderUid);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.emote, emote);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeEnum(FieldNames.msgType, msgType, MsgTypeOuterClass.MsgType.converter());
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeString(FieldNames.text, text);
      }
      output.endObject();
    }

    @Override
    public Chat mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1262226053:
          case 484784916: {
            if (input.isAtField(FieldNames.sentTime)) {
              if (!input.trySkipNullValue()) {
                sentTime = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 32180699:
          case 997911366: {
            if (input.isAtField(FieldNames.senderUid)) {
              if (!input.trySkipNullValue()) {
                senderUid = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 96633208: {
            if (input.isAtField(FieldNames.emote)) {
              if (!input.trySkipNullValue()) {
                emote = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1343750747:
          case -1283380936: {
            if (input.isAtField(FieldNames.msgType)) {
              if (!input.trySkipNullValue()) {
                final MsgTypeOuterClass.MsgType value = input.readEnum(MsgTypeOuterClass.MsgType.converter());
                if (value != null) {
                  msgType = value.getNumber();
                  bitField0_ |= 0x00000008;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3556653: {
            if (input.isAtField(FieldNames.text)) {
              if (!input.trySkipNullValue()) {
                input.readString(text);
                bitField0_ |= 0x00000010;
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
    public Chat clone() {
      return new Chat().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Chat parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Chat(), data).checkInitialized();
    }

    public static Chat parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Chat(), input).checkInitialized();
    }

    public static Chat parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Chat(), input).checkInitialized();
    }

    /**
     * @return factory for creating Chat messages
     */
    public static MessageFactory<Chat> getFactory() {
      return ChatFactory.INSTANCE;
    }

    private enum ChatFactory implements MessageFactory<Chat> {
      INSTANCE;

      @Override
      public Chat create() {
        return Chat.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName sentTime = FieldName.forField("sentTime", "sent_time");

      static final FieldName senderUid = FieldName.forField("senderUid", "sender_uid");

      static final FieldName emote = FieldName.forField("emote");

      static final FieldName msgType = FieldName.forField("msgType", "msg_type");

      static final FieldName text = FieldName.forField("text");
    }
  }
}
