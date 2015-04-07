import javax.swing.*;// by default allows you to everything from .swing

import java.awt.*;
import java.text.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.*;//allows you to create a border inside a border
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.*;


public class ChannelSubcribe extends JApplet 
implements ItemListener, ActionListener, ListSelectionListener{
	JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p8a,p9,p9a,p9b,p9c,p9d,p9e,p9f,p9g;

	JComboBox c;
	JList lchannels,lselections;
	JScrollPane jp1,jp2;
	Vector vt1,vt2;
	String chTitle,priceHD,priceStream,price,result;
	Image Logo;
	ImageIcon chLogo;
	JRadioButton radHD,radStream;
	ButtonGroup radGrp;
	JLabel lblHD,lblStream,lblLogo;
	JButton subsrcibe,clr,clrAll,submit,f,g,h,i,j,k,l,m,n,o,enter,reset;
	JPasswordField jpwName;
	
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
	    lchannels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    jp1 = new JScrollPane(lchannels);

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
	    lselections.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jp2 = new JScrollPane(lselections);
		
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
	    JLabel jlbPassword = new JLabel("Enter Credit Card#: ");
		jpwName = new JPasswordField(15);

	    p8.setLayout(new GridLayout(5,1,10,10));
	    p8a.setLayout(new FlowLayout(FlowLayout.CENTER,10,1));
	   
	    p8.add(clr);
	    p8.add(clrAll);
	    p8.add(total);
	    p8a.add(jlbPassword);
	    p8a.add(jpwName);
	    p8.add(p8a);
	    p8.add(submit);
		
		
		//employee
    p9 = new JPanel();
    p9a = new JPanel();
    p9b = new JPanel();
    p9c = new JPanel();
    p9d = new JPanel();
    p9e = new JPanel();
    p9f = new JPanel();
    p9g = new JPanel();

   JLabel text = new JLabel("Use Keypad to enter password for settings");
    
    p9a.setLayout(new GridLayout(1,1,10,10));
    
   f = new JButton("f");
	g = new JButton("g");
	h = new JButton("h");
	i = new JButton("i");
	j = new JButton("j");
   k = new JButton("k");
	l = new JButton("l");
	m = new JButton("m");
	n = new JButton("n");
	o = new JButton("o");

	enter = new JButton("Enter");
	reset = new JButton("Reset");

    p9b.setLayout(new GridLayout(1,5,10,10));
    p9b.add(f);
    p9b.add(g);
    p9b.add(h);
    p9b.add(i);
    p9b.add(j);    
    p9c.setLayout(new GridLayout(1,5,10,10));
    p9c.add(k);
    p9c.add(l);
    p9c.add(m);
    p9c.add(n);
    p9c.add(o);
    
    p9d.setLayout(new GridLayout(2,5,1,3));
    p9d.add(p9b);
    p9d.add(p9c);

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
    p9.add(p9a);
    p9.add(p9d);
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
		ChannelList cl = new ChannelList();
	    cl.createList();
		
		if(e.getSource() instanceof JRadioButton){
			if(e.getSource() == radHD){
				price = priceHD;
			}
			else{
				price = priceStream;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String genre = (String)c.getSelectedItem();
		
		ChannelList cl = new ChannelList();
	    cl.createList();
	    
		switch(genre){
		case "Please Select Genre of Channel":
			vt1.clear();
			lchannels.setListData(vt1);
			break;
		case "All Genres":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				vt1.add(cl.chList[i].getChTitle());
				lchannels.setListData(vt1);
			}
			break;
		case "Entertainment":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				if(chGenre == 'e'){
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
				}
			}
			break;
		case "Movie":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				if(chGenre == 'm'){
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
				}
			}
			break;
		case "News/Business":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				if(chGenre == 'n'){
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
				}
			}
			break;
		case "Sci-Fi":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				if(chGenre == 's'){
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
				}
			}
			break;
		case "Sports":
			vt1.clear();
			for(int i =0; i < cl.chList.length; i++){
				char chGenre = cl.chList[i].getChGenre();
				if(chGenre == 't'){
					vt1.add(cl.chList[i].getChTitle());
					lchannels.setListData(vt1);
				}
			}
			break;
		}
		
		if(e.getSource() == subsrcibe){
			chTitle = String.valueOf(lchannels.getSelectedValue());
			result = chTitle + "-" + price;
			if(vt2.contains(result)){
				JOptionPane.showMessageDialog(this, 
						"This Channel is Already selected for that Format - Please select Another", 
						"Not Allowed", 
						JOptionPane.ERROR_MESSAGE);
			}
			else{
				vt2.add(result);
				lselections.setListData(vt2);
			}
		}
		
		if(e.getSource() == clr){
			vt2.remove(lselections.getSelectedIndex());
			lselections.setListData(vt2);
		}
		
		if(e.getSource() == clrAll){
			vt2.clear();
			lselections.setListData(vt2);
		}
		
		if(e.getSource() == submit){
			String pwd = new String(jpwName.getPassword());
			if(pwd == null){
				JOptionPane.showConfirmDialog(this, "Are You SURE","WARNING",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		ChannelList cl = new ChannelList();
	    cl.createList();
	    chTitle = String.valueOf(lchannels.getSelectedValue());
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
