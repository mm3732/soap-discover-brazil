package ws;

import java.util.HashMap;
import java.util.Map;

public class Utility {

	Map<String, State> stateMap;

	public Utility() {
		this.stateMap = new HashMap<String, State>();
	}

	public void loadData() {

		State saopaulo = new State("S�o Paulo", "S�o Paulo", 550, "Portugu�s", "Congonhas, Guarulhos, Viracopos",
				"MASP, Ibirapuera, Teatro Municipal", "Conhecida como terra da garoa");
		State riodejaneiro = new State("Rio de Janeiro", "Rio de Janeiro", 230, "Portugu�s", "Gale�o",
				"Copacabana, Arcos da Lapa, Marcan�",
				"Dizem que o seu desfile de carnaval � o maior espet�culo da Terra");
		State minasgerais = new State("Minas Gerais", "Belo Horizonte", 990, "Portugu�s", "Confins",
				"Lagoa da Pampulha", "A culin�ria mineira � uma das mais apreciadas do pa�s");
		State bahia = new State("Bahia", "Salvador", 430, "Portugu�s", "Ant�nio Carlos Magalh�es",
				"Pelourinho, Farol da Barra, Itapu�, Mercado Modelo", "Terra do ax�, ritmo dan�ante");

		stateMap.put("S�o Paulo", saopaulo);
		stateMap.put("Rio de Janeiro", riodejaneiro);
		stateMap.put("Minas Gerais", minasgerais);
		stateMap.put("Bahia", bahia);

	}

	public State getState(String stateName) {
		State state = null;
		state = stateMap.get(stateName);
		return state;
	}

}
