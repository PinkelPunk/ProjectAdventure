package adventure;

import java.util.HashMap;

public class Parser
{
	private HashMap<String,IExecute> befehle;
	
	public Parser()
	{
		this.befehle=new HashMap<String, IExecute>();
	}
	
	public IExecute getCommand(String command)
	{
		return this.befehle.get(command);
	}
	
	public void setBefehle(String command, IExecute execute)
	{
		this.befehle.put(command, execute);
	}

}
