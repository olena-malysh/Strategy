import java.util.ArrayList;
import java.util.List;

public class Rechnung {
	public List<Artikel> a = new ArrayList<Artikel>();
	private Drucken drucken;
	
	public Rechnung(Drucken drucken) {
		this.drucken = drucken;
	}
	
	public void addArtikel(Artikel artikel) {
	       a.add(artikel);
	}
	
    public void executeDrucken(List<Artikel> artikel) {
    	a = artikel;
    	this.drucken.executeDrucken(a);
    }
}