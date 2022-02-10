package services;

import java.util.ArrayList;

import metier.Operation;
import metier.Operations;
import metier.Releve;

public class methodsReleve {
	public Releve getReleve() {
		Releve Re = new Releve();
		Re.setRIB("011112222333344445555666");
		Re.setSolde(14500);
		Re.setDateReleve("01-01-2021");

		Operations Op = new Operations();
		Op.setDateDebut("01-01-2021");
		Op.setDateFin("2021-01-30");

		ArrayList<Operation> Lp = new ArrayList<Operation>();
		Lp.add(new Operation("CREDIT", "2021-01-01", 9000, "Vers Espèce"));
		Lp.add(new Operation("DEBIT", "2021-01-01", 7000, "CHEQUE"));

		Op.setOperation(Lp);
		Re.setOperations(Op);
		return Re;
	}

	public Operations getOperations() {
		Operations Op = new Operations();
		Op.setDateDebut("01-01-2098");
		Op.setDateFin("2021-01-30");

		ArrayList<Operation> Lp = new ArrayList<Operation>();
		Lp.add(new Operation("CREDIT", "2021-01-01", 9000, "Vers Espèce"));
		Lp.add(new Operation("DEBIT", "2021-01-01", 7000, "CHEQUE"));

		Op.setOperation(Lp);
		return Op;
	}
}
