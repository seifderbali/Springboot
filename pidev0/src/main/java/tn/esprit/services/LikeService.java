package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Like;
import tn.esprit.repositories.LikeRepository;

@Service
public class LikeService implements ILikeService {

@Autowired 
	LikeRepository likeReposiory;

	@Override
	public List<Like> retreiveAllLikes() {
		List<Like> listLikes = new ArrayList<Like>();
		try {
			listLikes = (List<Like>) likeReposiory.findAll();
			for(Like f : listLikes)
			{
				f.getComment().setLike(null);;		
				 System.out.println("user = "+f);
			}}
			catch(Exception e)
			{
				 System.out.println("error = "+e);
			}
		 
			return listLikes;
	}

	@Override
	public Like addLike(Like f) {
		try
		{
			likeReposiory.save(f);
		}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}
		return f;
	}
	

	@Override
	public void deleteLike(long id) {
		
			try{
			//	Long idl = Long.parseLong(id);
				likeReposiory.deleteById(id);
				}
				catch(Exception e)
				{
					 System.out.println("error = "+e);
				}	
		
	}

	@Override
	public Like updateLike(Like f) {
		try
		{
		likeReposiory.save(f);
		}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}
		return f;
	}

	@Override
	public Like retrieveLike(long id) {
		Like f = new Like();
		try {
			//f.getComment().setLike(null);;		
		 f = likeReposiory.findById(id).get();
			}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}
		return f ;
	   }
	}

