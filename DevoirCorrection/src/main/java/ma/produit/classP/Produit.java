package ma.produit.classP;


import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String ref ;
	@Column(length=150)
	private String CptDep ;
	@Column(length=150)
	private String CptCred ;
	@Column(length=150)
	private String type ;
	@Column(length=150)
	private String date ;
	private Double Montant ;

	public String getRef() {
		return ref;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getCptDep() {
		return CptDep;
	}
	public void setCptDep(String cptDep) {
		CptDep = cptDep;
	}
	public String getCptCred() {
		return CptCred;
	}
	public void setCptCred(String cptCred) {
		CptCred = cptCred;
	}
	public Double getMontant() {
		return Montant;
	}
	public void setMontant(Double montant) {
		Montant = montant;
	}
	public Produit(String ref, String cptDep, String cptCred, Double montant) {
		super();
		this.ref = ref;
		CptDep = cptDep;
		CptCred = cptCred;
		Montant = montant;

		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
		this.date = format.format(d);
		if(this.CptDep.subSequence(0, 3).equals(this.CptCred.subSequence(0, 3))){
			this.type = "VIRINT";
		}else {
			this.type = "VIRCHA";
		}

	}




}
