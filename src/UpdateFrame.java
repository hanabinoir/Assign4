import javax.swing.*;// by default allows you to everything from .swing
//import javax.swing.event.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.*;//allows you to create a border inside a border
import java.util.*;


public class UpdateFrame extends JFrame implements ItemListener, ActionListener
{
      JPanel p,p1,p1a,p1b,p1c,p1d,p2,p3,p4;
      JComboBox c;
      JLabel jlab;
      JTextField txtHD,txtStream;
   	JRadioButton entertainment,movie,news,sci,sports;
   	ButtonGroup radGrp;
      JButton update;
   	JList channelL;
	   JScrollPane jp; 
	   Vector vt;
	   JTextArea fullList;
	   String priceHD,priceStream,chTitle,chGenre;


      
      private JMenuBar jmb = new JMenuBar(); // create menu bar (just the empty bar only)
      private JMenu jmList = new JMenu("Channel List");
      private JMenuItem fullL = new JMenuItem("Full List");
      private JMenuItem clear = new JMenuItem("Clear");
  
      public UpdateFrame()
      {
         setTitle("Channel Update");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(1000,400);

      setJMenuBar(jmb);//Add menu bar to the frame
      jmList.setMnemonic('S');
      jmList.add(fullL);//insert sub options into menu list
      fullL.setMnemonic('F');
      fullL.addActionListener(this);
      jmList.add(clear);
      clear.setMnemonic('C');      
      clear.addActionListener(this);
      jmb.add(jmList);//insert menu list into menu bar         
      jlab = new JLabel();//label to display menu selection
      
  		p = new JPanel();
		p.setLayout(new GridLayout(2,2,10,10));
      //SUB MENU - used mennmonics wk 11-1
		fullL.addActionListener(this);
		clear.addActionListener(this);
		//channel list
		p1 = new JPanel();
		p1a = new JPanel();
		p1b = new JPanel();
		p1c = new JPanel();
		p1d = new JPanel();
      
		ChannelList cl = new ChannelList();
		cl.createList();
            
		 c = new JComboBox();
		 for(int i =0; i < cl.chList.length; i++){
			 c.addItem(cl.chList[i].getChTitle());
		 }
		 c.addActionListener(this);
		 p1a.add(c);	    
		 p1a.setLayout(new GridLayout(1,1,5,5));
		 p1a.setBorder(new TitledBorder("Channel"));
       
		 Font fontPrice = new Font("Helvetica",Font.ITALIC + Font.BOLD,22);
		 
		 txtHD = new JTextField();
		 txtHD.setBackground(Color.cyan);
		 txtHD.setOpaque(true);
		 txtHD.setEditable(true);
		 txtHD.setBorder(null);
		 txtHD.setFont(fontPrice);
		 p1b.add(txtHD);
       	 p1b.setLayout(new GridLayout(1,1,5,5));
		 p1b.setBorder(new TitledBorder("Broadcast HD"));
		 p1b.setBackground(Color.cyan);
       
   	 
		 txtStream = new JTextField();
		 txtStream.setBackground(Color.yellow);
		 txtStream.setOpaque(true);  
		 txtStream.setEditable(true);
		 txtStream.setBorder(null);
		 txtStream.setFont(fontPrice);
		 p1c.add(txtStream);    
		 p1c.setLayout(new GridLayout(1,1,5,5));
		 p1c.setBorder(new TitledBorder("Internet Stream"));
		 p1c.setBackground(Color.yellow);       
       
      
       p1d.setLayout(new GridLayout(1,2,5,5));
       p1d.add(p1b);
       p1d.add(p1c);
       
       p1.setLayout(new GridLayout(2,1,5,5));
       p1.add(p1a);
       p1.add(p1d);
       
      //Genre current/change
		p2 = new JPanel();
      
		entertainment = new JRadioButton("Entertainment",true);
		entertainment.addActionListener(this);
		movie = new JRadioButton("Movie");
		movie.addActionListener(this);
		news = new JRadioButton("News/Business");
		news.addActionListener(this);
		sci = new JRadioButton("Sci-Fi");
		sci.addActionListener(this);
		sports = new JRadioButton("Sports");
		sports.addActionListener(this);
		
		radGrp = new ButtonGroup();
		radGrp.add(entertainment);
		radGrp.add(movie);
		radGrp.add(news);
		radGrp.add(sci);
		radGrp.add(sports);
      
      p2.add(entertainment);
      p2.add(movie);
      p2.add(news);
      p2.add(sci);
      p2.add(sports);      
      p2.setBorder(new TitledBorder("Genre Current/Change"));    
      p2.setLayout(new GridLayout(2,3,10,3));

      //Update button
		p3 = new JPanel();
		update = new JButton("Update Current");
		
		update.addActionListener(this);
		
		p3.add(update);
		p3.setLayout(new GridLayout(1,1,10,10));
      
     //Channel List
		p4 = new JPanel();/*
		vt = new Vector();
		channelL = new JList(vt);*/
		fullList = new JTextArea();
		jp = new JScrollPane(fullList);
		
 	   	Font fontList = new Font("Helvetica",Font.ITALIC + Font.BOLD,14);
 	    
	    fullList.setBackground(Color.orange);
	    fullList.setEditable(false);
	    fullList.setFont(new Font("Helvetica", Font.BOLD + Font.ITALIC, 14));
	    jp.setBorder(null);
	    
	    cl.createList();

	    p4.add(jp);
	    p4.setLayout(new GridLayout(1,1,10,10));
		p4.setBorder(new TitledBorder("Channel List"));
		p4.setBackground(Color.orange);
           
     
      //all panels
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
         
      }
            
      
      //to create File menu
      
   
	public void itemStateChanged(ItemEvent a) {


	}
	public void actionPerformed(ActionEvent ae) {
		chTitle = (String)c.getSelectedItem();
		ChannelList cl = new ChannelList();
		cl.createList();
		for(int i =0; i < cl.chList.length; i++){
			if(cl.chList[i].getChTitle() == chTitle){
				priceHD = String.valueOf(cl.chList[i].getChBroadcastPrice());
				txtHD.setText(priceHD);
				priceStream = String.valueOf(cl.chList[i].getChStreamPrice());
				txtStream.setText(priceStream);
				chGenre = String.valueOf(cl.chList[i].getChGenre());
			}
		}
		switch(chGenre){
		case "e":
			entertainment.isSelected();
			break;
		case "m":
			movie.isSelected();
			break;
		case "n":
			news.isSelected();
			break;
		case "s":
			sci.isSelected();
			break;
		case "t":
			sports.isSelected();
			break;
		}
		
		if(ae.getSource() == update){
			for(int i =0; i < cl.chList.length; i++){
				if(cl.chList[i].getChTitle() == chTitle){
					cl.chList[i].setChBroadcastPrice(Double.valueOf(txtHD.getText()));
					cl.chList[i].setChStreamPrice(Double.valueOf(txtStream.getText()));
					if(entertainment.isSelected())
						cl.chList[i].setChGenre('e');
					if(movie.isSelected())
						cl.chList[i].setChGenre('m');
					if(news.isSelected())
						cl.chList[i].setChGenre('n');
					if(sci.isSelected())
						cl.chList[i].setChGenre('s');
					if(sports.isSelected())
						cl.chList[i].setChGenre('t');
				}
			}
			
			JOptionPane.showMessageDialog(this, 
					"Update Complete", 
					"Confirmation", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(ae.getSource() == fullL){
			fullList.setText("");
			for(int i =0; i < cl.chList.length; i++){
				fullList.append(cl.chList[i].getChTitle() + " "
						+ String.valueOf(cl.chList[i].getChBroadcastPrice()) + " " + 
						String.valueOf(cl.chList[i].getChStreamPrice()) + " " + 
						cl.chList[i].getChGenre() + "\n");
			}
		}
		
		if(ae.getSource() == clear){
			fullList.setText("");
		}
	}

   public static void main(String args[])
   {
      UpdateFrame frame = new UpdateFrame();
		frame.add(frame.p);
      frame.setVisible(true);

}

}

