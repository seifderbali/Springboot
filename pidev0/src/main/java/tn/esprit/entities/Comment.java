package tn.esprit.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name = "comment")
	public class Comment {

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private Long id; 
		@Column(name="contenu")
		private String contenu; 
		@Column(name="date")
		private Date date; 
		@Column(name="userid")
		private Long userid; 
		
		@ManyToOne(cascade = CascadeType.ALL)
		private Forum forum;
		@OneToMany(cascade = CascadeType.ALL,mappedBy="like")
		private Set<Like> like;
		
		
		public long Getid() {
			return id;
		}
		public void Setid(long id) {
			this.id = id;
		}
		public String GetContenu() {
			return contenu;
		}
		public void SetContenu(String contenu) {
			this.contenu = contenu;
		}
		public Date GetDate() {
			return date;
		}
		public void SetDate(Date date) {
			this.date = date;
		}
		public Long GetUserid() {
			return userid;
		}
		public void SetUserid(Long userid) {
			this.userid = userid;
		}
		
		

		public Comment(long id, String contenu, Date date, long userid){
			this.id = id;
			this.contenu = contenu;
			this.date = date;
			this.userid = userid;

		}}
