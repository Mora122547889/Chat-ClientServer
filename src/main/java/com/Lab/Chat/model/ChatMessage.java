package com.Lab.Chat.model;

import lombok.Data;

@Data
public class ChatMessage {
    private String content;
    private String sender;
}