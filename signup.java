package jframe;

//import java.awt.event.*;
import javax.swing.*;

public class signup {

	public signup() {
		ImageIcon icon = new ImageIcon("E:\\images\\logo3.png");
		String[] s= {"Male","Female","Others"};
		JFrame f=new JFrame("Password Field Example");    
	     final JLabel label = new JLabel();            
	     label.setBounds(20,150, 200,50);   
	     
	     JLabel l1=new JLabel("Full name:");    
	        l1.setBounds(155,80, 80,30); 
	        
	        final JTextField text = new JTextField();  
	        text.setBounds(220,80, 200,30);  
	        
	        JLabel l2 = new JLabel("mobile no:");
	        l2.setBounds(155,120,80,30);
	        
	        final JTextField t1 = new JTextField();  
	        t1.setBounds(220,120, 200,30);  
	        
	        JLabel l3 = new JLabel("state:");
	        l3.setBounds(180,160,80,30);
	        
	        final JTextField t2 = new JTextField();  
	        t2.setBounds(220,160, 200,30);  
	        
	        JLabel l4 = new JLabel("city:");
	        l4.setBounds(185,200,60,30);
	        
	        final JTextField t3 = new JTextField();  
	        t3.setBounds(220,200, 200,30);  
	        
	        JLabel l5 = new JLabel("college:");
	        l5.setBounds(165,240,80,30);
	        
	        final JTextField t4 = new JTextField();  
	        t4.setBounds(220,240, 200,30);
	        
	        JLabel l6 = new JLabel("Gender:");
	        l6.setBounds(165,280,80,30);
	        
	        
	        JComboBox<String> t5 = new JComboBox<>(s);
	        t5.setBounds(220,280,80,30);
	        
	        
	        
//		    
//	        JRadioButton r = new JRadioButton("Teacher");
//	        r.setBounds(140, 360, 100, 30);
//	        r.setFocusable(false);
//	        
//	        JRadioButton r1 = new JRadioButton("Student");
//	        r1.setBounds(280, 360, 100, 30);
//	        r1.setFocusable(false);
//	        
//	        r.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					new teacher();
//				}
//	        	
//	        });
//	        
//	        r1.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					new student();
//				}
//	        	
//	        });
//	        
	        
	        
	        
	       f.add(label);
	       f.add(l1);
	       f.add(text);
	       f.add(l2);
	       f.add(t1);
	       f.add(l3);
	       f.add(t2);
	       f.add(l4);
	       f.add(t3);
	       f.add(l5);
	       f.add(t4);
	       f.add(l6);
	       f.add(t5);
//	       f.add(r1);
//	       f.add(r);
	       f.setSize(2000,2000);    
	       f.setLayout(null);    
	       f.setVisible(true);  
	       f.setIconImage(icon.getImage());
	}
	public static void main (String[] args) {
		new signup();
	}
}

