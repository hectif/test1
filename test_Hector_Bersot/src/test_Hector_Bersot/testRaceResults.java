package test_Hector_Bersot;

public class testRaceResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeDuration t1=new TimeDuration(4454);
		TimeDuration t2=new TimeDuration(6644);
		TimeDuration t3=new TimeDuration(8854);
		
		RaceResults RR=new RaceResults("AZE",2264);
		RR.onNewResult("ZER",t1);
		RR.onNewResult("ERT",t2);
		RR.onNewResult("RTY",t3);
		RR.printResults();
	}

}
