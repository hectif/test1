package test_Hector_Bersot;

public class TimeDuration {
	private int time;
	
	TimeDuration(int sec){
		time=sec;
	}
	
	public String toString() {
		int h=0;
		int m=0;
		int s=time;
		while(s>=3600) {
			h++;
			s-=3600;
		}
		while(s>=60) {
			m++;
			s-=60;
		}
		String result="";
		if (h>0)
			result+=h+"h ";
		if (m>0)
			result+=m+"m ";
		result+=s+" s";
		return result;
	}
}
