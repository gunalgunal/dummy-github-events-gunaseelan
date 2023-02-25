package com.webhook.techstax.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {


    @PostMapping("/webhook")
    public ResponseEntity<String> getDataFromGithub(@RequestBody String data)
    {
        System.out.println(data);
        return new ResponseEntity<String>(data, HttpStatus.OK);
    }
}
