package adventure;

import java.util.LinkedList;

@SuppressWarnings("unused")
public class Held
{
	private LinkedList<Gegenstand> inventar;
	private int lebensPunkte;
	private String name;
	
	public Held(String  name)
	{
		this.name=name;
	}
	
	private LinkedList<Gegenstand> getInventar()
	{
		return inventar;
	}
	
}
