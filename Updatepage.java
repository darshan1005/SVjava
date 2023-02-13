package jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Updatepage {
	JFrame fu;
	JPanel pu;
	JTextField t[];
	JLabel l[];
		String[] s= {"select","Male","Female","Others"};
		JMenuBar bar;
	  JMenu m,n,b;
	  JMenuItem m1,m2,m3,n1,n2,n3;
	  JTextArea ta;
	  JFileChooser jf;
	Updatepage(){
		fu = new JFrame();
		pu = new JPanel();
		pu.setForeground(Color.GRAY);
		pu.setBounds(910,40,100,50);
		pu.setLayout(null);
		pu.setVisible(true);
		
		 ta=new JTextArea();
		  ta.setBounds(0,0,fu.getWidth(),fu.getHeight());
		  fu.add(ta);
		  
		  bar=new JMenuBar();
		  fu.setJMenuBar(bar);
		  
		  m=new JMenu("Menu");
		  m.setMnemonic(KeyEvent.VK_R);
		    n= new JMenu("File");
		    b= new JMenu("Back");
		  bar.add(m);
		  bar.add(n);
		  bar.add(b);
		  
		  m1=new JMenuItem("Home");
		  m.add(m1);
		     m2=new JMenuItem("Account");
		   m.add(m2);
		    m3=new JMenuItem("Community");
		  m.add(m3);
		  JMenuItem m4 = new JMenuItem("Challenges");
		  m.add(m4);
		 
		  JMenuItem m5 = new JMenuItem("Books");
		  m.add(m5);
		 
		  JMenuItem m6 = new JMenuItem("Saved/Bookmarks");
		  m.add(m6);
		 
		  JMenuItem m7 = new JMenuItem("Downloads");
		  m.add(m7);
		 
		  JMenuItem m8 = new JMenuItem("Privacy");
		  m.add(m8);
		 
		  JMenuItem m9 = new JMenuItem("Legal policy");
		  m.add(m9);
		 
		  JMenuItem m10 = new JMenuItem("Contact");
		  m.add(m10);
		 
		  JMenuItem m11 = new JMenuItem("LogOut");
		  m.add(m11);
		  
		  n1=new JMenuItem("open");
		  n2=new JMenuItem("save");
		  n3=new JMenuItem("Export");
		  n.add(n1);
		  n.add(n2);
		  n.add(n3);
		  JMenuItem n4=new JMenuItem("Recentfiles");
		  n.add(n4);
		  
		  JMenuItem n5=new JMenuItem("Export");
		  n.add(n5);
		  
		  JMenuItem n6=new JMenuItem("Import");
		  n.add(n6);
		  
		  JMenuItem n7=new JMenuItem("Refresh");
		  n.add(n7);
		  
		  JMenuItem n8=new JMenuItem("Properties");
		  n.add(n8);
		  
		  JMenuItem n9=new JMenuItem("Exit");
		  n.add(n9);
		  
		  l = new JLabel[30];
		    t = new JTextField[14];
		    String[] s= {"Male","Female","Others"};
			String[] s1 = {"           User Name :",
					"                       Email  :",
					"   Mobile number :",
					"                       Age :",
					"Working College :","Teaching Branch :",
					" Teaching Stream :","Work Experience :",
					   "         Qualification :",
					   "                Address :",
					   "   Postal/ZipCode :",
					   "                      State :",
					   "                        City :",
					   "                  Gender :",
					   };
			
			for(int i=0;i<14;i++)
			{
				l[i]=new JLabel(s1[i]);
				l[i].setBounds(650,(40+(50*i)), 200,30); 
				l[i].setFont(new Font("Bahnschrift SemiBold",Font.CENTER_BASELINE,16));
				fu.add(l[i]);
			}
			for(int i=0;i<14;i++) {
				t[i] = new JTextField();
				t[i].setBounds(810,(40+(50*i)),200,30);
				fu.add(t[i]);
				
			}
			
			JComboBox<String> t5 = new JComboBox<>(s);
		    t5.setBounds(810,730,200,30);
		    fu.add(t5);
		    
		    JButton b = new JButton("Update");  
		    b.setBounds(810,850, 100,40);  
		    b.setFocusable(false);
		    fu.add(b);
		    b.setFont(new Font("Classic",Font.BOLD,18));
		    
		   
		fu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fu.setTitle("Scholars viu.com");
		fu.setSize(2000,2000);
		fu.setLayout(null);
		fu.setVisible(true);
		fu.add(pu); 
	}
	public static void main(String[] args) {
		new Updatepage();
	}

}
