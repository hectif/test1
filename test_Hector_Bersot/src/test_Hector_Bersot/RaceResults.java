package test_Hector_Bersot;
import java.util.ArrayList;
import java.util.List;

public class RaceResults {
	private List<String> RFID=new ArrayList<String>();  
	private List<TimeDuration> time=new ArrayList<TimeDuration>();  
	
	RaceResults(String rfid,int s){
		RFID.add(rfid);
		time.add(new TimeDuration(s));
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		RFID.add(tagNumber);
		time.add(resultTime);
	}
	
	public void printResults(){
		int longueur=RFID.size();
		for(int i=0;i<longueur;i++) {
			System.out.println(RFID.get(i)+" : "+time.get(i).toString());
		}
	}
}
//Le problème du système est que l'affichage des résultats ce fait dans l'ordre de la liste(et non pas par ordre de temps)
//En plus il faudrait rajouter le nom du pilote dans l'objet RaceResult , voir même créer une nouvelle classe pour créer des pilotes afin d'enregistrer leurs résultats et de les comparer par exemple
//Enfin le programme ne marche que d'une traite, à la fin de l'execution du programme rien n'est stoqué, il faudrait donc pouvoir les stocker dans un fichier externe.