package jframe;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Homepage {
	JButton bk[];
	boolean l;

	public Homepage() {
		
		bk = new JButton[40];
		JMenuBar menubar=new JMenuBar();
		JMenu Menu= new JMenu("Menu");
   		JMenu File= new JMenu("File");
   		JMenu Back= new JMenu("Back");
   		
   		menubar.add(Menu);
   		menubar.add(File);
   		menubar.add(Back);
   		
   		
   		
   		JPanel p1= new JPanel();
   		JPanel p2= new JPanel();
   		JPanel p3= new JPanel();
   		JPanel p4= new JPanel();
   		JPanel p5= new JPanel();
   		
   		JTabbedPane tp =new JTabbedPane();
   		tp.addTab("Home",p1);
   		tp.addTab("Community",p2);
   		tp.addTab("Challenge",p3);
   		tp.addTab("Activity",p4);
   		tp.addTab("Account",p5);
   		
   		
   		JLabel l1=new JLabel();
   		l1.setText("Graduating course:");
   		l1.setBounds(65, 100,130,20);
   		l1.setFont(new Font("Arial",Font.CENTER_BASELINE,13));
   		
   		JLabel l2=new JLabel();
   		l2.setText("Year Of Study:");
   		l2.setBounds(92, 155,130,20);
   		l2.setFont(new Font("Arial",Font.CENTER_BASELINE,13));
   		
   		JButton b1 = new JButton("Next");
   		b1.setFocusable(false);
   		b1.setBounds(200,220,80,30);			        	
   		
   		JLabel l3=new JLabel("Select your stream :");
   		l3.setFont(new Font("Arial",Font.BOLD,16));
   		l3.setVisible(false);
   		l3.setBounds(163,270,200,100);
   		
   		JButton b=new JButton("IT");
   		b.setFocusable(false);
   		b.setVisible(false); 		
	    b.setBounds(150,370,80,30);
	    b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				b.setEnabled(false);
				l=true;	
			}
	    });
	    
	    
	     
	    JButton c=new JButton("CSE");
	    c.setFocusable(false);
	    c.setVisible(false); 		
	    c.setBounds(250,370,80,30);
	     
	    JButton e=new JButton("ECE");
	    e.setFocusable(false);
	    e.setVisible(false); 		
	    e.setBounds(150,420,80,30);
	   
	    JButton ch=new JButton("CHEM");
	    ch.setFocusable(false);
	    ch.setVisible(false); 	
	    ch.setBounds(250,420,80,30);
	  
	    JButton m=new JButton("MECH");
	    m.setFocusable(false);
	    m.setVisible(false);		
	    m.setBounds(150,470,80,30);
	   
	    JButton ee=new JButton("EEE");
	    ee.setFocusable(false);
	    ee.setVisible(false);  		
	    ee.setBounds(250,470,80,30);	 
	    
	    JButton ci = new JButton("CIVIL");
	    ci.setFocusable(false);
	    ci.setVisible(false);   
	    ci.setBounds(150,520,80,30);
	   	    
	    JButton cm= new JButton("CSM");
	    cm.setFocusable(false);
	    cm.setVisible(false);
	    cm.setBounds(250,520,80,30);
	    
	    JButton bo = new JButton("Books");
	    bo.setFocusable(false);
	    bo.setVisible(false);  		
	    bo.setBounds(200,590,80,30);
	    
		
	   	 b1.addActionListener(new ActionListener() {
	   		
	   						@Override
	  						public void actionPerformed(ActionEvent e1) {
	 							// TODO Auto-generated method stub
	   							l3.setVisible(true);
	   							b.setVisible(true);
	   							c.setVisible(true);
	   							e.setVisible(true);
	   							ch.setVisible(true);
	   							m.setVisible(true);
	   							ee.setVisible(true);
	   							ci.setVisible(true);
	   							cm.setVisible(true);
	   							bo.setVisible(true);
	   						
	 						}
	   						
	   	 }); 
	    
	    
	    JLabel l4 =new JLabel("INSTRUCTIONS :-");
	    l4.setFont(new Font("Classic",Font.BOLD,15));
	    l4.setBounds(7,610,140,30);
	    
	    JTextArea t1 = new JTextArea("");
	    t1.setEditable(true);
	    
	    t1.setBounds(5,650,550,358);
   		
   		String[] selectDegree= {"select","B.Tech","M.Tech","MBBS","M.S","M.phil","P.G"};
   		JComboBox<?> cb=new JComboBox <>(selectDegree);
   		cb.setBounds(200, 100, 150, 30);
   		cb.setEditable(true);
   		
   		String[] yos= {"select","1st year","2nd year","3rd year","4th year"};
   		JComboBox<?> cb1=new JComboBox <>(yos);
   		cb1.setBounds(200, 155, 150, 30);
   		cb1.setEditable(true);
   		
   		JPanel bow = new JPanel(new GridLayout(5,4,40,80));
   		p1.add(bow);
   		
   		for(int i=0;i<40;i++)
   		{
   			int k =i+1;
   			bk[i] = new JButton("Book"+k);
   			bow.add(bk[i]);
   			bk[i].setVisible(false);
   			
   		}
		
		 bo.addActionListener(new ActionListener() {
		   		
				@Override
				public void actionPerformed(ActionEvent e1) {
					if(l) {
					for(int i=0;i<40;i++)
						bk[i].setVisible(true);
					}
				}
				
}); 

		JFrame f= new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       f.setTitle("SCHOLARS VIEW");
	       f.setResizable(true);
	       f.setSize(2000,2000);
	       f.setJMenuBar(menubar);
	       f.setVisible(true);
	       f.add(tp);
    	   ImageIcon icon = new ImageIcon("C:\\Users\\JATHIN\\Desktop\\sparrow\\logo.png");
    	   f.setIconImage(icon.getImage());
    	   f.setLayout(null);
    	   f.getContentPane().setBackground(new Color(216,202,201));
    	   tp.setBounds(560,10,1320,1000);
    	   f.add(l1);
    	   f.add(l2);
    	   f.add(b1);
    	   f.add(l3);
    	   f.add(b);
    	   f.add(c);
    	   f.add(e);
    	   f.add(ch);
    	   f.add(m);
    	   f.add(ee);
    	   f.add(ci);
    	   f.add(cm);
    	   f.add(bo);
    	   f.add(l4);
    	   f.add(t1);
   		   f.add(cb);
   		   f.add(cb1);
   		  
   		
	}

	public static void main(String[] args) {
		new Homepage();

	}

}
