package tn.esprit.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "like")
	public class Like {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Long id; 
		@Column(name="etat")
		private int etat; 
		@Column(name="userid")
		private Long userid; 
	
		@ManyToOne(cascade = CascadeType.ALL)
		private Comment comment;
		
		
		public long Getid() {
			return id;
		}
		public void Setid(long id) {
			this.id = id;
		}
		public int GetEtat() {
			return etat;
		}
		public void SetEtat(int etat) {
			this.etat = etat;
		}
		public Long GetUserid() {
			return userid;
		}
		public void SetUserid(Long userid) {
			this.userid = userid;
		}
		
		

		public Like(long id, int etat, long userid){
			this.id = id;
			this.etat = etat;
			this.userid = userid;

		}}

