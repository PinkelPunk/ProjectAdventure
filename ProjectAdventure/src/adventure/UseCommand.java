package adventure;

public class UseCommand implements IExecute
{
	private String zweitesWort;

	@Override
	public String execute()
	{
		return "Benutze: " + zweitesWort;
	}

	@Override
	public void setZweitesWort(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
}
