package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Forum;
import tn.esprit.repositories.ForumRepository;

@Slf4j
@Service
public class ForumService implements IForumService{


@Autowired 
ForumRepository forumReposiory;


@Override
public List<Forum> retreiveAllForums() {
	List<Forum> listForums = new ArrayList<Forum>();
	try {
		listForums = (List<Forum>) forumReposiory.findAll();
		for(Forum f : listForums)
		{
			f.setComment(null);
			log.info("user = "+f);
		}}
		catch(Exception e)
		{
			log.info("error = "+e);
		}
	 
		return listForums;
}

@Override
public Forum addForum(Forum f) {
	try
	{
	forumReposiory.save(f);
	}
	catch(Exception e)
	{
		 log.info("error = "+e);
	}
	return f;
}

@Override
public void deleteForum(long id) {
	try{
	//	Long idl = Long.parseLong(id);
		forumReposiory.deleteById(id);
		}
		catch(Exception e)
		{
			log.info("error = "+e);
		}	
}

@Override
public Forum updateForum(Forum f) {
	try
	{
	forumReposiory.save(f);
	}
	catch(Exception e)
	{
		log.info("error = "+e);
	}
	return f;
}

@Override
public Forum retrieveForum(long id) {
	Forum f = new Forum();
	try{
		f.setComment(null);
	 f = forumReposiory.findById(id).get();
		}
	catch(Exception e)
	{
		log.info("error = "+e);
	}
	return f ;
   }
}
