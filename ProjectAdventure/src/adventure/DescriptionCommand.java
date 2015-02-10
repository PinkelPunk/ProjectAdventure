package adventure;

public class DescriptionCommand implements IExecute
{
	private String zweitesWort;

	@Override
	public String execute()
	{
		return "Beschreibung: " + zweitesWort;
	}

	@Override
	public void setZweitesWort(String zweitesWort)
	{
		this.zweitesWort=zweitesWort;
	}
}