package com.educamer.profile.service;

import com.educamer.profile.entity.Message;
import com.educamer.profile.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> getAllMessage() {
        List<Message> listMessage = messageRepository.findAll();
        return listMessage;
    }

    @Override
    public void addMessage(Message message) {
        messageRepository.save(message);
    }
}
