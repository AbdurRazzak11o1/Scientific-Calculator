import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class Calculator extends JFrame implements ActionListener {

	//Fields

	//add mypanel on the JFrame.
	JPanel mypanel;
	//add buttons
	JButton mybutton0;
	JButton mybutton1;
	JButton mybutton2;
	JButton mybutton3;
	JButton mybutton4;
	JButton mybutton5;
	JButton mybutton6;
	JButton mybutton7;
	JButton mybutton8;
	JButton mybutton9;
	JButton mybutton10;
	JButton mybutton11;
	JButton buttonSin;
	JButton buttonCos;
	JButton buttonTan;
	JButton buttonSqrt;
	JButton buttonCbrt;
	JButton buttonLog;
	JButton buttonSquare;
	JButton buttonFact;
	JButton buttonPercent;
	JButton buttonPI;
	JButton mybuttonXY;

	JButton MemorySave;
	JButton MemoryRecall;




	JButton mybuttonDecimal;
	JButton mybuttonPlus;
	JButton mybuttonMinus;
	JButton mybuttonMultiply;
	JButton mybuttonDivide;
	JButton mybuttonEqual;
	JButton mybuttonClear;

	JTextField mytext1;
	JTextField mytext2;


	double num = 0.0;
	double result = 0.0;


	boolean firstEntry = true;
	boolean firstperiod=false;
	String lastOperation = "";

	//constructor
	public Calculator()
	{
		mypanel = new JPanel();
		mypanel.setLayout(null);

		//add buttons' location.
		buttonSquare = new JButton("x^2");
		buttonSquare.setBounds(15, 300,45,45 );


		mybuttonXY = new JButton("x^y");
		mybuttonXY.setBounds(65, 300,45,45 );


		buttonFact = new JButton("n!");
		buttonFact.setBounds(115, 300,45,45 );


		buttonPI = new JButton("π");
		buttonPI.setBounds(165, 300, 45, 45 );

		buttonLog = new JButton("log");
		buttonLog.setBounds(215, 300,45,45);

		mybutton0 = new JButton("0");
		mybutton0.setBounds(15, 250, 45, 45);

		mybuttonDecimal = new JButton(".");
		mybuttonDecimal.setBounds(65, 250, 45, 45);

		mybuttonEqual = new JButton("=");
		mybuttonEqual.setBounds(115, 250, 45, 44);

		mybuttonPlus = new JButton("+");
		mybuttonPlus.setBounds(165, 250, 45, 45);


		mybutton1 = new JButton("1");
		mybutton1.setBounds(15, 200, 45, 45);

		mybutton2 = new JButton("2");
		mybutton2.setBounds(65, 200, 45, 45);

		mybutton3 = new JButton("3");
		mybutton3.setBounds(115, 200, 45, 45);

		mybuttonMinus = new JButton("-");
		mybuttonMinus.setBounds(165, 200, 45, 45);

		mybutton4 = new JButton("4");
		mybutton4.setBounds(15, 150, 45, 45);

		mybutton5 = new JButton("5");
		mybutton5.setBounds(65, 150, 45, 45);

		mybutton6 = new JButton("6");
		mybutton6.setBounds(115, 150, 45, 45);

		mybuttonMultiply = new JButton("*");
		mybuttonMultiply.setBounds(165, 150, 45, 45);

		mybutton7 = new JButton("7");
		mybutton7.setBounds(15, 100, 45, 45);

		mybutton8 = new JButton("8");
		mybutton8.setBounds(65, 100, 45, 45);

		mybutton9 = new JButton("9");
		mybutton9.setBounds(115, 100, 45, 45);

		mybutton10 = new JButton("(");
		mybutton10.setBounds(215, 100,45,45 );

		mybutton11 = new JButton(")");
		mybutton11.setBounds(215, 150,45,45 );

		buttonSqrt = new JButton("√");
		buttonSqrt.setBounds(215, 200,45,45 );


		buttonCbrt = new JButton("Cbrt");
		buttonCbrt.setBounds(215, 250,45,45 );



		MemorySave = new JButton("MS");
		MemorySave.setBounds(260, 100, 40, 100 );

		MemoryRecall = new JButton("MR");
		MemoryRecall.setBounds(260, 200,40,100 );

		buttonPercent = new JButton("%");
		buttonPercent.setBounds(260,300, 40, 45 );

		mybuttonDivide = new JButton("/");
		mybuttonDivide.setBounds(165, 100, 45, 45);

		mybuttonClear = new JButton("cl");
		mybuttonClear.setBounds(235, 55, 65, 40);


		buttonSin = new JButton("SIN");
		buttonSin.setBounds(15, 55,65,40 );

		buttonCos = new JButton("COS");
		buttonCos.setBounds(85, 55,65,40);


		buttonTan = new JButton("TAN");
		buttonTan.setBounds(160, 55,65,40);

		mytext1 = new JTextField(20);
		mytext1.setText("0.0");
		mytext1.setBounds(15, 5,285, 20);
		mytext2 = new JTextField(20);
		mytext2.setText("");
		mytext2.setBounds(15, 27, 285, 30);


		add(mypanel);
		//buttons are added inside the mypanel.
		mypanel.add(mybutton0);
		mypanel.add(mybutton1);
		mypanel.add(mybutton2);
		mypanel.add(mybutton3);	
		mypanel.add(mybutton4);
		mypanel.add(mybutton5);
		mypanel.add(mybutton6);
		mypanel.add(mybutton7);
		mypanel.add(mybutton8);
		mypanel.add(mybutton9);

		mypanel.add(mybuttonDecimal);
		mypanel.add(mybuttonPlus);
		mypanel.add(mybuttonMinus);
		mypanel.add(mybuttonMultiply);
		mypanel.add(mybuttonDivide);


		mypanel.add(mybutton10);
		mypanel.add(mybutton11);
		mypanel.add(buttonSin);
		mypanel.add(buttonCos);
		mypanel.add(buttonTan);
		mypanel.add(buttonSqrt);
		mypanel.add(buttonCbrt);
		mypanel.add(buttonLog);
		mypanel.add(buttonSquare);
		mypanel.add(buttonFact);
		mypanel.add(buttonPercent);
		mypanel.add(buttonPI);

		mypanel.add(mybuttonXY);
		mypanel.add(MemorySave);
		mypanel.add(MemoryRecall);


		mypanel.add(mybuttonEqual);
		mypanel.add(mybuttonClear);

		mypanel.add(mytext1);
		mypanel.add(mytext2);

		//The buttons are activated
		mybutton1.addActionListener(this);
		mybutton2.addActionListener(this);
		mybutton3.addActionListener(this);
		mybutton4.addActionListener(this);
		mybutton5.addActionListener(this);
		mybutton6.addActionListener(this);
		mybutton7.addActionListener(this);
		mybutton8.addActionListener(this);
		mybutton9.addActionListener(this);
		mybutton0.addActionListener(this);


		mybutton10.addActionListener(this);
		mybutton11.addActionListener(this);
		buttonSin.addActionListener(this);
		buttonCos.addActionListener(this);
		buttonTan.addActionListener(this);
		buttonSqrt.addActionListener(this);
		buttonCbrt.addActionListener(this);
		buttonLog.addActionListener(this);
		buttonSquare.addActionListener(this);
		buttonFact.addActionListener(this);
		buttonPercent.addActionListener(this);
		buttonPI.addActionListener(this);
		mybuttonXY.addActionListener(this);
		MemorySave.addActionListener(this);
		MemoryRecall.addActionListener(this);


		mybuttonDecimal.addActionListener(this);
		mybuttonPlus.addActionListener(this);
		mybuttonMinus.addActionListener(this);
		mybuttonMultiply.addActionListener(this);
		mybuttonDivide.addActionListener(this);
		mybuttonEqual.addActionListener(this);
		mybuttonClear.addActionListener(this);
		mypanel.setBackground(Color.blue);
	}

	//methods
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame Calculator = new Calculator();
		Calculator.setTitle("ScientificCalculator");
		Calculator.setSize(320,400);
		Calculator.setLocation(20, 200);
		Calculator.setVisible(true);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}
	//method for factorial.
	private double fact(double z) {
		long fact=1;
		for(int k=1;k<=z;k++) {
			fact = fact*k;
		}
		return fact;
	}
	
	public void actionPerformed(ActionEvent e)
	{

		double nummemory =0.0;
		//Code to perform calculations


		if (e.getSource()==mybutton0)
		{
			if (firstEntry == true)
			{
				mytext1.setText("0");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "0");
		}		
		//Numbers
		else if (e.getSource()==mybutton1) {

			if (firstEntry == true)
			{
				mytext1.setText("1");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "1");
		}

		else if (e.getSource()==mybutton2)
		{
			if (firstEntry == true)
			{
				mytext1.setText("2");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "2");
		}

		else if (e.getSource()==mybutton3)
		{
			if (firstEntry == true)
			{
				mytext1.setText("3");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "3");
		}

		else if (e.getSource()==mybutton4)
		{
			if (firstEntry == true)
			{
				mytext1.setText("4");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "4");
		}

		else if (e.getSource()==mybutton5)
		{
			if (firstEntry == true)
			{
				mytext1.setText("5");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "5");
		}

		else if (e.getSource()==mybutton6)
		{
			if (firstEntry == true)
			{
				mytext1.setText("6");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "6");
		}

		else if (e.getSource()==mybutton7)
		{
			if (firstEntry == true)
			{
				mytext1.setText("7");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "7");
		}

		else if (e.getSource()==mybutton8)
		{
			if (firstEntry == true)
			{
				mytext1.setText("8");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "8");
		}

		else if (e.getSource()==mybutton9)
		{
			if (firstEntry == true)
			{
				mytext1.setText("9");
				firstEntry = false;
			}
			else
				mytext1.setText(mytext1.getText() + "9");
		}

		else if (e.getSource()==mybuttonDecimal)
		{
			if (firstperiod == false)
			{
				mytext1.setText(mytext1.getText() + ".");
				firstperiod = true;
			}
		}





		else if (e.getSource()==mybutton10)
		{
			if (firstperiod == false)
			{
				mytext1.setText(mytext1.getText() + "(");
				firstperiod = true;
			}
		}

		else if (e.getSource()==mybutton11)
		{
			if (firstperiod == false)
			{
				mytext1.setText(mytext1.getText() + ")");
				firstperiod = true;
			}
		}

		//Scientific Options

		else if (e.getSource()==buttonSin) {

			num= Math.sin(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}

		else if (e.getSource()==buttonCos) {

			num = Math.cos(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}
		else if (e.getSource()==buttonTan) {

			num = Math.tan(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}
		else if (e.getSource()==buttonSqrt) {

			num = Math.sqrt(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}

		else if (e.getSource()==buttonCbrt) {

			num = Math.cbrt(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}

		else if (e.getSource()==buttonLog) {

			num = Math.log(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}///////
		else if (e.getSource()==buttonSquare) {

			num = (Double.parseDouble(mytext1.getText()))*(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}///////////n!
		else if (e.getSource()==buttonFact) {

			num = fact(Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}///////////
		else if (e.getSource()==buttonPercent) {

			num = (Double.parseDouble(mytext1.getText())/100);
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}

		else if (e.getSource()==buttonPI) {

			num = Math.PI* (Double.parseDouble(mytext1.getText()));
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}


		else if (e.getSource()==MemorySave) {

			nummemory = Double.parseDouble(mytext1.getText());
			mytext2.setText(String.valueOf(num));
			mytext1.setText("");
			firstperiod = false;

		}
		else if (e.getSource()==MemoryRecall) {

			mytext2.setText(String.valueOf(nummemory));
			mytext1.setText("");
			firstperiod = false;

		}


		//Mathematics Operations


		else if (e.getSource()==mybuttonPlus)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "+";
				firstperiod = false;
			}
		}
		else if (e.getSource()==mybuttonMinus)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "-";
				firstperiod = false;
			}
		}
		else if (e.getSource()==mybuttonMultiply)
		{				
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "*";
				firstperiod = false;
			}
		}
		else if (e.getSource()==mybuttonDivide)
		{
			if (lastOperation.equalsIgnoreCase("+"))
			{
				num = num + Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("-"))
			{
				num = num - Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("*"))
			{
				num = num * Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else if (lastOperation.equalsIgnoreCase("/"))
			{
				num = num / Double.parseDouble(mytext1.getText());
				mytext2.setText(String.valueOf(num));
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
			else 
			{
				num = Double.parseDouble(mytext1.getText());	
				mytext1.setText("");
				lastOperation = "/";
				firstperiod = false;
			}
		}

		else if (e.getSource()==mybuttonEqual) {

			{if (mytext1.getText().equals("")) {
				mytext2.setText("");
			}else {
				if (lastOperation.equals("+"))
					mytext2.setText(String.valueOf(num+Double.parseDouble(mytext1.getText())));
				else if (lastOperation.equals("-"))
					mytext2.setText(String.valueOf(num-Double.parseDouble(mytext1.getText())));
				else if (lastOperation.equals("*"))
					mytext2.setText(String.valueOf(num*Double.parseDouble(mytext1.getText())));
				else if (lastOperation.equals("/"))
					mytext2.setText(String.valueOf(num/Double.parseDouble(mytext1.getText())));
				firstEntry = true;
				firstperiod = false;
				result = 0;
			}}}



		else if (e.getSource()==mybuttonClear)
		{
			mytext1.setText("0.0");
			mytext2.setText("");
			firstEntry = true;
			firstperiod = false;
			lastOperation="";
			result = 0;
			num = 0.0; 
		}

	}



}

