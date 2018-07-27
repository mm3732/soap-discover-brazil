package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Country {

	@WebMethod
	String getCapital(String s);

	@WebMethod
	String getLanguages(String s);

	@WebMethod
	String getAirports(String s);

	@WebMethod
	int getDistricts(String s);

	@WebMethod
	String getPlacesToVisit(String s);

	@WebMethod
	String getInterestingFacts(String s);

}
