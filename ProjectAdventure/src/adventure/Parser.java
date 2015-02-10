package adventure;

import java.util.HashMap;

public class Parser
{
	private HashMap<String,IExecute> befehle;
	
	public IExecute getCommand(String command)
	{
		return this.befehle.get(command);
	}
	
	public void setBefehle(String command, IExecute execute)
	{
		this.befehle.put(command, execute);
	}

}
