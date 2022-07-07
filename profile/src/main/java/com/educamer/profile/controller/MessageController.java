package com.educamer.profile.controller;

import com.educamer.profile.entity.Message;
import com.educamer.profile.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(path = "/messages")
    public List<Message> getAllMessage(){
        return messageService.getAllMessage();
    }

    @GetMapping(path = "/message/{id}")
    public Message getAllMessage(@PathVariable Long id){
        return messageService.getMessageById(id);
    }

    @PostMapping(path = "/")
    public void addMessage(@RequestBody Message message){
        messageService.addMessage(message);
    }
}
