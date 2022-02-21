package com.demo_bank_v1.DemoBank_v1.config;

import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class MailConfig {
    public static JavaMailSenderImpl getMailConfig() {
        JavaMailSenderImpl emailConfig = new JavaMailSenderImpl();

        // Setting up properties:
        Properties props = emailConfig.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        // Set Mail Credentials:
        emailConfig.setHost("localhost");
        emailConfig.setPort(25);
        emailConfig.setUsername("no-reply@gmail.com");
        emailConfig.setPassword("password4321");
        return emailConfig;
    }
}
