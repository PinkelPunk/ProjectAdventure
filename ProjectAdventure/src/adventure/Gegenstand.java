package adventure;

public class Gegenstand
{
	private String kurzBeschreibung;
	private String langBeschreibung;
	
	public Gegenstand(String kurzBeschreibung, String langBeschreibung)
	{
		this.kurzBeschreibung=kurzBeschreibung;
		this.langBeschreibung=langBeschreibung;
	}

	/**
	 * @return the kurzBeschreibung
	 */
	public String getKurzBeschreibung() {
		return kurzBeschreibung;
	}

	/**
	 * @return the langBeschreibung
	 */
	public String getLangBeschreibung() {
		return langBeschreibung;
	}
	
	@Override
	public String toString()
	{
		return "Kurze Beschreibung: " + kurzBeschreibung + "\nlange Beschreibung: " + langBeschreibung;
	}
}
