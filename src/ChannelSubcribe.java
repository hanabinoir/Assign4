import javax.swing.*;// by default allows you to everything from .swing
import java.awt.*;
import java.lang.reflect.Array;
import java.text.*;
import java.util.*;
import java.awt.event.*;

import javax.swing.border.*;//allows you to create a border inside a border
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.*;


public class ChannelSubcribe extends JApplet 
implements ItemListener, ActionListener, ListSelectionListener{
	JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p8a,
	p9,p9a,p9b,p9c,p9keyboard,p9e,p9f,p9g;

	JComboBox c;
	JList lchannels,lselections;
	JScrollPane jp1,jp2;
	Vector vt1,vt2;
	String chTitle,priceHD,priceStream,price,result,password,genre;
	double totalPrice;
	int opt = 0;
	Image Logo;
	ImageIcon chLogo;
	JRadioButton radHD,radStream;
	ButtonGroup radGrp;
	JLabel lblHD,lblStream,lblLogo;
	JButton subsrcibe,clr,clrAll,key,submit,enter,reset,
	f,g,h,i,j,k,l,m,n,o;
	/*f,g,h,i,j,k,l,m,n,o*/
	JPasswordField card,pwd;
	
	JTextField total;
	Container con;
	
	public void init(){
		p = new JPanel();
		chTitle = new String();
		p.setLayout(new GridLayout(3,3,10,10));
		
		//Genre
		p1 = new JPanel();
		c = new JComboBox();
		c.addItem("Please Select Genre of Channel");
	    c.addItem("All Genres");
	    c.addItem("Entertainment");
	    c.addItem("Movie");
	    c.addItem("News/Business");
	    c.addItem("Sci-Fi");
	    c.addItem("Sports");
		
	    c.addActionListener(this);
	    
	    p1.add(c);
	    
	    p1.setLayout(new FlowLayout());
		p1.setBorder(new TitledBorder("Channel Genre"));
		
		//Channels
		
	    p2 = new JPanel();
	    vt1 = new Vector();
	    lchannels = new JList(vt1);
	    jp1 = new JScrollPane(lchannels);
	    
	    lchannels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    lchannels.addListSelectionListener(this);
		p2.add(jp1);
		p2.setBorder(new TitledBorder("Channel Titles Available"));  
		p2.setLayout(new GridLayout(1,1,10,10));
		//price
		p3 = new JPanel();
		
		radHD = new JRadioButton("Broadcast HD",true);
		radHD.addActionListener(this);
		radStream = new JRadioButton("Internet Streaming",true);
		radStream.addActionListener(this);
		
		lblHD = new JLabel(priceHD);
		lblHD.setBackground(Color.cyan);
		lblHD.setOpaque(true);
		
		lblStream = new JLabel(priceStream);
		lblStream.setBackground(Color.yellow);
		lblStream.setOpaque(true);
		
		radGrp = new ButtonGroup();
		radGrp.add(radHD);
		radGrp.add(radStream);
		
		p3.add(radHD);
		p3.add(lblHD);
		p3.add(radStream);
		p3.add(lblStream);
		
		p3.setLayout(new GridLayout(2,2,2,2));
		p3.setBorder(new TitledBorder("Format/Prices"));
				
		//logo
		p4 = new JPanel();
		lblLogo = new JLabel();
		
		p4.add(lblLogo);
		p4.setLayout(new GridLayout(1,1,10,10));
		p4.setBorder(new TitledBorder("Channel Logo"));
		
		//subscribe
		p5 = new JPanel();
		subsrcibe = new JButton("Subscribe");
		
		subsrcibe.addActionListener(this);
		
		p5.add(subsrcibe);
		p5.setLayout(new GridLayout(1,1,10,10));
		
		//blank
		p6 = new JPanel();
		p6.setLayout(new GridLayout(1,1,10,10));
		
		//selections
		p7 = new JPanel();
		vt2 = new Vector();
		lselections = new JList(vt2);
		jp2 = new JScrollPane(lselections);
		
	    lselections.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    lselections.addListSelectionListener(this);
		p7.add(jp2);
		p7.setBackground(Color.white);
	    p7.setBorder(new TitledBorder("Your Selections"));
	    p7.setLayout(new GridLayout(1,1,10,10));
		
		//options
	    p8a = new JPanel();
	    p8 = new JPanel();
	    
	    clr = new JButton("Clear");
	    clr.addActionListener(this);    
	    clrAll = new JButton("Clear All");
	    clrAll.addActionListener(this);    
	    submit = new JButton("Submit");
	    submit.addActionListener(this); 
	    total = new JTextField("Total: ",20); //"Total: " + your selection Jlist,20
	    Color color = Color.CYAN;
	    total.setBackground(color);
	    total.addActionListener(this);
	    total.setEditable(false);
	    total.setText("Total: ");
	    JLabel jlbPassword = new JLabel("Enter Credit Card#: ");
		card = new JPasswordField(15);

	    p8.setLayout(new GridLayout(5,1,10,10));
	    p8a.setLayout(new FlowLayout(FlowLayout.CENTER,10,1));
	   
	    p8.add(clr);
	    p8.add(clrAll);
	    p8.add(total);
	    p8a.add(jlbPassword);
	    p8a.add(card);
	    p8.add(p8a);
	    p8.add(submit);
		
		
		//employee
	    p9 = new JPanel();
	    p9b = new JPanel();
	    p9c = new JPanel();
	    p9keyboard = new JPanel();
	    p9e = new JPanel();
	    p9f = new JPanel();
	    p9g = new JPanel();

	   JLabel text = new JLabel("Use Keypad to enter password for settings");
	    
	    pwd = new JPasswordField();
	    pwd.setEditable(true);
	    
	    String keys[] = {
	    		"f","g","h","i","y",
	    		"k","r","m","n","s"
	    };
	    
	    for(int i = 0; i < 10;i++){
	    	key = new JButton(keys[i]);
	    	if(i <= 4)
	    		p9b.add(key);
	    	else
	    		p9c.add(key);
	    	key.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent k) {
					// TODO Auto-generated method stub
					String letter = k.getActionCommand();
					password += letter;
					pwd.setText(password);
				}
			});
	    }
	    
		enter = new JButton("Enter");
		enter.addActionListener(this);
		reset = new JButton("Reset");
		reset.addActionListener(this);
		
		p9b.setLayout(new GridLayout(1,5,10,10));
		p9c.setLayout(new GridLayout(1,5,10,10));
		
	    p9keyboard.setLayout(new GridLayout(2,5,1,3));
	    p9keyboard.add(p9b);
	    p9keyboard.add(p9c);

	    p9e.setLayout(new GridLayout(1,1,1,0));
	    p9e.add(enter);

	    p9f.setLayout(new GridLayout(1,1,1,0));
	    p9f.add(reset);
	    
	    p9g.setLayout(new GridLayout(1,2,3,0));
	    p9g.add(p9e);
	    p9g.add(p9f);
	    
	    p9.setBackground(Color.red);
	    p9.setBorder(new TitledBorder("For Employee use ONLY"));    
	    p9.setLayout(new GridLayout(4,1,10,3));
	   
	    p9.add(text);
	    p9.add(pwd);
	    p9.add(p9keyboard);
	    p9.add(p9g);

		//all panels
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		p.add(p7);
		p.add(p8);
		p.add(p9);
		
		con = getContentPane();
		con.add(p);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ChannelList cl = new ChannelList();
	    cl.createList();
	    
	    int idx = lselections.getSelectedIndex();
	    
	  //determine JList by JCombobox selecton
	  	genre = c.getSelectedItem().toString();
	  	
	  	if(e.getSource() == c){
	  		vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				switch(genre){
				case "Please Select Genre of Channel":
					lchannels.setListData(vt1);
					break;
				case "All Genres":
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
					break;
				case "Entertainment":
					if(chGenre == 'e'){
						vt1.add(cl.chList[i].getChTitle());
						lchannels.setListData(vt1);
					}
					break;
				case "Movie":
					if(chGenre == 'm'){
						vt1.add(cl.chList[i].getChTitle());
						lchannels.setListData(vt1);
					}
					break;
				case "News/Business":
					if(chGenre == 'n'){
						vt1.add(cl.chList[i].getChTitle());
						lchannels.setListData(vt1);
					}
					break;
				case "Sci-Fi":
					if(chGenre == 's'){
						vt1.add(cl.chList[i].getChTitle());
						lchannels.setListData(vt1);
					}
					break;
				case "Sports":
					if(chGenre == 't'){
						vt1.add(cl.chList[i].getChTitle());
						lchannels.setListData(vt1);
					}
					break;
				}
			}
	  	}
		//price
		if(radHD.isSelected()){
			price = lblHD.getText();
		}
		if(radStream.isSelected()){
			price = lblStream.getText();
		}
		
		//subscribe
		if(e.getSource() == subsrcibe){
			totalPrice += Double.valueOf(price.substring(1));
			result = chTitle + " - " + price;
			if(vt2.contains(result)){
				JOptionPane.showMessageDialog(this, 
						"This Channel is Already selected for that Format - Please select Another", 
						"Not Allowed", 
						JOptionPane.ERROR_MESSAGE);
			}
			else{
				vt2.add(result);
				lselections.setListData(vt2);
				total.setText("Total: $" + String.valueOf(totalPrice));
			}
		}
		
		//Actions on selected channels
		if(e.getSource() == clr){
			if(idx == -1){
				JOptionPane.showMessageDialog(this, 
						"Please select channel from 'Your Selections' to remove", 
						"Not Allowed", 
						JOptionPane.ERROR_MESSAGE);
			}
			else{
				double reducePrice;
				String selectedItem;
				selectedItem = String.valueOf(lselections.getSelectedValue());
				reducePrice = Double.valueOf(selectedItem.substring(selectedItem.lastIndexOf("$") + 1));
				total.setText("Total: $" + String.valueOf(totalPrice -= reducePrice));
				vt2.remove(lselections.getSelectedIndex());
				lselections.setListData(vt2);
			}
		}
		
		if(e.getSource() == clrAll){
			JOptionPane.showConfirmDialog(this, 
					"WARNING", 
					"Are You SURE ?", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.WARNING_MESSAGE);
			if(opt == JOptionPane.YES_OPTION){
				vt2.clear();
				lselections.setListData(vt2);
				totalPrice = 0;
				total.setText("Total: ");
			}
		}
		
		if(e.getSource() == submit){
			if(idx == -1 && card.getPassword().length > 0){
				JOptionPane.showMessageDialog(this, 
						"No Channel selected. Please setect a Channel", 
						"Not Allowed", 
						JOptionPane.ERROR_MESSAGE);
			}
			else{
				JOptionPane.showConfirmDialog(this, "Are You SURE","WARNING",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
				if(card.getPassword().length == 0 && opt == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(this, 
							"Please Enter a VALID Credit Card", 
							"Not Allowed", 
							JOptionPane.ERROR_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(this, 
							"Total $" + " has been charged to your credit card, " +
							"Thank you", 
							"Confirmation", 
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		//pwd options
		if(e.getSource() == enter){
			String correct = "mskyyrn";//This is the password
			if(Arrays.equals(correct.toCharArray(), pwd.getPassword())){
				//clear
				c.setSelectedIndex(0);
				lblHD.setText("");
				lblStream.setText("");
				vt2.clear();
				password = "";
				pwd.setText("");
				
				//display UpdateFram
				UpdateFrame jf = new UpdateFrame();
				jf.add(jf.p);
				jf.setVisible(true);
			}
			else{
				JOptionPane.showMessageDialog(this, 
						"WRONG Password, please re-enter", 
						"Not Allowed", 
						JOptionPane.ERROR_MESSAGE);
				password = "";
				pwd.setText("");
			}
		}
		
		if(e.getSource() == reset){
			password = "";
			pwd.setText("");
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
	    chTitle = String.valueOf(lchannels.getSelectedValue());
	    
	    ChannelList cl = new ChannelList();
	    cl.createList();
	    
		for(int i =0; i < cl.chList.length; i++){
			if(cl.chList[i].getChTitle() == chTitle){
				priceHD = "$" + String.valueOf(cl.chList[i].getChBroadcastPrice());
				lblHD.setText(priceHD);
				priceStream = "$" + String.valueOf(cl.chList[i].getChStreamPrice());
				lblStream.setText(priceStream);
				Logo = getImage(getCodeBase(),cl.chList[i].getChLogo());
				chLogo = new ImageIcon(Logo);
				lblLogo.setIcon(chLogo);
			}
		}
	}
}
