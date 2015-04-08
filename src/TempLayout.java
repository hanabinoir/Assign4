import javax.swing.*;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for test
public class TempLayout extends JApplet implements ActionListener{
	JButton key;
	JPasswordField pwd;
	JTextArea txt;
	JPanel p,pln1,pln2,pTest;
	JLabel test;
	Container con;
	String password;
	public void init(){
		p = new JPanel();
		pln1 = new JPanel();
		pln2 = new JPanel();
		pTest = new JPanel();
		test = new JLabel("test");
		txt = new JTextArea();
		pwd = new JPasswordField();
	    pwd.setEditable(true);
		
	    String keys[] = {
	    		"f","g","h","i","y",
	    		"k","r","m","n","s"
	    };
	    
	    for(int i = 0; i < 10;i++){
	    	key = new JButton();
	    	key.setText(keys[i]);
	    	key.addActionListener(this);
	    	if(i <= 4){
	    		pln1.add(key);
	    	}
	    		
	    	else{
	    		pln2.add(key);
	    	}
	    }
	    
	    pln1.setLayout(new GridLayout(1,5,10,10));
	    pln2.setLayout(new GridLayout(1,5,10,10));
	    pTest.setLayout(new GridLayout(1,2));
	    p.setLayout(new GridLayout(4,5,1,3));
	    
	    pTest.add(test);
	    pTest.add(txt);
	    
	    p.add(pwd);
		p.add(pln1);
		p.add(pln2);
		p.add(pTest);
		
		con = getContentPane();
		con.add(p);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		txt.append(e.getActionCommand());
		password += e.getActionCommand();
		pwd.setText(password);
		System.out.print(pwd.getPassword());
	}
}
