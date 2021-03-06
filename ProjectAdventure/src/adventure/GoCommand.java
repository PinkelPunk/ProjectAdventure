package adventure;

public class GoCommand implements IExecute
{
	private String zweitesWort;
	
	public GoCommand(String zweitesWort)
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
		return "Du gehst nach " + zweitesWort + ".";
	}
}
