package tn.esprit.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





	@Entity
	@Table(name = "collaboratoin")
	public class Collaboration {
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Long id; 
		@Column(name="nom")
		private String nom; 
		@Column(name="date")
		private Date date; 
		
		@OneToMany(cascade = CascadeType.ALL,mappedBy="offre")
		private Set<Offre> offre;
		
		
		public long Getid() {
			return id;
		}
		public void Setid(long id) {
			this.id = id;
		}
		public String Getnom() {
			return nom;
		}
		public void Setnom(String nom) {
			this.nom = nom;
		}
		public Date GetDate() {
			return date;
		}
		public void SetDate(Date date) {
			this.date = date;
		}
		
		

		public Collaboration(long id, String nom, Date date){
			this.id = id;
			this.nom = nom;
			this.date = date;

		}


}
