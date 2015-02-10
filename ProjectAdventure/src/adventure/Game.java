package adventure;

<<<<<<< HEAD
=======
import java.io.*;

>>>>>>> origin/master
public class Game
{
	private Raum aktuellerRaum;
	private Held held;
	private Parser parser;
	
	private void createWorld()
	{
		
	}
	
	private void gameMenue()
	{
<<<<<<< HEAD
		
=======
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
>>>>>>> origin/master
	}
	
	private void init()
	{
		
	}
	
	public Game()
	{
		
	}
	
	public void goRaum(String raum)
	{
		
	}
	
	public void raumBeschreibung()
	{
		
	}
}
