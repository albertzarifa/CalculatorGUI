import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class calculatorGui {

	private JFrame frame;
	private JTextField entered_value;
	private JTextField stored_value;

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
		
		stored_value = new JTextField();
		stored_value.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		stored_value.setBorder(null);
		stored_value.setBounds(100, 16, 217, 26);
		frame.getContentPane().add(stored_value);
		stored_value.setColumns(10);
		
		entered_value = new JTextField();
		entered_value.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		entered_value.setBorder(null);
		entered_value.setBounds(17, 40, 300, 41);
		frame.getContentPane().add(entered_value);
		entered_value.setColumns(10);
		
		JEditorPane display = new JEditorPane();
		display.setEnabled(false);
		display.setBorder(new LineBorder(new Color(0, 0, 0)));
		display.setBounds(6, 6, 322, 78);
		frame.getContentPane().add(display);
		
		JButton btn_zero = new JButton("0");
		btn_zero.setBounds(6, 258, 45, 42);
		frame.getContentPane().add(btn_zero);
		
		JButton btn_one = new JButton("1");
		btn_one.setBounds(6, 204, 45, 42);
		frame.getContentPane().add(btn_one);
		
		JButton btn_two = new JButton("2");
		btn_two.setBounds(56, 204, 45, 42);
		frame.getContentPane().add(btn_two);
		
		JButton btn_three = new JButton("3");
		btn_three.setBounds(111, 204, 45, 42);
		frame.getContentPane().add(btn_three);
		
		JButton btn_four = new JButton("4");
		btn_four.setBounds(6, 150, 45, 42);
		frame.getContentPane().add(btn_four);
		
		JButton btn_five = new JButton("5");
		btn_five.setBounds(56, 150, 45, 42);
		frame.getContentPane().add(btn_five);
		
		JButton btn_six = new JButton("6");
		btn_six.setBounds(111, 150, 45, 42);
		frame.getContentPane().add(btn_six);
		
		JButton btn_seven = new JButton("7");
		btn_seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_seven.setBounds(6, 96, 45, 42);
		frame.getContentPane().add(btn_seven);
		
		JButton btn_eight = new JButton("8");
		btn_eight.setBounds(56, 96, 45, 42);
		frame.getContentPane().add(btn_eight);
		
		JButton btn_nine = new JButton("9");
		btn_nine.setBounds(111, 96, 45, 42);
		frame.getContentPane().add(btn_nine);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_equal.setBounds(56, 258, 100, 42);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_add = new JButton("+");
		btn_add.setBounds(169, 96, 45, 42);
		frame.getContentPane().add(btn_add);
		
		JButton btn_sub = new JButton("-");
		btn_sub.setBounds(169, 150, 45, 42);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_mult = new JButton("x");
		btn_mult.setBounds(169, 204, 45, 42);
		frame.getContentPane().add(btn_mult);
		
		JButton btn_div = new JButton("÷");
		btn_div.setBounds(169, 258, 45, 42);
		frame.getContentPane().add(btn_div);
	}
}
