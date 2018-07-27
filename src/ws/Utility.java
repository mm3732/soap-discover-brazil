package ws;

import java.util.HashMap;
import java.util.Map;

public class Utility {

	Map<String, State> stateMap;

	public Utility() {
		this.stateMap = new HashMap<String, State>();
	}

	public void loadData() {

		State saopaulo = new State("São Paulo", "São Paulo", 550, "Português", "Congonhas, Guarulhos, Viracopos",
				"MASP, Ibirapuera, Teatro Municipal", "Conhecida como terra da garoa");
		State riodejaneiro = new State("Rio de Janeiro", "Rio de Janeiro", 230, "Português", "Galeão",
				"Copacabana, Arcos da Lapa, Marcanã",
				"Dizem que o seu desfile de carnaval é o maior espetáculo da Terra");
		State minasgerais = new State("Minas Gerais", "Belo Horizonte", 990, "Português", "Confins",
				"Lagoa da Pampulha", "A culinária mineira é uma das mais apreciadas do país");
		State bahia = new State("Bahia", "Salvador", 430, "Português", "Antônio Carlos Magalhães",
				"Pelourinho, Farol da Barra, Itapuã, Mercado Modelo", "Terra do axé, ritmo dançante");

		stateMap.put("São Paulo", saopaulo);
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
