package adventure;

import java.util.HashMap;

@SuppressWarnings("unused")
public class Raum
{
	private HashMap<String, Raum> ausgaenge;
	private HashMap<Gegenstand, String> itemList;
	private String kurzBeschreibung;
	private String langBeschreibung;
	private String name;

	public Raum(HashMap<String, Raum> ausgaenge)
	{
		this.ausgaenge= new HashMap<String, Raum>();
		this.ausgaenge = ausgaenge;
	}


	public Raum addAusgang(Raum raum, String s)
	{
		ausgaenge.put(s, raum);
		return raum;
	}
	
	public HashMap<String, Raum> getAusgaenge()
	{
		return ausgaenge;
	}
	
	public Raum getAusgang(String s)
	{
		return ausgaenge.get(s);
	}
	
}
