package com.example.acmeweb.app;

import acme.email.EmailService;
import acme.sms.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserRechargeNoticeService {
    private final SmsService smsService;
    private final EmailService emailService;

    public UserRechargeNoticeService(SmsService smsService, EmailService emailService) {
        this.smsService = smsService;
        this.emailService = emailService;
    }

    public void sendNotice(String phone, String msg){
        if(!smsService.send(phone, msg)){
            emailService.send(phone, msg);//ignore fail
        }
    }

}
