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

	public Raum(HashMap<String, Raum> ausgaenge, String name, String kurzBeschreibung)
	{
		this.ausgaenge= new HashMap<String, Raum>();
		this.ausgaenge = ausgaenge;
        this.name = name;
        this.kurzBeschreibung=kurzBeschreibung;


	}

    public void setItemList(HashMap<Gegenstand, String> itemList)
    {
        this.itemList = itemList;
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
