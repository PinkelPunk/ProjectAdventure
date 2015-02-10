package adventure;

public class GoCommand implements IExecute
{
	private String zweitesWort;
	
	@Override
	public String execute()
	{
		
		return "Gehe zu " + zweitesWort;
	}

	@Override
	public void setZweitesWort(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
}