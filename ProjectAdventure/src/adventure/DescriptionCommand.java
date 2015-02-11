package adventure;

public class DescriptionCommand implements IExecute
{
	private String zweitesWort;
	
	public DescriptionCommand(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
	
	@Override
	public String execute()
	{
		return zweitesWort;
	}

	@Override
	public void setZweitesWort(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
	
	@Override
	public String toString()
	{
		return "Beschreibung: " + zweitesWort + ".";
	}
}
