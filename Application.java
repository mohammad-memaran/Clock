package runner;

import java.io.IOException;

import Clock.ClockDisplay;
import runner.Clock_Time;

public class Application {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockDisplay clockDisplay = new ClockDisplay();
	for(;;) {
		System.out.println(clockDisplay.getTime());
	}
	
	}*/
	
	public static void main(String... arg) throws IOException, InterruptedException {
		Clock_Time Clock = new Clock_Time();
		
		//while(true) {
		for(;;) {
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			Clock.increase();				       
			System.out.println(Clock.showTime());
		}
		
	}

}
