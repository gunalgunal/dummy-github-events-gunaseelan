package com.webhook.techstax.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

   private Logger logger= LoggerFactory.getLogger(WebhookController.class);
    @PostMapping("/webhook")
    public ResponseEntity<String> getDataFromGithub(@RequestBody String data)
    {
        logger.info("webhook:"+data);
        return new ResponseEntity<String>(data, HttpStatus.OK);
    }
}
