package services;
import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.Operations;
import metier.Releve;

@WebService(serviceName = "ReleveServicesWS")
public class ReleveServices {

	@WebMethod(operationName = "getReleve")
	public Releve getReleve() {
		return new methodsReleve().getReleve();
	}
	
	@WebMethod(operationName = "getOperations")
	public Operations getOperations() {
		return new methodsReleve().getOperations();
	}
	
	@WebMethod(operationName = "test")
	public String test() {
		return "hello world";
	}


}
