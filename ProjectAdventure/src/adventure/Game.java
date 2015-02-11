package adventure;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


@SuppressWarnings("unused")
public class Game
{
	private Raum aktuellerRaum;
	private Held held;
	private Parser parser;


	public Game(String comm)
	{
		parser=new Parser(comm);
	}
	

	public Game()
	{
		gameMenue();
	}

	private void createWorld()
	{


        HashMap<String, Raum> gebaeude = new HashMap<String, Raum>();
		// Räume der Hauptader erstellen
        Raum startraum = new Raum(gebaeude);//
        Raum  aderRaum1 = new Raum(gebaeude);//             Map
        Raum  aderRaum2 = new Raum(gebaeude);//
        Raum  aderRaum3 = new Raum(gebaeude);//
        Raum  aderRaum4 = new Raum(gebaeude);//
        Raum  aderRaum5 = new Raum(gebaeude);//         n4      n3
        // Hauptader-Räume miteinander verbinden     n5 ader2 - ader1 n2
        startraum.addAusgang(aderRaum1,"nord");//    n6 ader3   start n1
        aderRaum1.addAusgang(aderRaum2,"west");//    n7 ader4 - ader5
        aderRaum2.addAusgang(aderRaum3,"sued");//         n8      n9
        aderRaum3.addAusgang(aderRaum4,"sued");//
        aderRaum4.addAusgang(aderRaum5,"ost");//
        //Nebenraeume der Hauptader
        Raum nebenRaum1 = new Raum(gebaeude);
        Raum nebenRaum2 = new Raum(gebaeude);
        Raum nebenRaum3 = new Raum(gebaeude);
        Raum nebenRaum4 = new Raum(gebaeude);
        Raum nebenRaum5 = new Raum(gebaeude);
        Raum nebenRaum6 = new Raum(gebaeude);
        Raum nebenRaum7 = new Raum(gebaeude);
        Raum nebenRaum8 = new Raum(gebaeude);
        Raum nebenRaum9 = new Raum(gebaeude);
        //Nebenräume mit Raumader verbinden
        startraum.addAusgang(nebenRaum1,"ost");
        aderRaum1.addAusgang(nebenRaum2,"ost");
        aderRaum1.addAusgang(nebenRaum3,"nord");
        aderRaum2.addAusgang(nebenRaum4,"nord");
        aderRaum2.addAusgang(nebenRaum5,"west");
        aderRaum3.addAusgang(nebenRaum6,"west");
        aderRaum4.addAusgang(nebenRaum7,"west");
        aderRaum4.addAusgang(nebenRaum8,"sued");
        aderRaum5.addAusgang(nebenRaum9,"sued");

	}
	
	private void gameMenue()
	{
		System.out.println("-----------------------------------");
		System.out.println("--------Punkmainyu Studios---------");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("-------Member of the Chamber-------");
		System.out.println("-----------------------------------");

		//eingaben lesen
		String eingabe;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("");
			System.out.println("Bitte geben Sie einen Namen ein. ");

				eingabe=br.readLine();
				FileWriter fw = new FileWriter("docs/Spielername.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(eingabe);
				System.out.println("Was für ein schaurig schoener Name! - " + eingabe);

				bw.close();
				br.close();

		}
		catch(IOException e)
		{
			System.out.println("Die tolle 'hab keine ahnung' Exception" + e.getMessage());
		}

	}
	
		
	private void init()
	{
		
	}
	
	public static void goRaum(String raum)
	{
		raumBeschreibung();
	}
	

	public static void raumBeschreibung()
	{
		try
		{
			ArrayList<String> brInhaltHalter = new ArrayList<String>();
			int counter = 0;
			String zeile;
			BufferedReader br = new BufferedReader(new FileReader("docs/Raumbeschreibung.txt"));
			try
			{
				while((zeile=br.readLine()) !=null)
                {
                    counter++;
					brInhaltHalter.add(zeile);

				}

				int zufallszahl = (int) ((Math.random()*counter));

				System.out.println(brInhaltHalter.get(zufallszahl));
				br.close();

			}
			catch (IOException e)
			{
				e.printStackTrace();
			}

		}
		catch (FileNotFoundException e)
		{
			System.out.println("Datei nicht gefunden"); e.printStackTrace();

		}
	}
}
