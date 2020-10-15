package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e ->{
			String numWord1 = JOptionPane.showInputDialog("First Number");
			String numWord2 = JOptionPane.showInputDialog("Second Number");
			try {
				int num1 = Integer.parseInt(numWord1);
				int num2 = Integer.parseInt(numWord2);
				System.out.println(num1+" + "+num2 + " = " + (num1+num2));
			} catch (NumberFormatException e2) {
				System.out.println("That's not a number, nerd");
			}
				
		}));
		randNumber.addActionListener(e ->{
			Random rand = new Random();
			JOptionPane.showMessageDialog(null, "The number will be between _ and _");
			String randWord1 = JOptionPane.showInputDialog("First parameter");
			String randWord2 = JOptionPane.showInputDialog("Second parameter");
			try {
				int rand1 = Integer.parseInt(randWord1);
				int rand2 = Integer.parseInt(randWord2);
				System.out.println(rand.nextInt(rand2+1-rand1)+rand1);
			} catch (NumberFormatException e2) {
				System.out.println("That's not a number, nerd");
			}
		});
		tellAJoke.addActionListener(e ->{
			Random rando = new Random();
			int joke = rando.nextInt(4);
			switch (joke) {
			case 0:
				JOptionPane.showMessageDialog(null, "No");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "What's the best thing about Switzerland?");
				JOptionPane.showMessageDialog(null, "I don't know, but the flag is a big plus.");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Did you hear about the mathematician who’s afraid of negative numbers?");
				JOptionPane.showMessageDialog(null, "He’ll stop at nothing to avoid them.");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "From where you're kneeling must seem like an 18 karat run of bad luck.");
				JOptionPane.showMessageDialog(null, "Truth is...");
				JOptionPane.showMessageDialog(null, "Game was rigged from the start.");
				System.exit(0);
				break;
			default:
				break;
			}
		});
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
	
}
