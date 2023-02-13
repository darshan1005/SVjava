package jframe;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Textarea {
	public static void main ( String[] args )
	{
		JFrame frame = new JFrame ();
		JPanel p1  = new JPanel();
	    JPanel middlePanel = new JPanel ();
	    middlePanel.setBorder ( new TitledBorder ( new EtchedBorder (), "Terms os uses and privcy policy" ) );
	    JCheckBox b = new JCheckBox("I agree with all the terms");
	    b.setBounds(10, 100, 10, 5);
	

	    JTextArea display = new JTextArea (30,62);
	    
	    display.setEditable ( false ); 
	    display.setText(" PRIVACY POLICY :\r\n"
	    		+ "\r\n"
	    		+  " Your privacy is important to us. It is SCHOLARS VIU.com's policy to respect your privacy regarding\r\n"	    		
	    		+  " any information we may collect from you across our website, SCHOLARS VIU.com, we own and operate.\r\n"	    		
	    		+  " We only ask for personal information when we truly need it to provide a service to you. We collect \r\n"	    		
	    		+  " it by fair and lawful means,with your knowledge and consent. We also let you know why we’re collecting \r\n"	    		
	    		+  " it and how it will be used. We only retain collected information for as long as necessary to provide \r\n"	    		
	    		+  " you with your requested service. What data we store, we’ll protect within commercially acceptable means \r\n"	    		
	    		+  " to prevent loss in save and Downloaded books data, as well as unauthorised access, disclosure, copying,\r\n"
	    		+  " use or modification.\r\n"	    		
	    		+  " We don’t share any personally identifying information publicly or with third-parties, except when required \r\n"	    		
	    		+  " to by law.Our website was not linked to external sites that are not operated by us. Please be aware that we  \r\n"	    		
	    		+  " have no control over the content and practices of these sites, and cannot accept responsibility or liability \r\n"	    		
	    		+  " for their respective privacy policies.You are free to refuse our request for your personal information, with \r\n"	    		
	    		+  " the understanding that we may be unable to provide you with some of your desired services.\r\n"	    		
	    		+  " Your continued use of our website will be regarded as acceptance of our practices around privacy and personal\r\n"	    		
	    		+  " info. If you have any questions about how we handle user data and personal information, feel free to contact us.\r\n"
	    		+  "\r\n"
	    		+  " MORE INFORMATION :\r\n"
	    		+  "\r\n"
	    		+  " Hopefully that has clarified things for you and as was previously mentioned if there is something that you aren't \r\n"	    		
	    		+  " sure whether you need or not it's usually safer to leave cookies enabled in case it does interact with one of \r\n"
	    		+  " the features you use on our site.\r\n"
	    		+  "\r\n"
	    		+  " This policy is effective as of the day you registered in SCHOLARS VIU.com.\r\n"
	    		+  "\r\n"
	    		+  "\r\n"
	    		+  " THANK YOU . . ,\r\n");

	    JScrollPane scroll = new JScrollPane ( display );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
	    JScrollBar hbar=new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
	    JScrollBar vbar=new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
	  
	   middlePanel.add ( scroll );


	    
	    frame.add ( middlePanel );
		frame.setTitle("Scholers viu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(500,500);
		
	    frame.pack ();
	    frame.setLocationRelativeTo ( null );
	    frame.setVisible ( true );
	      frame.add(hbar);
	    frame.add(vbar);
	    frame.add(b);
	    frame.add(p1);
	}
}
