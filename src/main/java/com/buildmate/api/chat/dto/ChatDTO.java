package com.buildmate.api.chat.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatDTO {
    public enum MessageType {
        ENTER, TALK
    }

    private MessageType type;   //메시지 타임
    private String roomId;      //방 번호
    private String sender;      //채팅을 보낸 사람
    private String message;     //메세지
    private String time;        //채팅 발송 시간간
}
