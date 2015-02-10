package adventure;

import java.util.HashMap;

public class Main {

	public static void main(String[] args)
	{
		HashMap gebaeude = new HashMap();
		Raum raum1 = new Raum(gebaeude);
		Raum raum2 = new Raum(gebaeude);
		raum1.addAusgang(raum1,"nord");
		raum1.getAusgang("nord");
		
		
	}

}
