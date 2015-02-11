package adventure;

public class UseCommand implements IExecute
{
	private String zweitesWort;
	
	public UseCommand(String zweitesWort)
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
		return "Du benuzt " + zweitesWort + ".";
	}
}
