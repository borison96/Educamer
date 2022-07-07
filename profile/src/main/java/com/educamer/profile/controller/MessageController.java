package com.educamer.profile.controller;

import com.educamer.profile.entity.Message;
import com.educamer.profile.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(path = "/messages")
    public List<Message> getAllMessage(){
        return messageService.getAllMessage();
    }

    @PostMapping(path = "/")
    public void addMessage(@RequestBody Message message){
        messageService.addMessage(message);
    }
}
