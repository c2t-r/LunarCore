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
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.Utf8String;

public final class SendMsgCsReqOuterClass {
  /**
   * Protobuf type {@code SendMsgCsReq}
   */
  public static final class SendMsgCsReq extends ProtoMessage<SendMsgCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 emote = 12;</code>
     */
    private int emote;

    /**
     * <code>optional .MsgType msg_type = 11;</code>
     */
    private int msgType;

    /**
     * <code>optional .ChatType chat_type = 15;</code>
     */
    private int chatType;

    /**
     * <code>optional string text = 2;</code>
     */
    private final Utf8String text = Utf8String.newEmptyInstance();

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     */
    private final RepeatedInt toUidList = RepeatedInt.newEmptyInstance();

    private SendMsgCsReq() {
    }

    /**
     * @return a new empty instance of {@code SendMsgCsReq}
     */
    public static SendMsgCsReq newInstance() {
      return new SendMsgCsReq();
    }

    /**
     * <code>optional uint32 emote = 12;</code>
     * @return whether the emote field is set
     */
    public boolean hasEmote() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 emote = 12;</code>
     * @return this
     */
    public SendMsgCsReq clearEmote() {
      bitField0_ &= ~0x00000001;
      emote = 0;
      return this;
    }

    /**
     * <code>optional uint32 emote = 12;</code>
     * @return the emote
     */
    public int getEmote() {
      return emote;
    }

    /**
     * <code>optional uint32 emote = 12;</code>
     * @param value the emote to set
     * @return this
     */
    public SendMsgCsReq setEmote(final int value) {
      bitField0_ |= 0x00000001;
      emote = value;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 11;</code>
     * @return whether the msgType field is set
     */
    public boolean hasMsgType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .MsgType msg_type = 11;</code>
     * @return this
     */
    public SendMsgCsReq clearMsgType() {
      bitField0_ &= ~0x00000002;
      msgType = 0;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 11;</code>
     * @return the msgType
     */
    public MsgTypeOuterClass.MsgType getMsgType() {
      return MsgTypeOuterClass.MsgType.forNumber(msgType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SendMsgCsReq#getMsgType()}.getNumber().
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
     * can cause {@link SendMsgCsReq#getMsgType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SendMsgCsReq setMsgTypeValue(final int value) {
      bitField0_ |= 0x00000002;
      msgType = value;
      return this;
    }

    /**
     * <code>optional .MsgType msg_type = 11;</code>
     * @param value the msgType to set
     * @return this
     */
    public SendMsgCsReq setMsgType(final MsgTypeOuterClass.MsgType value) {
      bitField0_ |= 0x00000002;
      msgType = value.getNumber();
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 15;</code>
     * @return whether the chatType field is set
     */
    public boolean hasChatType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .ChatType chat_type = 15;</code>
     * @return this
     */
    public SendMsgCsReq clearChatType() {
      bitField0_ &= ~0x00000004;
      chatType = 0;
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 15;</code>
     * @return the chatType
     */
    public ChatTypeOuterClass.ChatType getChatType() {
      return ChatTypeOuterClass.ChatType.forNumber(chatType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SendMsgCsReq#getChatType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getChatTypeValue() {
      return chatType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link ChatTypeOuterClass.ChatType}. Setting an invalid value
     * can cause {@link SendMsgCsReq#getChatType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SendMsgCsReq setChatTypeValue(final int value) {
      bitField0_ |= 0x00000004;
      chatType = value;
      return this;
    }

    /**
     * <code>optional .ChatType chat_type = 15;</code>
     * @param value the chatType to set
     * @return this
     */
    public SendMsgCsReq setChatType(final ChatTypeOuterClass.ChatType value) {
      bitField0_ |= 0x00000004;
      chatType = value.getNumber();
      return this;
    }

    /**
     * <code>optional string text = 2;</code>
     * @return whether the text field is set
     */
    public boolean hasText() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional string text = 2;</code>
     * @return this
     */
    public SendMsgCsReq clearText() {
      bitField0_ &= ~0x00000008;
      text.clear();
      return this;
    }

    /**
     * <code>optional string text = 2;</code>
     * @return the text
     */
    public String getText() {
      return text.getString();
    }

    /**
     * <code>optional string text = 2;</code>
     * @return internal {@code Utf8String} representation of text for reading
     */
    public Utf8String getTextBytes() {
      return this.text;
    }

    /**
     * <code>optional string text = 2;</code>
     * @return internal {@code Utf8String} representation of text for modifications
     */
    public Utf8String getMutableTextBytes() {
      bitField0_ |= 0x00000008;
      return this.text;
    }

    /**
     * <code>optional string text = 2;</code>
     * @param value the text to set
     * @return this
     */
    public SendMsgCsReq setText(final CharSequence value) {
      bitField0_ |= 0x00000008;
      text.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string text = 2;</code>
     * @param value the text to set
     * @return this
     */
    public SendMsgCsReq setText(final Utf8String value) {
      bitField0_ |= 0x00000008;
      text.copyFrom(value);
      return this;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     * @return whether the toUidList field is set
     */
    public boolean hasToUidList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     * @return this
     */
    public SendMsgCsReq clearToUidList() {
      bitField0_ &= ~0x00000010;
      toUidList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableToUidList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getToUidList() {
      return toUidList;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableToUidList() {
      bitField0_ |= 0x00000010;
      return toUidList;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     * @param value the toUidList to add
     * @return this
     */
    public SendMsgCsReq addToUidList(final int value) {
      bitField0_ |= 0x00000010;
      toUidList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 to_uid_list = 10;</code>
     * @param values the toUidList to add
     * @return this
     */
    public SendMsgCsReq addAllToUidList(final int... values) {
      bitField0_ |= 0x00000010;
      toUidList.addAll(values);
      return this;
    }

    @Override
    public SendMsgCsReq copyFrom(final SendMsgCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        emote = other.emote;
        msgType = other.msgType;
        chatType = other.chatType;
        text.copyFrom(other.text);
        toUidList.copyFrom(other.toUidList);
      }
      return this;
    }

    @Override
    public SendMsgCsReq mergeFrom(final SendMsgCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEmote()) {
        setEmote(other.emote);
      }
      if (other.hasMsgType()) {
        setMsgTypeValue(other.msgType);
      }
      if (other.hasChatType()) {
        setChatTypeValue(other.chatType);
      }
      if (other.hasText()) {
        getMutableTextBytes().copyFrom(other.text);
      }
      if (other.hasToUidList()) {
        getMutableToUidList().addAll(other.toUidList);
      }
      return this;
    }

    @Override
    public SendMsgCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      emote = 0;
      msgType = 0;
      chatType = 0;
      text.clear();
      toUidList.clear();
      return this;
    }

    @Override
    public SendMsgCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      text.clear();
      toUidList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SendMsgCsReq)) {
        return false;
      }
      SendMsgCsReq other = (SendMsgCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasEmote() || emote == other.emote)
        && (!hasMsgType() || msgType == other.msgType)
        && (!hasChatType() || chatType == other.chatType)
        && (!hasText() || text.equals(other.text))
        && (!hasToUidList() || toUidList.equals(other.toUidList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 88);
        output.writeEnumNoTag(msgType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeEnumNoTag(chatType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 18);
        output.writeStringNoTag(text);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < toUidList.length(); i++) {
          output.writeRawByte((byte) 80);
          output.writeUInt32NoTag(toUidList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(msgType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(chatType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(text);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * toUidList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(toUidList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SendMsgCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // emote
            emote = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // msgType
            final int value = input.readInt32();
            if (MsgTypeOuterClass.MsgType.forNumber(value) != null) {
              msgType = value;
              bitField0_ |= 0x00000002;
            }
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // chatType
            final int value = input.readInt32();
            if (ChatTypeOuterClass.ChatType.forNumber(value) != null) {
              chatType = value;
              bitField0_ |= 0x00000004;
            }
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // text
            input.readString(text);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // toUidList [packed=true]
            input.readPackedUInt32(toUidList, tag);
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
          case 80: {
            // toUidList [packed=false]
            tag = input.readRepeatedUInt32(toUidList, tag);
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.emote, emote);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.msgType, msgType, MsgTypeOuterClass.MsgType.converter());
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.chatType, chatType, ChatTypeOuterClass.ChatType.converter());
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeString(FieldNames.text, text);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedUInt32(FieldNames.toUidList, toUidList);
      }
      output.endObject();
    }

    @Override
    public SendMsgCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 96633208: {
            if (input.isAtField(FieldNames.emote)) {
              if (!input.trySkipNullValue()) {
                emote = input.readUInt32();
                bitField0_ |= 0x00000001;
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
          case 1437412018:
          case 1620118465: {
            if (input.isAtField(FieldNames.chatType)) {
              if (!input.trySkipNullValue()) {
                final ChatTypeOuterClass.ChatType value = input.readEnum(ChatTypeOuterClass.ChatType.converter());
                if (value != null) {
                  chatType = value.getNumber();
                  bitField0_ |= 0x00000004;
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
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2098685421:
          case 1162351729: {
            if (input.isAtField(FieldNames.toUidList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(toUidList);
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
    public SendMsgCsReq clone() {
      return new SendMsgCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SendMsgCsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SendMsgCsReq(), data).checkInitialized();
    }

    public static SendMsgCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SendMsgCsReq(), input).checkInitialized();
    }

    public static SendMsgCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SendMsgCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SendMsgCsReq messages
     */
    public static MessageFactory<SendMsgCsReq> getFactory() {
      return SendMsgCsReqFactory.INSTANCE;
    }

    private enum SendMsgCsReqFactory implements MessageFactory<SendMsgCsReq> {
      INSTANCE;

      @Override
      public SendMsgCsReq create() {
        return SendMsgCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName emote = FieldName.forField("emote");

      static final FieldName msgType = FieldName.forField("msgType", "msg_type");

      static final FieldName chatType = FieldName.forField("chatType", "chat_type");

      static final FieldName text = FieldName.forField("text");

      static final FieldName toUidList = FieldName.forField("toUidList", "to_uid_list");
    }
  }
}
