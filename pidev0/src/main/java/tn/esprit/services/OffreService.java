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

		}
	catch(Exception e)
	{
		 System.out.println("error = "+e);
	}
	return f ;
   }

@Override
public int notstarted(int id) {
	return offreReposiory.notstarted(id);
}

@Override
public int finished(int id) {
	return offreReposiory.finished(id);
}

@Override
public int inprogress(int id) {
	return offreReposiory.inprogress(id);
}

@Override
public String available(int id) {
	int ns=offreReposiory.notstarted(id);
	int f=offreReposiory.finished(id);
	int ip=offreReposiory.inprogress(id);
	float pns= ((float)ns/((float)f+(float)ip+(float)ns))*100;
	float pf= ((float)f/((float)f+(float)ip+(float)ns))*100;
	float pip= ((float)ip/((float)f+(float)ip+(float)ns))*100;
	String sns=String.valueOf(ns);
	String sf=String.valueOf(f);
	String sip=String.valueOf(ip);
	String t=String.valueOf(offreReposiory.total(id));

	
	return "Offres Not Started : "+sns+"  :   "+String.valueOf((int)pns)+"%    Offres In Progress : "+sip+"  :  "+String.valueOf((int)pip)+"%"+"%    Offres Finished : "+sf+"  :  "+String.valueOf((int)pf)+"% "+ "\n" +" Total Offers : "+t;
}
}
