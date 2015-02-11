package adventure;

import java.util.HashMap;

public class Parser
{
	private HashMap<String,IExecute> befehle;
	private String zweitesWort;
	private String[] woerter;
	private IExecute exec;
	
	public Parser(String comm)
	{
		getCommand(comm);
		this.befehle=new HashMap<String, IExecute>();
	}
	
	public IExecute getCommand(String command)
	{
		try
		{
			woerter=command.split(" ");
			
			switch(woerter[0].toLowerCase())
			{
				case "go":
					zweitesWort=woerter[1];
					GoCommand commGo=new GoCommand(zweitesWort);
					System.out.println(commGo.toString());
					return (IExecute)commGo;
			
				case "take":
					zweitesWort=woerter[1];
					TakeCommand commTake=new TakeCommand(zweitesWort);
					System.out.println(commTake.toString());
					return (IExecute)commTake;
				
				case "use":
					zweitesWort=woerter[1];
					UseCommand commUse=new UseCommand(zweitesWort);
					System.out.println(commUse.toString());
					return (IExecute)commUse;
					
				case "description":
					zweitesWort=woerter[1];
					DescriptionCommand commDes=new DescriptionCommand(zweitesWort);
					System.out.println(commDes.toString());
					return (IExecute)commDes;
				
				default:
					System.out.println("Bitte gueltigen Command eingeben!");
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
		this.woerter=command.split(" ");
		this.exec=execute;
		this.befehle.put(this.woerter[0], this.exec);
	}

}
