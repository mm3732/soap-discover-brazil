package ws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CountryClient {

	public static void main(String args[]) throws Exception {

		URL url = new URL("http://127.0.0.1:9876/ws?wsdl");
		QName qname = new QName("http://ws/", "CountryImplService");
		Service ws = Service.create(url, qname);

		Country country = ws.getPort(Country.class);

		System.out.println(country.getCapital("S�o Paulo"));
		System.out.println(country.getDistricts("S�o Paulo"));
		System.out.println(country.getLanguages("S�o Paulo"));
		System.out.println(country.getAirports("S�o Paulo"));
		System.err.println(country.getPlacesToVisit("S�o Paulo"));
		System.out.println(country.getInterestingFacts("S�o Paulo"));

		System.out.println(country.getCapital("Bahia"));
		System.out.println(country.getDistricts("Bahia"));
		System.out.println(country.getLanguages("Bahia"));
		System.out.println(country.getAirports("Bahia"));
		System.err.println(country.getPlacesToVisit("Bahia"));
		System.out.println(country.getInterestingFacts("Bahia"));

	}
}
