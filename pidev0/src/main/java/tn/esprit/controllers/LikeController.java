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

import tn.esprit.entities.Like;
import tn.esprit.services.LikeService;


	@RestController
	@RequestMapping("/Like")
	public class LikeController {

		@Autowired
		LikeService Ls;
		@PostMapping("/addlike") 
		void add(@RequestBody Like f)
		{
			Ls.addLike(f);
		}
		@PutMapping("/updatelike")
		void update(@RequestBody Like f)
		{
			Ls.updateLike(f);
		}
		@DeleteMapping("/deletelike/{id}")
		void delete(@PathVariable("id") int id)
		{
			Ls.deleteLike(id);
		}
		@GetMapping("/displaylike")
		List<Like> display()
		{
			return Ls.retreiveAllLikes();
		}
		@GetMapping("/find/{id}")
		Like find(@PathVariable("id") int id)
		{
			return Ls.retrieveLike(id);
		}
		}

