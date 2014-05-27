import java.util.List;

public class DruckenText implements Drucken {

	public void executeDrucken(List<Artikel> a) {
		
		for(int i=0;i<a.size();i++){
		    System.out.println(a.get(i));
		} 		
	}
}