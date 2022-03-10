package com.PIDEV.demo.serviceinterface;

import java.util.List;

import com.PIDEV.demo.model.Event;

public interface EventsInterface {
 // to save new event
	public Event saveEvent(Event event);
	//to update Event
	public Event updateEvent(Event event); 
	// to fetch all students from database
	public List<Event> findAllEvents();
	//to delete event
	public void deleteEvent(int id);
	
}
