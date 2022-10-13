package com.controller;

import com.model.Message;
import com.repository.RepositoryMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    RepositoryMessage repositoryMessage;

    @PostMapping(value = "/sendMessage")
    public void sendMessage(Message message){
        //repositoryMessage. вытащим все сообщения или по id ?
    }
}
