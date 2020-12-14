import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine, clear, sign, percent, division, multiply, minus, plus, equal, dot;
	private JLabel label;
	private String firstNum = "", secondNum = "", labelNum = "0";
	boolean isSecond = false, isPlus = false, isMinus = false, isMultiply = false, isDivision = false, isError = false;
	
	/*
	 * Calculator class adds the app to a window
	 */
	public Calculator() {
		frame = new JFrame();
		label = new JLabel(labelNum);
		
		createButtons();
		
		//adds the app to the window
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
	}
	
	//main
	public static void main(String[] args) {
		new Calculator();
	}
	
	/*
	 * Function to create the buttons of the calculator
	 */
	public void createButtons() {
		//creating buttons
		zero = new JButton("0");
		zero.addActionListener(this);
		one = new JButton("1");
		one.addActionListener(this);
		two = new JButton("2");
		two.addActionListener(this);
		three = new JButton("3");
		three.addActionListener(this);
		four = new JButton("4");
		four.addActionListener(this);
		five = new JButton("5");
		five.addActionListener(this);
		six = new JButton("6");
		six.addActionListener(this);
		seven = new JButton("7");
		seven.addActionListener(this);
		eight = new JButton("8");
		eight.addActionListener(this);
		nine = new JButton("9");
		nine.addActionListener(this);
		clear = new JButton("C");
		clear.addActionListener(this);
		sign = new JButton("+/-");
		sign.addActionListener(this);
		percent = new JButton("%");
		percent.addActionListener(this);
		division = new JButton("/");
		division.addActionListener(this);
		multiply = new JButton("X");
		multiply.addActionListener(this);
		minus = new JButton("-");
		minus.addActionListener(this);
		plus = new JButton("+");
		plus.addActionListener(this);
		equal = new JButton("=");
		equal.addActionListener(this);
		dot = new JButton(".");
		dot.addActionListener(this);
		
		//setting up GUI
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(1024, 600));
		
		//creation of buttons
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 4;
		c.gridy = 0;
		panel.add(label, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy = 1;
		panel.add(clear, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		panel.add(sign, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		panel.add(percent, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		panel.add(division, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		panel.add(seven, c);

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		panel.add(eight, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		panel.add(nine, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		panel.add(multiply, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		panel.add(four, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		panel.add(five, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		panel.add(six, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		panel.add(minus, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		panel.add(one, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		panel.add(two, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		panel.add(three, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		panel.add(plus, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridwidth = 2;
		c.gridy = 5;
		panel.add(zero, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridwidth = 1;
		c.gridy = 5;
		panel.add(dot, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 5;
		panel.add(equal, c);
	}

	/*
	 * Function to handle button presses
	 */
	public void actionPerformed(ActionEvent e) {
		//number values
		if (e.getSource() == one) {
			if (!isSecond) {
				firstNum += "1";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "1";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == two) {
			if (!isSecond) {
				firstNum += "2";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "2";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == three) {
			if (!isSecond) {
				firstNum += "3";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "3";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == four) {
			if (!isSecond) {
				firstNum += "4";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "4";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == five) {
			if (!isSecond) {
				firstNum += "5";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "5";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == six) {
			if (!isSecond) {
				firstNum += "6";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "6";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == seven) {
			if (!isSecond) {
				firstNum += "7";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "7";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == eight) {
			if (!isSecond) {
				firstNum += "8";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "8";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == nine) {
			if (!isSecond) {
				firstNum += "9";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "9";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == zero) {
			if (!isSecond) {
				firstNum += "0";
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				secondNum += "0";
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		
		//special values
		else if (e.getSource() == dot) {
			if (!isSecond) {
				if (firstNum.equals("")) {
					firstNum += "0.";
					labelNum = firstNum;
					label.setText(labelNum);
				}
				else {
					firstNum += ".";
					labelNum = firstNum;
					label.setText(labelNum);
				}
			}
			else {
				if (secondNum.equals("")) {
					secondNum += "0.";
					labelNum = secondNum;
					label.setText(labelNum);
				}
				else {
					secondNum += ".";
					labelNum = secondNum;
					label.setText(labelNum);
				}
			}
		}
		else if (e.getSource() == plus) {
			addingOn();
			isPlus = true;
			isMinus = false;
			isMultiply = false;
			isDivision = false;
			
			if (!isSecond) {
				isSecond = true;
			}
		}
		else if (e.getSource() == minus) {
			addingOn();
			isPlus = false;
			isMinus = true;
			isMultiply = false;
			isDivision = false;
			
			if (!isSecond) {
				isSecond = true;
			}
		}
		else if (e.getSource() == multiply) {
			addingOn();
			isPlus = false;
			isMinus = false;
			isMultiply = true;
			isDivision = false;
			
			if (!isSecond) {
				isSecond = true;
			}
		}
		else if (e.getSource() == division) {
			addingOn();
			isPlus = false;
			isMinus = false;
			isMultiply = false;
			isDivision = true;
			
			if (!isSecond) {
				isSecond = true;
			}
		}
		else if (e.getSource() == equal) {
			if (isError) {
				labelNum = "Error";
				isError = true;
				firstNum = labelNum;
				secondNum = "";
				label.setText(labelNum);
			}
			else if (isPlus) {
				add();
			}
			else if (isMinus) {
				subtract();
			}
			else if (isMultiply) {
				multiply();
			}
			else if (isDivision) {
				divide();
			}
		}
		else if (e.getSource() == clear) {
			clear();
		}
		else if (e.getSource() == sign && !isError && !labelNum.equals("") && !labelNum.equals("0")) {
			if (!isSecond) {
				if (firstNum.charAt(0) == '-') {
					firstNum = firstNum.substring(1);
				}
				else {
					firstNum = "-" + firstNum;
				}
				labelNum = firstNum;
				label.setText(labelNum);
			}
			else {
				if (secondNum.charAt(0) == '-') {
					secondNum = secondNum.substring(1);
				}
				else {
					secondNum = "-" + secondNum;
				}
				labelNum = secondNum;
				label.setText(labelNum);
			}
		}
		else if (e.getSource() == percent) {
			removeNull();
			if (!isSecond) {
				double result = Double.parseDouble(firstNum) / 100;
				firstNum = "" + result;
				labelNum = firstNum;
				if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
					labelNum = labelNum.substring(0, labelNum.length() - 2);
				}
				label.setText(labelNum);
			}
			else {
				double result = Double.parseDouble(secondNum) / 100;
				secondNum = "" + result;
				labelNum = secondNum;
				if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
					labelNum = labelNum.substring(0, labelNum.length() - 2);
				}
				label.setText(labelNum);
			}
		}
	}
	
	/*
	 * Function to handle addition
	 */
	private void add() {
		removeNull();
		isPlus = false;
		isSecond = false;
		double result = Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
		labelNum = "" + result;
		if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
			labelNum = labelNum.substring(0, labelNum.length() - 2);
		}
		firstNum = labelNum;
		secondNum = "";
		label.setText(labelNum);
	}

	/*
	 * Function to handle subtraction
	 */
	private void subtract() {
		removeNull();
		isMinus = false;
		isSecond = false;
		double result = Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
		labelNum = "" + result;
		if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
			labelNum = labelNum.substring(0, labelNum.length() - 2);
		}
		firstNum = labelNum;
		secondNum = "";
		label.setText(labelNum);
	}
	
	/*
	 * Function to handle multiplication
	 */
	private void multiply() {
		removeNull();
		isMultiply = false;
		isSecond = false;
		double result = Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
		labelNum = "" + result;
		if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
			labelNum = labelNum.substring(0, labelNum.length() - 2);
		}
		firstNum = labelNum;
		secondNum = "";
		label.setText(labelNum);
	}
	
	/*
	 * Function to handle division
	 */
	private void divide() {
		removeNull();
		isDivision = false;
		isSecond = false;
		try {
			double result = Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
			labelNum = "" + result;
		}
		catch (ArithmeticException e) {
			labelNum = "Error";
			isError = true;
		}
		if (labelNum.substring(labelNum.length() - 2, labelNum.length()).equals(".0")) {
			labelNum = labelNum.substring(0, labelNum.length() - 2);
		}
		firstNum = labelNum;
		secondNum = "";
		label.setText(labelNum);
	}
	
	/*
	 * Removes any null from first or second number
	 */
	private void removeNull() {
		if (firstNum.equals("")) {
			firstNum = "0";
		}
		if (secondNum.equals("")) {
			secondNum = firstNum;
		}
	}
	
	/*
	 * disregards switching and checks if second number is empty
	 */
	private void addingOn() {
		if (isError) {
			labelNum = "Error";
			isError = true;
			firstNum = labelNum;
			secondNum = "";
			label.setText(labelNum);
		}
		else if (((!isMinus && !isPlus && !isDivision && !isMultiply) || !secondNum.equals(""))) {
			if (isPlus) {
				add();
			}
			else if (isMinus) {
				subtract();
			}
			else if (isMultiply) {
				multiply();
			}
			else if (isDivision) {
				divide();
			}
		}
	}
	
	/*
	 * Clears the second or first number
	 */
	private void clear() {
		if (!isSecond) {
			isError = false;
			firstNum = "";
			secondNum = "";
			labelNum = "0";
			label.setText(labelNum);
		}
		else if (secondNum.equals("")) {
			isSecond = false;
		}
		else {
			secondNum = "";
			labelNum = "0";
			label.setText(labelNum);
		}
	}
}
