package com.educamer.profile.service;

import com.educamer.profile.entity.Message;

import java.util.List;

public interface MessageService {

    public List<Message> getAllMessage();

    public void addMessage(Message message);
}
