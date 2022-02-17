package tn.esprit.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "offre")
public class Offre {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id; 
	@Column(name="nom")
	private String nom; 
	@Column(name="description")
	private String description; 
	@Column(name="startDate")
	private Date startDate; 
	@Column(name="endDate")
	private Date endDate; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Collaboration collaboration;
	
	
	public long GetId() {
		return id;
	}
	public void SetId(long id) {
		this.id = id;
	}
	public String GetNom() {
		return nom;
	}
	public void SetNom(String nom) {
		this.nom = nom;
	}
	public String GetDescription() {
		return description;
	}
	public void SetDescription(String description) {
		this.description = description;
	}
	public Date GetStartDate() {
		return startDate;
	}
	public void SetStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date GetEndDate() {
		return endDate;
	}
	public void SetEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

	public Offre(long id, String nom, String description, Date startDate, Date endDate){
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;


	}
	}