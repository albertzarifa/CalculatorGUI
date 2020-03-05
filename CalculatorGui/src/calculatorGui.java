import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculatorGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorGui window = new calculatorGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatorGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 334, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(6, 6, 322, 63);
		frame.getContentPane().add(editorPane);
		
		JButton btnX = new JButton("x");
		btnX.setBounds(259, 204, 69, 42);
		frame.getContentPane().add(btnX);
		
		JButton button_8 = new JButton("÷");
		button_8.setBounds(259, 258, 69, 42);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setBounds(259, 96, 69, 42);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(259, 150, 69, 42);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.setBounds(168, 204, 69, 42);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBounds(168, 258, 69, 42);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("7");
		button_13.setBounds(168, 96, 69, 42);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("6");
		button_14.setBounds(168, 150, 69, 42);
		frame.getContentPane().add(button_14);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(87, 150, 69, 42);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.setBounds(87, 204, 69, 42);
		frame.getContentPane().add(button_4);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(87, 96, 69, 42);
		frame.getContentPane().add(button_6);
		
		JButton button = new JButton("1");
		button.setBounds(6, 204, 69, 42);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("0");
		button_1.setBounds(6, 258, 150, 42);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(6, 150, 69, 42);
		frame.getContentPane().add(button_2);
		
		JButton button_15 = new JButton("9");
		button_15.setBounds(6, 96, 69, 42);
		frame.getContentPane().add(button_15);
	}
}
