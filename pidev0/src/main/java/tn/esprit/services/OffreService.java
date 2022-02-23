package tn.esprit.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Offre;
import tn.esprit.repositories.OffreRepository;


@Service
public class OffreService implements IOffreService{


@Autowired 
OffreRepository offreReposiory;


@Override
public List<Offre> retreiveAllOffres() {
	List<Offre> listOffres = new ArrayList<Offre>();
	try {
		listOffres = (List<Offre>) offreReposiory.findAll();
		for(Offre f : listOffres)
		{
			 System.out.println("user = "+f);
			f.getCollaboration().setOffre(null);
		}}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}
	 
		return listOffres;
}

@Override
public Offre addOffre(Offre f) {
	try
	{
		offreReposiory.save(f);
	}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f;
}

@Override
public void deleteOffre(long id) {
	try{
	//	Long idl = Long.parseLong(id);
		offreReposiory.deleteById(id);
		}
		catch(Exception e)
		{
			 System.out.println("error = "+e);
		}	
}

@Override
public Offre updateOffre(Offre f) {
	try
	{
		offreReposiory.save(f);
	}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f;
}

@Override
public Offre retrievOffre(long id) {
	Offre f = new Offre();
	try{

	 f = offreReposiory.findById(id).get();
		f.getCollaboration().setOffre(null);

		}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f ;
   }
}
