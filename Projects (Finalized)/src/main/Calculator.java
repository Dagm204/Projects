package main;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	
    // Start Date: (12/16/21) - End date: 12/30/21)  Updates(1);
	
	static JFrame frame;
	static JButton per, CE, C, del, OneOverX, XSquared, SquareRoot, div, mul, sub, add, equal, dec, neg, zero, one, 
				   two, three, four, five, six, seven, eight, nine;
	static JTextField text;
	static JPanel panel_north, panel_center;
	static JLabel entry, history;
	
	public static String t_text;
	public static String e_entry;
	public static double calcpH;
	public static double calcOneOverX;
	public static double calcXSquared;
	public static double calcSquaredRoot;
	public static double calcper;
	public static double equalpH;
	public static boolean equaler;
	public static boolean addOpener;
	public static boolean subOpener; 
	public static boolean mulOpener; 
	public static boolean divOpener; 
	public static boolean perOpener;
	public static boolean decAccept;
	public static int counter =0; 
	

	public static void main(String [] args)  {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		panel_north = new JPanel();
		panel_center = new JPanel();
		
		
		
		per = new JButton("%");
		CE = new JButton("CE");
		C = new JButton("C");
		del = new JButton("<=");
		OneOverX = new JButton("1/x");
		XSquared = new JButton("x^2");
		SquareRoot = new JButton("√x");
		div = new JButton("÷");
		mul = new JButton("×");
		sub = new JButton("-");
		add = new JButton("+");
		equal = new JButton("=");
		dec = new JButton(".");
		neg = new JButton("+/-");
		zero = new JButton("0");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		entry = new JLabel("");
		text = new JTextField(15);
		
		text.setBounds(75,25,170,28);
		entry.setBounds(270,12,480,55);
		per.setBounds(50,70,55,42);
		CE.setBounds(110,70,55,42);
		C.setBounds(170,70,55,42);
		del.setBounds(230,70,55,42);
		OneOverX.setBounds(50,120,55,42);
		XSquared.setBounds(110,120,55,42);
		SquareRoot.setBounds(170,120,55,42);
		div.setBounds(230,120,55,42);
		seven.setBounds(50,170,55,42);
		eight.setBounds(110,170,55,42);
		nine.setBounds(170,170,55,42);
		mul.setBounds(230,170,55,42);
		four.setBounds(50,220,55,42);
		five.setBounds(110,220,55,42);
		six.setBounds(170,220,55,42);
		sub.setBounds(230,220,55,42);
		one.setBounds(50,270,55,42);
		two.setBounds(110,270,55,42);
		three.setBounds(170,270,55,42);
		add.setBounds(230,270,55,42);
		neg.setBounds(50,320,55,42);
		zero.setBounds(110,320,55,42);
		dec.setBounds(170,320,55,42);
		equal.setBounds(230,320,55,42);

		frame.add(text);
		frame.add(per);
		frame.add(CE);
		frame.add(C);
		frame.add(del);
		frame.add(OneOverX);
		frame.add(XSquared);
		frame.add(SquareRoot);
		frame.add(div);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(mul);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(sub);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(add);
		frame.add(neg);
		frame.add(zero);
		frame.add(dec);
		frame.add(equal);
		frame.add(entry);
		
		frame.add(panel_north, BorderLayout.NORTH);
		frame.add(panel_center, BorderLayout.CENTER);
		
		frame.setSize(450,450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		per.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				perOpener = true; 
				
				if(!(entry.getText().toString().equals(""))) {
				e_entry = entry.getText().toString();
				t_text = text.getText().toString();
				calcper = Double.valueOf(t_text);
				calcper = calcper/100;
				if(((e_entry.substring(e_entry.length()-1)).equals("+"))) {
					e_entry =e_entry.substring(0,e_entry.length()-1);
					calcpH = Double.valueOf(e_entry);
					calcper = calcpH * calcper;
					calcpH = calcpH + calcper; 
					entry.setText(String.valueOf(calcpH));
					text.setText("");
				}
				else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
					e_entry =e_entry.substring(0,e_entry.length()-1);
					calcpH = Double.valueOf(e_entry);
					calcper = calcpH * calcper;
					calcpH = calcpH - calcper; 
					entry.setText(String.valueOf(calcpH));
					text.setText("");
				}
				else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
					e_entry =e_entry.substring(0,e_entry.length()-1);
					calcpH = Double.valueOf(e_entry);
					calcpH = calcpH * calcper;
					entry.setText(String.valueOf(calcpH));
					text.setText("");
				}
				else if((e_entry.substring(e_entry.length()-1)).equals("÷")) {
					e_entry =e_entry.substring(0,e_entry.length()-1);
					calcpH = Double.valueOf(e_entry);
					calcper = calcpH * calcper;
					calcpH = calcpH / calcper; 
					entry.setText(String.valueOf(calcpH));
					text.setText("");
					
				}
				else
					entry.setText("0");
					text.setText("");
			}
				else if(!(text.getText().toString().equals(""))) {
					entry.setText("0");
					text.setText("");
				}
			}
		});
		CE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				if(!(text.getText().toString().equals("")))
					text.setText("");
				else {
					entry.setText("");
					text.setText("");
					counter = 0;
				}
				
			}
		});
		C.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText("");
				entry.setText("");
				counter = 0;
			}
		});
		neg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				try {
					t_text = text.getText().toString();
				
					if((text.getText().toString()).equals(""))
						text.setText("-");
					
					if((!(text.getText().toString()).equals(""))) {
					
						if(t_text.substring(0,1).equals("-")) {
							t_text = t_text.substring(1,t_text.length());
						}
						else 
							t_text = "-" + t_text;
					
						text.setText(t_text);
					}
				}
				catch(Exception e) {
					
				}
				
			}
		});
		OneOverX.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				if((!(text.getText().toString()).equals("")) && ((entry.getText().toString()).equals(""))) {
					t_text = text.getText().toString();
					calcpH = Double.valueOf(t_text);
					calcpH = 1/calcpH;
					entry.setText(String.valueOf(calcpH));
					text.setText(""); 
					counter++;
					
				}
				else if((!(text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
					t_text = text.getText().toString();
					calcOneOverX = Double.valueOf(t_text);
					calcOneOverX = 1/calcOneOverX;
					e_entry = entry.getText().toString();
				
					
					if((e_entry.substring(e_entry.length()-1)).equals("+")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH + calcOneOverX;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH - calcOneOverX;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH * calcOneOverX;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("÷")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH / calcOneOverX;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					
					
				}
				else if(((text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
					e_entry = entry.getText().toString();
					if((!(e_entry.substring(e_entry.length()-1)).equals("+")) || (e_entry.substring(e_entry.length()-1)).equals("-") || (e_entry.substring(e_entry.length()-1)).equals("-") || (e_entry.substring(e_entry.length()-1)).equals("÷")) {
						calcpH = Double.valueOf(e_entry);
						calcpH = 1 / calcpH;
						entry.setText(String.valueOf(calcpH));
					}
				}
			}
		});
		XSquared.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed (ActionEvent i) {
				if((!(text.getText().toString()).equals("")) && ((entry.getText().toString()).equals(""))) {
					t_text = text.getText().toString();
					calcpH = Double.valueOf(t_text);
					calcpH = calcpH * calcpH;
					entry.setText(String.valueOf(calcpH));
					text.setText(""); 
					counter++;
					
				}
				else if((!(text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
					t_text = text.getText().toString();
					calcXSquared = Double.valueOf(t_text);
					calcXSquared = calcXSquared * calcXSquared;
					e_entry = entry.getText().toString();
					
					if((e_entry.substring(e_entry.length()-1)).equals("+")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH + calcXSquared;
						entry.setText(String.valueOf(calcpH));
						text.setText("");

						
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH - calcXSquared;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH * calcXSquared;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("÷")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH / calcXSquared;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					
					
				}
				else if(((text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
					e_entry = entry.getText().toString();
					if((!(e_entry.substring(e_entry.length()-1)).equals("+")) || (e_entry.substring(e_entry.length()-1)).equals("-") || (e_entry.substring(e_entry.length()-1)).equals("-") || (e_entry.substring(e_entry.length()-1)).equals("÷")) {
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH * calcpH;
						entry.setText(String.valueOf(calcpH));
					}
				}
			}
		});
		SquareRoot.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				
				try {
					if((!(text.getText().toString()).equals("")) && ((entry.getText().toString()).equals(""))) {
						t_text = text.getText().toString();
						calcpH = Double.valueOf(t_text);
						calcpH = Math.sqrt(calcpH);
						entry.setText(String.valueOf(calcpH));
						text.setText(""); 
						counter++;
					
					}
					else if((!(text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
					
						t_text = text.getText().toString();
						calcSquaredRoot = Double.valueOf(t_text);
						calcSquaredRoot = Math.sqrt(calcSquaredRoot);
						e_entry = entry.getText().toString();
					
						if((e_entry.substring(e_entry.length()-1)).equals("+")) {
							e_entry =e_entry.substring(0,e_entry.length()-1);
							calcpH = Double.valueOf(e_entry);
							calcpH = calcpH + calcSquaredRoot;
							entry.setText(String.valueOf(calcpH));
							text.setText("");
						
						}
						else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
							e_entry =e_entry.substring(0,e_entry.length()-1);
							calcpH = Double.valueOf(e_entry);
							calcpH = calcpH - calcSquaredRoot;
							entry.setText(String.valueOf(calcpH));
							text.setText("");
						}
						else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
							e_entry =e_entry.substring(0,e_entry.length()-1);
							calcpH = Double.valueOf(e_entry);
							calcpH = calcpH * calcSquaredRoot;
							entry.setText(String.valueOf(calcpH));
							text.setText("");
						}
						else if((e_entry.substring(e_entry.length()-1)).equals("÷")) {
							e_entry =e_entry.substring(0,e_entry.length()-1);
							calcpH = Double.valueOf(e_entry);
							calcpH = calcpH / calcSquaredRoot;
							entry.setText(String.valueOf(calcpH));
							text.setText("");
						}
					
					
					}
					else if(((text.getText().toString()).equals("")) && (!(entry.getText().toString()).equals(""))) {
	
						e_entry = entry.getText().toString();
							calcpH = Double.valueOf(e_entry);
							calcpH = Math.sqrt(calcpH);
							entry.setText(String.valueOf(calcpH));
								
					}
				}
				catch (Exception e) {
					
				}
			}
			
		});
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
			
				equaler = true;
				addOpener = false; 
				subOpener = false; 
				mulOpener = false;
				divOpener = false; 
				perOpener = false; 
				
				if(entry.getText().toString().equals("Infinity")) {
					entry.setText("");
					counter=0;
				}
				if(counter<1 && (!(text.getText().toString()).equals(""))) {
					entry.setText(text.getText().toString()+"+");
					text.setText("");
					counter++;
					
				}
				else if(counter>=1 && (!(text.getText().toString()).equals(""))){
				
					
				e_entry = entry.getText().toString();
					
				calculation("add");
					
				}
				else if (counter>=1){
					e_entry = entry.getText().toString();
					e_entry =e_entry.substring(0,e_entry.length()-1);
					entry.setText(e_entry+"+");
				}
			}
		});
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				equaler = true;
				addOpener = false; 
				subOpener = false; 
				mulOpener = false;
				divOpener = false; 
				perOpener = false; 
				
				if(entry.getText().toString().equals("Infinity")) {
					entry.setText("");
					counter=0;
				}
				if(counter<1 && (!(text.getText().toString()).equals(""))) {
					entry.setText(text.getText().toString()+"-");
					text.setText("");
					counter++;
					
				}
				else if(counter>=1 && (!(text.getText().toString()).equals(""))){
					
					
					e_entry = entry.getText().toString();
					calculation("subtract");
					
				}
				else if (counter>=1){
					e_entry = entry.getText().toString();
					e_entry =e_entry.substring(0,e_entry.length()-1);
					entry.setText(e_entry+"-");
				}
			}
		});
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				equaler = true;
				addOpener = false; 
				subOpener = false; 
				mulOpener = false;
				divOpener = false; 
				perOpener = false; 
				
				if(entry.getText().toString().equals("Infinity")) {
					entry.setText("");
					counter=0;
				}
				if(counter<1 && (!(text.getText().toString()).equals(""))) {
					entry.setText(text.getText().toString()+"×");
					text.setText("");
					counter++;
					
				}
				else if(counter>=1 && (!(text.getText().toString()).equals(""))){
					
					
					e_entry = entry.getText().toString();
					calculation("multiply");
					
				}
				else if (counter>=1){
					e_entry = entry.getText().toString();
					e_entry =e_entry.substring(0,e_entry.length()-1);
					entry.setText(e_entry+"×");
				}
			}
		});
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				
				equaler = true;
				addOpener = false; 
				subOpener = false; 
				mulOpener = false;
				divOpener = false; 
				perOpener = false; 
				
				if(entry.getText().toString().equals("Infinity")) {
					entry.setText("");
					counter=0;
				}
				if(counter<1 && (!(text.getText().toString()).equals(""))) {
					entry.setText(text.getText().toString()+"÷");
					text.setText("");
					counter++;
					
				}
				else if(counter>=1 && (!(text.getText().toString()).equals(""))){
					
					
					e_entry = entry.getText().toString();
					calculation("divide");
					
				}
				else if (counter>=1){
					e_entry = entry.getText().toString();
					e_entry =e_entry.substring(0,e_entry.length()-1);
					entry.setText(e_entry+"÷");
				}

			}
		});
		equal.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
			
				e_entry = entry.getText().toString();
				if(counter<1 && (!(text.getText().toString()).equals(""))) {
					
					
				}
				if(counter>=1 && ((text.getText().toString()).equals(""))  ){
					if(equaler==true) {
						equalpH = Double.valueOf((entry.getText().toString()).substring(0,entry.getText().length()-1));
						equaler = false;
					}
					

					if(((e_entry.substring(e_entry.length()-1)).equals("+")) || (addOpener==true)) {
						e_entry = entry.getText().toString();
						if((e_entry.substring(e_entry.length()-1)).equals("+")) {
							e_entry =e_entry.substring(0,e_entry.length()-1);
						}	
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH + equalpH;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						addOpener=true;
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("-") || (subOpener==true)) {
						subOpener = true;
						e_entry = entry.getText().toString();
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH - equalpH;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("×") || (mulOpener==true)) {
						mulOpener = true;
						e_entry = entry.getText().toString();
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH * equalpH;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("÷") || (divOpener==true)) {
						divOpener = true;
						e_entry = entry.getText().toString();
						e_entry = entry.getText().toString();
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH / equalpH;
						entry.setText(String.valueOf(calcpH));
						text.setText("");
					}
					
				}
				else if(counter>=1 && (!(entry.getText().toString()).equals("")) && (!(text.getText().toString()).equals(""))){

					if((e_entry.substring(e_entry.length()-1)).equals("+")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH + (Double.valueOf(text.getText()));
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						counter = 0;
						
					}
					else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH - (Double.valueOf(text.getText()));
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						counter = 0; 

					}
					else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
						e_entry =e_entry.substring(0,e_entry.length()-1);
						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH * (Double.valueOf(text.getText()));
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						counter = 0;

					}
					else if((e_entry.substring(e_entry.length()-1)).equals("÷") )  {
			
						e_entry =e_entry.substring(0,e_entry.length()-1);

						calcpH = Double.valueOf(e_entry);
						calcpH = calcpH / (Double.valueOf(text.getText()));
						entry.setText(String.valueOf(calcpH));
						text.setText("");
						counter = 0;

					}
				}
				else if((counter >= 1) || (counter == 0)) {
					if ((!(text.getText().toString().equals(""))) && ((!(text.getText().toString().substring(text.getText().length()-1)).equals("+")) || (!(e_entry.substring(e_entry.length()-1)).equals("-")) || (!(e_entry.substring(e_entry.length()-1)).equals("×")) || (!(e_entry.substring(e_entry.length()-1)).equals("÷")))) {
						entry.setText(text.getText().toString());
						text.setText("");
					}
				}
			}
		});
		dec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				int m = (text.getText()).length();
				t_text = text.getText().toString();
				decAccept = true;
				
				for (int z = 0; z<m; z++) {
					if((t_text.substring(t_text.length()-1).equals("."))) {
						t_text.substring(t_text.length()-1);
						decAccept = false;
						z=m;
					}
					else {
						t_text = t_text.substring(0,t_text.length()-1);
					}
				}
				
				if(decAccept==true) {
					text.setText(text.getText()+".");
					decAccept=false;
				}
			
			}
		});
		del.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed (ActionEvent i) {
				
				try {
				t_text = text.getText().toString();
				t_text = t_text.substring(0,t_text.length()-1);
				text.setText(t_text);
		//		text.setText(h); //refer to line 20 
				}
				catch (StringIndexOutOfBoundsException e) {
					System.out.println("No numbers to delete");
				}
			}
		});
		zero.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"0");
			}
		});
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"1");
				
			}
		});
		two.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"2");
			}
		});
		three.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"3");
			}
		});
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"4");
			}
		});
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent i) {
				text.setText(text.getText()+"5");
			}
		});
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"6");
			}
		});
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"7");
			}
		});
		eight.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"8");
			}
		});
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent i) {
				text.setText(text.getText()+"9");
			}
		});
	}
	
	public static class ButtonListner implements ActionListener {
		
		public void actionPerformed(ActionEvent i) {
			
			if(i.getSource().equals(per)) {
				
			}
			if(i.getSource().equals(CE)) {
				
			}
			if(i.getSource().equals(C)) {
				
			}
			
			
		}
	}
	
	public static void calculation(String n) { //1=add    2=sub        3= mul    4=div  
		
		
		
		if((e_entry.substring(e_entry.length()-1)).equals("+")) {
			e_entry =e_entry.substring(0,e_entry.length()-1);
			calcpH = Double.valueOf(e_entry);
			calcpH = calcpH + (Double.valueOf(text.getText()));
			entry.setText(String.valueOf(calcpH));
			text.setText("");
			
		}
		else if((e_entry.substring(e_entry.length()-1)).equals("-")) {
			e_entry =e_entry.substring(0,e_entry.length()-1);
			calcpH = Double.valueOf(e_entry);
			calcpH = calcpH - (Double.valueOf(text.getText()));
			entry.setText(String.valueOf(calcpH));
			text.setText("");
		}
		else if((e_entry.substring(e_entry.length()-1)).equals("×")) {
			e_entry =e_entry.substring(0,e_entry.length()-1);
			calcpH = Double.valueOf(e_entry);
			calcpH = calcpH * (Double.valueOf(text.getText()));
			entry.setText(String.valueOf(calcpH));
			text.setText("");
		}
		else if((e_entry.substring(e_entry.length()-1)).equals("÷") )  {
			e_entry =e_entry.substring(0,e_entry.length()-1);
			calcpH = Double.valueOf(e_entry);
			calcpH = calcpH / (Double.valueOf(text.getText()));
			entry.setText(String.valueOf(calcpH));
			text.setText("");
		}
		
		if(n.equals("add")) {
			entry.setText(entry.getText().toString()+"+");
			
		}
		else if(n.equals("subtract")) {
			entry.setText(entry.getText().toString()+"-");
			
		}
		else if(n.equals("multiply")) {
			entry.setText(entry.getText().toString()+"×");
		}
		else if(n.equals("divide")) {
			entry.setText(entry.getText().toString()+"÷");
		}
			
	}

}
