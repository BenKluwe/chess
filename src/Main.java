import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame bla = new JFrame();
		bla.setLocationRelativeTo(null);
		bla.setSize(500, 500);
		Board test = new Board();
		bla.add(test);
		bla.setVisible(true);
	}
}
