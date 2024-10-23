package com.tcs.passportseva.controller;


import com.tcs.passportseva.model.Passport;
import com.tcs.passportseva.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassportController {

    @Autowired
    PassportService passportService;


    @PostMapping("/passport")
    public void save(@RequestBody  Passport passport)
    {
        passportService.save(passport);
    }
}
