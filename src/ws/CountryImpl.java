package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "ws.Country")
public class CountryImpl implements Country {

	private Utility states;

	public CountryImpl() {
		states = new Utility();
		states.loadData();
	}

	@Override
	@WebMethod
	public String getCapital(String stateName) {
		return states.getState(stateName).getCapital();
	}

	@Override
	@WebMethod
	public String getLanguages(String stateName) {
		return states.getState(stateName).getLanguages();
	}

	@Override
	@WebMethod
	public String getAirports(String stateName) {
		return states.getState(stateName).getAirports();
	}

	@Override
	@WebMethod
	public int getDistricts(String stateName) {
		return states.getState(stateName).getDistricts();
	}

	@Override
	@WebMethod
	public String getPlacesToVisit(String stateName) {
		return states.getState(stateName).getPlacesToVisit();
	}

	@Override
	@WebMethod
	public String getInterestingFacts(String stateName) {
		return states.getState(stateName).getInterestingFacts();
	}

}
