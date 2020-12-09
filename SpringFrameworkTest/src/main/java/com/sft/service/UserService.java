package com.sft.service;

public class UserService {
    private MailService mailService;

    public void setMailService(MailService mailService) {
        this.mailService =mailService;
    }
    public void printUser(){
        mailService.printMail();
        System.out.println("user");
    }
}
