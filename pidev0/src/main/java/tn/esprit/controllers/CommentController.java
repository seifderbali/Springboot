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

import tn.esprit.entities.Comment;
import tn.esprit.services.CommentService;

@RestController
@RequestMapping("/Comment")
public class CommentController {

	@Autowired
	CommentService Cs;
	@PostMapping("/addcomment") 
	void add(@RequestBody Comment f)
	{
		Cs.addComment(f);
	}
	@PutMapping("/updatecomment")
	void update(@RequestBody Comment f)
	{
		Cs.updateComment(f);
	}
	@DeleteMapping("/deletecomment/{id}")
	void delete(@PathVariable("id") int id)
	{
		Cs.deleteComment(id);
	}
	@GetMapping("/displaycomment")
	List<Comment> display()
	{
		return Cs.retreiveAllComments();
	}
	@GetMapping("/find/{id}")
	Comment find(@PathVariable("id") int id)
	{
		return Cs.retrieveComment(id);
	}
	}



