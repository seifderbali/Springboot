package tn.esprit.services;

import java.util.List;

import tn.esprit.entities.Offre;

public interface IOffreService {
		List<Offre> retreiveAllOffres();
		Offre addOffre(Offre f);
		void deleteOffre(long id);
		Offre updateOffre(Offre f);
		Offre retrievOffre(long id);
}
