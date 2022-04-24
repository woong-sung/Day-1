import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator ;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security ;
import org.opentutorials.iot.DimmingLights ;

public class OKJavaGInHomeInput {
	// parameter = 매개변수
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");  // JOptionPane.showInputDialog() 인풋명령어
		String bright = JOptionPane.showInputDialog("Enter a bright");
//		String id = args[0];
//		String bright = args[1];
		
		
		// 엘레베이터 호출
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// 보안해제
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// 점등
		Lighting hallLamp = new Lighting(id +" Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));  // Double.parseDouble(A) = A문자열을 실수값으로 변환
		moodLamp.on();
		
		
	}

}
