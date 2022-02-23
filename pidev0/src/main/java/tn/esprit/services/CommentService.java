package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Comment;
import tn.esprit.repositories.CommentRepository;


@Service
public class CommentService implements ICommentService {


@Autowired 
CommentRepository commentReposiory;

@Override
public List<Comment> retreiveAllComments() {
	List<Comment> listComments = new ArrayList<Comment>();
	try {
		listComments = (List<Comment>) commentReposiory.findAll();
		for(Comment f : listComments)
		{
			f.getForum().setComment(null);
			 System.out.println("user = "+f);
		}}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}
	 
		return listComments;
}

@Override
public Comment addComment(Comment f) {
	try
	{
	commentReposiory.save(f);
	}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f;
}

@Override
public void deleteComment(long id) {
	try{
		//	Long idl = Long.parseLong(id);
			commentReposiory.deleteById(id);
			}
			catch(Exception e)
			{
				 System.out.println("error = "+e);
			}	
	
}

@Override
public Comment updateComment(Comment f) {
	try
	{
	commentReposiory.save(f);
	}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f;
}

@Override
public Comment retrieveComment(long id) {
	Comment f = new Comment();
	try{
	//	f.getForum().setComment(null);
	 f = commentReposiory.findById(id).get();
		}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f ;
   }
}

