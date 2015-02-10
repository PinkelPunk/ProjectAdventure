package adventure;

public class TakeCommand implements IExecute
{
	private String zweitesWort;

	@Override
	public String execute()
	{
		return "Nimm: " + zweitesWort;
	}

	@Override
	public void setZweitesWort(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
}