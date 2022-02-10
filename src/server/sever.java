package server;

import javax.xml.ws.Endpoint;

import services.ReleveServices;

public class sever {
	
	public static void main(String[] args) {
		String url = "http://0.0.0.0:8888/";
		Endpoint.publish(url, new ReleveServices());
		System.out.println("Web service déployé sur : " + url);
	}

}
