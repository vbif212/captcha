package com.capthca.controllers;

import com.capthca.Responses.RegisterResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptchaController {

    @PostMapping("/captcha/register")
    public RegisterResponse register(){
        return new RegisterResponse();
    }

}
