public class Artikel  {
	String beschreibung = "Ein Produkt";
    double preis = 0.00;
    public Artikel(){
    	
    }
    public Artikel(String beschreibung, double preis)
    {
    	this.beschreibung= beschreibung;
        this.preis = preis;
    }
        
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
 
    public double getPreis() {
        return preis;
    }
   
    public void setPreis(double preis) {
        this.preis = 2.00;
    }
   
    public String toString(){	
		return getBeschreibung() + ": " + getPreis();
    }
}