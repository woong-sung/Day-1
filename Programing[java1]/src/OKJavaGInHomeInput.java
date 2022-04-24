import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator ;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security ;
import org.opentutorials.iot.DimmingLights ;

public class OKJavaGInHomeInput {
	// parameter = �Ű�����
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a ID");  // JOptionPane.showInputDialog() ��ǲ��ɾ�
		String bright = JOptionPane.showInputDialog("Enter a bright");
//		String id = args[0];
//		String bright = args[1];
		
		
		// ���������� ȣ��
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// ��������
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// ����
		Lighting hallLamp = new Lighting(id +" Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));  // Double.parseDouble(A) = A���ڿ��� �Ǽ������� ��ȯ
		moodLamp.on();
		
		
	}

}
