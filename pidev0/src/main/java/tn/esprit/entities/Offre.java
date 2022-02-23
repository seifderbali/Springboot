package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "offre")
public class Offre implements Serializable{

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id; 
	@Column(name="nom")
	private String nom; 
	@Column(name="description")
	private String description; 
	@Column(name="startDate")
	@Temporal(TemporalType.DATE)
	private Date startDate; 
	@Column(name="endDate")
	@Temporal(TemporalType.DATE)
	private Date endDate; 
	
	
	
	@ManyToOne
	private Collaboration collaboration;
	
	

	}