package adventure;

public class TakeCommand implements IExecute
{
	private String zweitesWort;
	
	public TakeCommand(String zweitesWort)
	{
		setZweitesWort(zweitesWort);
		execute();
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
		return "Du nimmst " + zweitesWort + ".";
	}
}
