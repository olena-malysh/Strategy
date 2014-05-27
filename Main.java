import java.util.List;
import java.util.ArrayList;

public class Main {
	  public static void main(String[] args) {
		Rechnung rechnung = new Rechnung(new DruckenHTML());
		String resultHTML = rechnung.executeDrucken();
		
		rechnung = new Rechnung(new DruckenText());
		String resultText = rechnung.executeDrucken();
		
		System.out.println("Print Text : " + resultText );
        System.out.println("Print HTML : " + resultHTML );	
	}
}