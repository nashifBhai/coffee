import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public Main() {
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		frame.add(gamepanel);
		JOptionPane.showMessageDialog(null, "Snake Game Started !");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake Game");
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
