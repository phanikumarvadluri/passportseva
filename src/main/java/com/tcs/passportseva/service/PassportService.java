package com.tcs.passportseva.service;


import com.tcs.passportseva.model.Passport;
import com.tcs.passportseva.repo.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportService {

    @Autowired
    PassportRepository passportRepository;


    public void save(Passport passport) {
        passportRepository.save(passport);

    }
}
