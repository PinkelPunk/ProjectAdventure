package adventure;

import java.util.HashMap;

public class Main {

	public static void main(String[] args)
	{
		HashMap<String, Raum> gebaeude = new HashMap<String, Raum>();
		Raum raum1 = new Raum(gebaeude);
		Raum raum2 = new Raum(gebaeude);
		raum1.addAusgang(raum1,"nord");
		raum1.getAusgang("nord");

		
		Game spiel1=new Game();
		Game.raumBeschreibung();
		
	}

}
