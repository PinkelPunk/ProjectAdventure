package adventure;

import java.io.*;

@SuppressWarnings("unused")
public class Game
{
	private Raum aktuellerRaum;
	private Held held;
	private Parser parser;
	
	public Game()
	{
		
	}
	
	private void createWorld()
	{
		
	}
	
	private void gameMenue()
	{
		System.out.println("-----------------------------------");
		System.out.println("--------Punkmainyu Studios---------");
		System.out.println("-----------------------------------");
		System.out.println("-------Member of the Chamber-------");

		//eingaben lesen
		String eingabe;
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			do
			{
				System.out.println("Wie soll dein Held heißen?");
			}while((eingabe=br.readLine())!=null);
			File file = new File("/users/Spielernamen.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(eingabe);
			br.close();
		}
		catch(IOException e)
		{

		}
		// NumberCatch von Hasanovic
		/*catch(NumberFormatException e)
		{
			System.out.println("Sie haben keine zahl eingegeben");
		}*/
	}
	
	private void init()
	{
		
	}
	
	public static void goRaum(String raum)
	{
		
	}
	
	public static void raumBeschreibung()
	{
		
	}
}