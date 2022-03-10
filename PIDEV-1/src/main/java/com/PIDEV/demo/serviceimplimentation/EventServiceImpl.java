package com.PIDEV.demo.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PIDEV.demo.model.Event;
import com.PIDEV.demo.repo.eventRepo;
import com.PIDEV.demo.serviceinterface.EventsInterface;

@Service

public class EventServiceImpl implements EventsInterface  {
	@Autowired
	private  eventRepo eventrepo;
	@Override
	public Event saveEvent(Event event) {
		// TODO Auto-generated method stub
		return eventrepo.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventrepo.save(event);
	}
// same methode used in both saving and updating the event
	@Override
	public List<Event> findAllEvents() {
		// TODO Auto-generated method stub
		//this methode returns a list 
		return (List<Event>) eventrepo.findAll();
	}

	@Override
	public void deleteEvent(int id) {
		// TODO Auto-generated method stub
		//to delete student
		eventrepo.deleteById(id);
		
	}
 
}
