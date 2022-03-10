package com.PIDEV.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PIDEV.demo.Pidev1Application;
import com.PIDEV.demo.model.Event;
import com.PIDEV.demo.serviceimplimentation.EventServiceImpl;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@RestController
// this method uses Postman to do operations for that adding cross origin annotation is needed 
@CrossOrigin("*")
public class HomeController {
@Autowired
private EventServiceImpl eventServiceImpl;
@PostMapping(value="saveEvent")
public Event saveEvent (@RequestBody Event event)
{
	System.out.println("studentsaving works properly");
	eventServiceImpl.saveEvent(event);
return event; 	
}
@GetMapping(value = "getAllEvents")
public List<Event> findAllEvents(){
	System.out.println("all records are being displayed on postman successfuly");
	return eventServiceImpl.findAllEvents();
}
@PutMapping("updateEvent")
public Event updateEvent(@RequestBody Event event) {
	return eventServiceImpl.updateEvent(event);
}
@DeleteMapping("deleteEvent")
public String deleteEvent(@RequestParam int id) {
	eventServiceImpl.deleteEvent(id);
	return "student with id :"+id+" has been deleted" ;
}
@Autowired
Pidev1Application sendingEmailApplication;

@GetMapping(value = "/sendemail")
public String send() throws AddressException, MessagingException, IOException {
	sendingEmailApplication.sendEmail();
	
   return "Email sent successfully";   
}
}
