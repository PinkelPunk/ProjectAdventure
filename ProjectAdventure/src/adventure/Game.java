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

        /*                      map
                             n4      n3
                        n5 ader2 - ader1 n2
                        n6 ader3   start n1
                        n7 ader4 - ader5
                            n8      n9

         */



        HashMap<String, Raum> gebaeude = new HashMap<String, Raum>();
		// Räume der Hauptader erstellen
        Raum startraum = new Raum(gebaeude,"Eingang","Eingang");
        Raum  aderRaum1 = new Raum(gebaeude,"Wachraum","Ein dunkler Wachraum.");
        Raum  aderRaum2 = new Raum(gebaeude,"Schmiede","Es glimt noch Kohle in der Schmiede.");
        Raum  aderRaum3 = new Raum(gebaeude,"Lager","Ein leerer Lagerraum.");
        Raum  aderRaum4 = new Raum(gebaeude,"Lavaraum","Lava rinnt aus den Fugen der Waende! Die Hitze erdrueckt dich!");
        Raum  aderRaum5 = new Raum(gebaeude,"Ausgang","Eine düstere endlos erschreinende Treppe, die nach oben führt...");
        // Hauptader-Räume miteinander verbinden
        startraum.addAusgang(aderRaum1,"nord");
        aderRaum1.addAusgang(aderRaum2,"west");
        aderRaum2.addAusgang(aderRaum3,"sued");
        aderRaum3.addAusgang(aderRaum4,"sued");
        aderRaum4.addAusgang(aderRaum5,"ost");
        //Nebenraeume der Hauptader
        Raum nebenRaum1 = new Raum(gebaeude,"Kammer","Eine kleine dunkle Kammer.");
        Raum nebenRaum2 = new Raum(gebaeude,"Schlafzimmer", "Oh, es stehen zwei Betten im Raum.");
        Raum nebenRaum3 = new Raum(gebaeude,"Besenkammer","Ein Besen in einer Kammer.");
        Raum nebenRaum4 = new Raum(gebaeude,"Kueche", "Eine erloschende Feuerstelle ist in der mitte des Raumes.");
        Raum nebenRaum5 = new Raum(gebaeude,"Wachposten","Einst wurden hier wohl Wache gehalten.");
        Raum nebenRaum6 = new Raum(gebaeude,"Schatzkammer","Eine geplünderte Schatzkammer...");
        Raum nebenRaum7 = new Raum(gebaeude,"Folterkammer","Die Schreie der gefolterten, sitzen in jedem Stein");
        Raum nebenRaum8 = new Raum(gebaeude,"Brunnen","Ein tiefer Brunnen steht in der mitte des Raumes.");
        Raum nebenRaum9 = new Raum(gebaeude,"Kerker","Ein Skelett liegt in der Ecke des Kerkers.");
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
        this.aktuellerRaum=startraum;

        //Gegenstände erstellen
        Gegenstand schwert = new Gegenstand("Ein altes Schwert.","Ein sehr, sehr altes Schwert mit einem kleinen TotenKopf im Griff.");
        Gegenstand hand = new Gegenstand("Eine Hand","Ein eiskaltes Haendchen.");
        Gegenstand brot = new Gegenstand("Ein altes Brot","Lecker, es schmeckt nach Kaese.");
        Gegenstand Pfeife = new Gegenstand("Eine Pfeife.","Eine hoelzerne Pfeife.");

        //Gegenstand spawn Aderraum 2 wozu der String?!
        HashMap itemlist1 = new HashMap();
        itemlist1.put(schwert,"Schwert");
        itemlist1.put(hand,"hand");
        aderRaum2.setItemList(itemlist1);
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
