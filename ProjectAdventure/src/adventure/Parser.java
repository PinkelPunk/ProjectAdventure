package adventure;

import java.util.HashMap;
import java.util.Scanner;

public class Parser
{
	private HashMap<String,IExecute> befehle;
	private String command;
	private IExecute exec;
	
	public Parser(String comm)
	{
		getCommand(comm);
		this.befehle=new HashMap<String, IExecute>();
	}
	
	@SuppressWarnings("resource")
	public IExecute getCommand(String command)
	{
		try
		{
			Scanner scan;
			switch(command)
			{
				case "GoCommand": 
					scan=new Scanner(System.in);
					System.out.println("In welche Richtung moechtest du gehen?");
					String richtung=scan.next();
					GoCommand commGo=new GoCommand(richtung);
					System.out.println(commGo.toString());
					return (IExecute)commGo;
			
				case "TakeCommand": 
					scan=new Scanner(System.in);
					System.out.println("Was willst du nehmen?");
					String gegenstand=scan.next();
					TakeCommand commTake=new TakeCommand(gegenstand);
					System.out.println(commTake.toString());
					return (IExecute)commTake;
				
				case "UseCommand":
					scan=new Scanner(System.in);
					System.out.println("Was willst du benutzen?");
					String benutze=scan.next();
					UseCommand commUse=new UseCommand(benutze);
					System.out.println(commUse.toString());
					return (IExecute)commUse;
					
				case "DescriptionCommand":
					scan=new Scanner(System.in);
					System.out.println("Willst du die Raum- oder die Gegenstandsbeschreibung sehen?");
					String description=scan.next();
					DescriptionCommand commDes=new DescriptionCommand(description);
					System.out.println(commDes.toString());
					return (IExecute)commDes;
				
				default:
					System.out.println("Bitte gültigen Command eingeben!");
					System.exit(0);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "Fehler in der Matrix!!!");
			e.printStackTrace();
		}
		return this.befehle.get(command);
	}
	
	public void setBefehle(String command, IExecute execute)
	{
		this.command=command;
		this.exec=execute;
		this.befehle.put(this.command, this.exec);
	}

}
