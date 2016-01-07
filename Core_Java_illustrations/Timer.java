
package javaprep;


public class timer {
	
	private static timer tObj = null;
	static int counttimer = 0;
	static int countgettimer = 0;
	//constructor
	public timer(){
		System.out.println("counttimer constructor = " + ++counttimer);
	}

	public void aragazi(){
	System.out.print("aragazi");
	}

	public static synchronized timer getTimerObject () {
		
		if (tObj == null){
			tObj = new timer();
		System.out.println("count gettimer created=" + ++countgettimer);
		
		}else{
			System.out.println("already created yoo");
		}
		return tObj;
	}
	 
	public static void main(String[] args) {
		
		timer t = new timer();
		t.getTimerObject();
		t.getTimerObject();
		t.getTimerObject();
		t.getTimerObject();
		t.getTimerObject();
		t.getTimerObject();
		
		
	}

}
