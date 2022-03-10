package com.PIDEV.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class Pidev1Application {
	@Autowired
    private JavaMailSender javaMailSender;
	public static void main(String[] args) {
		SpringApplication.run(Pidev1Application.class, args);
	}

	public void sendEmail() {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("romouad.1995@gmail.com");//normalement nhot liste lehné mais maandich liste mtaa lmails mtaa lusers
        msg.setSubject("New Event has been announced");
        msg.setText("A new event has been announced you can visit our website for more");

        javaMailSender.send(msg);

    }
}
