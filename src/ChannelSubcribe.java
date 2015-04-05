import javax.swing.*;// by default allows you to everything from .swing
import java.awt.*;
import java.text.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.*;//allows you to create a border inside a border
import java.util.*;

public class ChannelSubcribe extends JApplet implements ActionListener, ItemListener
{

  JButton subscribe, clear,clearall, submit;
  
  JComboBox c;
  
  JList lchannels;
  String colourNames[] = {"Blue","Green","Red","Orange", "Pink"};
  JScrollPane jp;
  Vector vt;

  JRadioButton Broadcast,InternetS;
  ButtonGroup rGroup;

  JTextField total;
  
	/*ImageIcon image1, image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12
            ,image13,image14,image15,image16,image17,image18,image19,image20,image21,image22,image23,image24;

	Image bbc, bloom, cnn, disney,discouvery,dj,ea,gc,hbo,metv,msn,mt,nationalgeo,rewind,sc,sil,space
         ,sw,syfy,tcm,tele,tmn,tsn; */
	
	JLabel lblImg,lblHD,lblStream;
  
  

  //CREATE PANELS, declare only
  JPanel p1,p2,p3,p4,p5,p6,p7,p8,p8a,p9,p10;	// declare the JPanels
  
  //declare border
  //TitledBorder tb = new TitledBorder ("Video");
  
  //create textfield
   Container con;
  
  public void init()
  {
 ///////// create the components required for this demo ////   

   ChannelList list = new ChannelList();
	/*bPlay = new JButton("Play");
	bFForward = new JButton("Fast Forward");
	bSlow = new JButton("Slow");
	bStop = new JButton("Stop");
	  
	bNorth = new JButton("North");
	bSouth = new JButton("South");
	bEast = new JButton("East");
	bWest = new JButton("West");
	bCenter = new JButton("Center");*/
///////////////////////////////////////////////
	
////// Construct 1st JPanel
    	p1 = new JPanel();
      							  // set the layout for this panel
    c = new JComboBox(); 
    c.addItem("Please Select Genre of Channel");
    c.addItem("All Genres");
    c.addItem("Entertainment");
    c.addItem("Movie");
    c.addItem("News/Business");
    c.addItem("Sci-Fi");
    c.addItem("Sports");

    c.addItemListener(this);    

    p1.setBorder(new TitledBorder("Channel Genre"));
    p1.setLayout(new FlowLayout());
      p1.add(c);
      
/////// Construct 2nd JPanel 

    p2 = new JPanel();
    vt = new Vector();
    ChannelList cl = new ChannelList();
    
    lchannels = new JList(vt);
  //  lchannels.setFixedCellHeight(12);//pixels									 //sets the height of each item, in pixel length

	//lchannels.setFixedCellWidth(200);//pixels									  //sets the width of each item, in pixel length
	//lchannels.setVisibleRowCount(10);								   // No. of rows visible
   // For single item selection, use SINGLE_SELECTION,    
   lchannels.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   //attaching scroll bar into lcolour
   jp = new JScrollPane(lchannels);

//   con.add(jp);
   cl.createList();
   String genre = c.getSelectedItem().toString();
   
   for(int i =0; i < cl.chList.length; i++)
   {
	   char chGenre = cl.chList[i].getChGenre();
	   
	   if(chGenre == 'e')
		   vt.add(cl.chList[i].getChTitle());
   }
  
   p2.setBorder(new TitledBorder("Channel Titles Available"));  
   p2.add(jp); 
   p2.setLayout(new GridLayout(1,1));
/////// Construct 3nd JPanel 
    p3 = new JPanel();
    										  // set to Borderlayout
	 Broadcast = new JRadioButton("Broadcast HD",true);
    Broadcast.addItemListener(this);
    
	 InternetS = new JRadioButton("Internet Streaming",false);
    InternetS.addItemListener(this);

	 rGroup = new ButtonGroup(); 
	 rGroup.add(Broadcast);
    rGroup.add(InternetS);
    
    lblHD = new JLabel("HD Price");
    lblHD.setBackground(Color.cyan);
    lblHD.setOpaque(true);
    
    lblStream = new JLabel("Stream Price");
    lblStream.setBackground(Color.yellow);
	lblStream.setOpaque(true);
	
    p3.add(Broadcast);
    p3.add(lblHD);
    p3.add(InternetS);
   p3.add(lblStream);
   
   p3.setLayout(new GridLayout(2,2));
   p3.setBorder(new TitledBorder("Format/Prices"));
   
 	 
/////// Construct 4nd JPanel
    p4 = new JPanel();
   /* 
	 bbc = getImage(getCodeBase(), "bbccan.jpg");
	 bloom = getImage(getCodeBase(), "bloom.jpg");
	 cnn = getImage(getCodeBase(), "cnn.jpg");
	 disney = getImage(getCodeBase(), "dis.jpg");
	 discouvery = getImage(getCodeBase(), "disc.jpg");
	 dj = getImage(getCodeBase(), "dj.jpg");
	 ea = getImage(getCodeBase(), "ea.jpg");
	 gc = getImage(getCodeBase(), "gc.jpg");	 
    hbo = getImage(getCodeBase(), "hbo.jpg");
	 metv = getImage(getCodeBase(), "meTV.jpg");
	 msn = getImage(getCodeBase(), "msn.jpg");
	 mt = getImage(getCodeBase(), "mt.jpg");
	 nationalgeo = getImage(getCodeBase(), "ng.jpg");
	 rewind = getImage(getCodeBase(), "rew.jpg");
	 sc = getImage(getCodeBase(), "sc.jpg");
	 sil = getImage(getCodeBase(), "sil.jpg");
	 space = getImage(getCodeBase(), "space.jpg");
	 sw = getImage(getCodeBase(), "sw.jpg");
    syfy = getImage(getCodeBase(), "syfy.jpg");
	 tcm = getImage(getCodeBase(), "tcm.jpg");
	 tele = getImage(getCodeBase(), "tele.jpg");
	 tmn = getImage(getCodeBase(), "tmn.jpg");
	 tsn = getImage(getCodeBase(), "tsn.jpg");

		image1 = new ImageIcon(bbc);  
		image2 = new ImageIcon(bloom); 
		image3 = new ImageIcon(cnn);  
		image4 = new ImageIcon(disney); 
		image5 = new ImageIcon(discouvery);  
		image6 = new ImageIcon(dj); 
		image7 = new ImageIcon(ea);  
		image8 = new ImageIcon(gc); 
		image9 = new ImageIcon(hbo);  
		image10 = new ImageIcon(metv); 
		image11 = new ImageIcon(msn);  
		image12 = new ImageIcon(mt); 
		image13 = new ImageIcon(nationalgeo);  
		image14 = new ImageIcon(rewind); 
		image15 = new ImageIcon(sc);  
		image16 = new ImageIcon(sil); 
		image17 = new ImageIcon(space);  
		image18 = new ImageIcon(sw); 
		image19 = new ImageIcon(syfy);  
		image20 = new ImageIcon(tcm); 
		image21 = new ImageIcon(tele);  
		image22 = new ImageIcon(tmn); 
		image23 = new ImageIcon(tsn);  
   */
/* 		lblImg = new JLabel();

switch(vt.cl.getChTitle()){
   case "BBC Canada":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Bloomberg TV":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "CNN":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Disney XD":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Encore Avenue":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "HBO Canada":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "MovieTime":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "MSNBC":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Rewind":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Silver Screen Classics":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Space":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Sportsnet World":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Super Channel":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "SyFy":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Teletoon":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "The Golf Channel":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "The Movie Network":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "The Sports Network":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;

   case "Turner Classic Movies":
      lblImg.setIcon(vt.cl.getChLogo());      
      break;
   }
   
   
	p4.add(lblImg);
   */p4.setLayout(new GridLayout(1,1,10,10));
   p4.setBorder(new TitledBorder("Channel Logo"));
    
/////// Construct 5nd JPanel
    p5 = new JPanel();
   subscribe = new JButton("Subscribe");
   										  // set to GridLayout
   subscribe.addItemListener(this);    

   p5.setLayout(new GridLayout(1,1,10,10));
   
   p5.add(subscribe);
    
// add components to 2nd JPanel
    
	 
/////// Construct 6nd JPanel
    p6 = new JPanel();
    p6.setLayout(new GridLayout(1,1,10,10));

/////// Construct 7nd JPanel
    p7 = new JPanel();

    p7.setBackground(Color.white);
    p7.setBorder(new TitledBorder("Your Selections"));
    p7.setLayout(new GridLayout(1,1,10,10));
/////// Construct 8nd JPanel
    p8a = new JPanel();
    p8 = new JPanel();


   clear = new JButton("Clear");
   clear.addItemListener(this);    
   clearall = new JButton("Clear All");
   clearall.addItemListener(this);    
   submit = new JButton("Submit");
   submit.addItemListener(this); 
    total = new JTextField("Total: ",20); //"Total: " + your selection Jlist,20
    Color color = Color.CYAN;
    total.setBackground(color);
    total.addActionListener(this);
   JLabel jlbPassword = new JLabel("Enter Credit Card#: ");
	JPasswordField jpwName = new JPasswordField(15);

   p8.setLayout(new GridLayout(5,1,10,10));
   p8a.setLayout(new FlowLayout(FlowLayout.CENTER,10,1));
   
   p8.add(clear);
   p8.add(clearall);
   p8.add(total);
   p8a.add(jlbPassword);
   p8a.add(jpwName);
   p8.add(p8a);
   p8.add(submit);

	 
/////// Construct 9nd JPanel
    p9 = new JPanel();
    
    p9.setBackground(Color.red);
    p9.setBorder(new TitledBorder("For Employee use ONLY"));    
    p9.setLayout(new GridLayout(4,1,10,10));
   
	 
// Note, NOTHING has been added to JApplet yet, so nothing is shown

    // Construct overall JPanel
   	p10 = new JPanel();
      
      
      //(2 rows, 1 column)
      p10.setLayout( new GridLayout(3,3,10,10));							
      p10.add(p1);
      p10.add(p2);
      p10.add(p3);
      p10.add(p4);
      p10.add(p5);
      p10.add(p6);
      p10.add(p7);
      p10.add(p8);
      p10.add(p9);
      
									 // set layout to gridlayout, 2 rows, 1 col

    // Nest 1st and 2nd JPanel
    							// add JPanel p1 to p3
   							// add JPanel p2 to p3
// Note, NOTHING has been added to JApplet yet, so nothing is shown	   

// NOW, we need to add p3 to the JApplet surface 
   con = getContentPane();
	con.add(p10);
   
						  //add overall JPanel to pane
 }
 
   public void actionPerformed(ActionEvent e)
  {

  }
  
    public void itemStateChanged(ItemEvent e)
   {
    	String genre;
    	genre = c.getSelectedItem().toString();
    	System.out.print(genre);
   }
}
