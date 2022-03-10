package com.PIDEV.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events_table",catalog= "event_database")
public class Event {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id_event; 
	private String name_event;
	private LocalDate Date_event; 
	private String Location;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId_event() {
		return Id_event;
	}
	public void setId_event(int id_event) {
		Id_event = id_event;
	}
	public String getName_event() {
		return name_event;
	}
	public void setName_event(String name_event) {
		this.name_event = name_event;
	}
	public LocalDate getDate_event() {
		return Date_event;
	}
	public void setDate_event(LocalDate date_event) {
		Date_event = date_event;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	} 

}
