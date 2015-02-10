package adventure;


import java.io.*;


public class Game
{
	private Raum aktuellerRaum;
	private Held held;
	private Parser parser;

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
	

	
	public void goRaum(String raum)
	{
		
	}
	
	public void raumBeschreibung()
	{
		
	}
}
