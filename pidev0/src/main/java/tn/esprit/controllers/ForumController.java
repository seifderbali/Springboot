package tn.esprit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.Forum;
import tn.esprit.services.ForumService;




	@RestController
	@RequestMapping("/Forum")
	public class ForumController {
		
	@Autowired
	ForumService Fs;

	@PostMapping("/addforum") 
	void add(@RequestBody Forum f)
	{
		if(Fs.swearAction(f.getContenu()) ==0) {
			Fs.addForum(f);
		}
		
	}
	@PutMapping("/updateforum/{id}")
	void update(@RequestBody Forum f)
	{
		Fs.updateForum(f);
	}
	@DeleteMapping("/deleteforum/{id}")
	void delete(@PathVariable("id") int id)
	{
		Fs.deleteForum(id);
	}
	@GetMapping("/displayforums")
	List<Forum> display()
	{
		return Fs.retreiveAllForums();
	}
	@GetMapping("/find/{id}")
	Forum find(@PathVariable("id") int id)
	{
		return Fs.retrieveForum(id);
	}
	
	@GetMapping("/search/{keyword}")
	List<Forum> search(@PathVariable("keyword") String keyword)
	{
		return Fs.searchForums(keyword);
	}
	
	@GetMapping("/test/{keyword}")
	String test(@PathVariable("keyword") String keyword)
	{
		return keyword;
	}
	@GetMapping("/stats/{id}")
	int stats(@PathVariable("id") int id)
	{
		return Fs.stats(id);
	}
	/*
	@GetMapping("/viral/{id}")
	int viral(@PathVariable("id") int id)
	{
		return Fs.viral(id);
	}*/
	}
