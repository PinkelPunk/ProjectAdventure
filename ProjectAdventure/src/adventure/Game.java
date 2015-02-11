package adventure;


import java.io.*;
import java.util.ArrayList;


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
			ArrayList brInhaltHalter = null;
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
