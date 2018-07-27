package ws;

import javax.xml.ws.Endpoint;

public class CountryPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/ws", new CountryImpl());

	}
}
