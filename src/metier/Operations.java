package metier;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Operationnnn") // Permet de générer un fichier xml apr's la serialisation
@XmlAccessorType(XmlAccessType.FIELD) // pour déplaer les annotations sur les attribut pas sur les getter et setter
public class Operations {
@XmlAttribute
	private String dateDebut;
@XmlAttribute
	private String dateFin;

@XmlElement
private List<Operation>  operation;

public String getDateDebut() {
	return dateDebut;
}

public void setDateDebut(String dateDebut) {
	this.dateDebut = dateDebut;
}

public String getDateFin() {
	return dateFin;
}

public void setDateFin(String dateFin) {
	this.dateFin = dateFin;
}

public List<Operation> getOperation() {
	return operation;
}

public void setOperation(List<Operation> lp) {
	this.operation = lp;
}

public Operations(String dateDebut, String dateFin, List<Operation> operation) {
	super();
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.operation = operation;
}

public Operations() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Operation [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", operation=" + operation
			+ ", getDateDebut()=" + getDateDebut() + ", getDateFin()=" + getDateFin() + ", getOperation()="
			+ getOperation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


	
}
