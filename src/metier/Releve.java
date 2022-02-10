package metier;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Releve") // Permet de générer un fichier xml apr's la serialisation
@XmlAccessorType(XmlAccessType.FIELD) // pour déplaer les annotations sur les attribut pas sur les getter et setter
public class Releve {
	@XmlAttribute
	private String RIB;
	@XmlElement
	private String dateReleve;
	@XmlElement
	private double solde;
	@XmlElement
	private Operations Operations;
	public String getRIB() {
		return RIB;
	}
	public void setRIB(String rIB) {
		RIB = rIB;
	}
	public String getDateReleve() {
		return dateReleve;
	}
	public void setDateReleve(String dateReleve) {
		this.dateReleve = dateReleve;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Operations getOperations() {
		return Operations;
	}
	public void setOperations(Operations operations) {
		Operations = operations;
	}
	public Releve(String rIB, String dateReleve, double solde, Operations operations) {
		super();
		RIB = rIB;
		this.dateReleve = dateReleve;
		this.solde = solde;
		Operations = operations;
	}
	public Releve() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
