package jframe;


import java.awt.Font;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Degreepanel {
	
	
	  JMenuBar bar;
	  JMenu m,n;
	  JMenuItem m1,m2,m3,n1,n2,n3;
	  JFileChooser jf;
	public Degreepanel() {
		// TODO Auto-generated constructor stub
		JFrame frame = new JFrame("select your Degree");
		ImageIcon icon = new ImageIcon("E:\\images\\logo3.png");
		 frame.setSize(500,500);
		  frame.setLayout(null);
		  
		  bar=new JMenuBar();
		  frame.setJMenuBar(bar);
		  
		  m=new JMenu("Menu");
		  m.setMnemonic(KeyEvent.VK_R);
		    n= new JMenu("File");
		  bar.add(m);
		  bar.add(n);
		  
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
		  
		  JMenuItem n7=new JMenuItem("Reframeesh");
		  n.add(n7);
		  
		  JMenuItem n8=new JMenuItem("Properties");
		  n.add(n8);
		  
		  JMenuItem n9=new JMenuItem("Exit");
		  n.add(n9);
		  
		  		  
		String[] s = {"Btech", "MBBs","Mtech","M.S","M.phill","PHD","p.G" };
		String[]  t ={"year","1" ,"2" ,"3" ,"4"};
		
		 
		 JLabel l6 = new JLabel("Select Degree :");
	        l6.setBounds(90,140,200,30);
	        l6.setFont(new Font("Classic",Font.PLAIN,14));
	        
		 JComboBox<String> p = new JComboBox<>(s);
		 p.setBounds(210,140,200,30);
		 
		 JLabel l7 = new JLabel("Select Year :");
	        l7.setBounds(110,190,200,30);
	        l7.setFont(new Font("Classic",Font.PLAIN,14));
	        
		 JComboBox<String> q = new JComboBox<>(t);
		 q.setBounds(210,190,200,30);
		 
		 
		 JButton j = new JButton("Continue");
		 j.setBounds(180, 260,100,30);
		 
//		 j.addActionListener(new ActionListener() {

//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				new selectingdepartment();
//			}
//			 
//		 });
//		 
		 frame.add(p);
		 frame.add(l6);
		 frame.add(q);
		 frame.add(l7);
		 frame.add(j);
		 
			
//		    JButton b=new JButton("Btech");
//		    frame.add(b); 
//		    b.setFocusable(false);
//		    
//		    b.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//					new selectingdepartment();
//					
//				}
//		    	
//		    });
//		    
//		    JButton ch=new JButton("Degree");
//		    frame.add(ch);
//		    ch.setFocusable(false);
//		    
//		    JButton ee=new JButton("M.B.B.S");
//		    frame.add(ee);
//		    ee.setFocusable(false);
//		    
//		    
//		    JButton c=new JButton("Mtech");
//		    frame.add(c);
//		    c.setFocusable(false);
//		   
//		    JButton ci = new JButton("M.S");
//		    frame.add(ci);
//		    ci.setFocusable(false);
//		    
//		    JButton cm= new JButton("M.phil");
//		    frame.add(cm);
//		    cm.setFocusable(false);
//		    
//		    JButton e=new JButton("PHD");
//		    frame.add(e);
//		    e.setFocusable(false);
//	    
//		    JButton m=new JButton("P.G");
//		    frame.add(m);
//		    m.setFocusable(false);
//	    

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		//frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("TextBook.com");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setIconImage(icon.getImage());

	}
public static void main (String[] args) {
	new Degreepanel();
}
}
