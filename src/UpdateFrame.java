import javax.swing.*;// by default allows you to everything from .swing
//import javax.swing.event.*;
import java.awt.*;
import java.text.*;
import java.util.Vector;
import java.util.*;
import java.awt.event.*;
import javax.swing.border.*;//allows you to create a border inside a border
import java.util.*;


public class UpdateFrame extends JFrame implements ItemListener, ActionListener
{
      JPanel p,p1,p1a,p1b,p1c,p1d,p2,p3,p4;
      JComboBox c;
      JLabel lblHD,lblStream, jlab;
   	JRadioButton entertainment,movie,news,sci,sports;
   	ButtonGroup radGrp;
      JButton update;
   	JList channelL;
	   JScrollPane jp; 
	   Vector vt;        


      
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
		
		//channel list
		p1 = new JPanel();
		p1a = new JPanel();
		p1b = new JPanel();
		p1c = new JPanel();
		p1d = new JPanel();
      
            
		 c = new JComboBox();
		 c.addItem("BBC Canada");
	    c.addItem("Bloomberg TV");
	    c.addItem("CNN");
	    c.addItem("Disney XD");
	    c.addItem("Encore Avenue");
	    c.addItem("HBO Canada");
	    c.addItem("MovieTime");
	    c.addItem("MSNBC");
	    c.addItem("Rewind");
	    c.addItem("Silver Screen Classics");
	    c.addItem("Space");
	    c.addItem("Sportsnet World");
	    c.addItem("Super Channel");
	    c.addItem("SyFy");
	    c.addItem("Teletoon");
	    c.addItem("The Golf Channel");
	    c.addItem("The Movie Network");
	    c.addItem("The Sports Network");
	    c.addItem("Turner Classic Movies");

	    p1a.add(c);	    
	    p1a.setLayout(new GridLayout(1,1,5,5));
		 p1a.setBorder(new TitledBorder("Channel"));
       
		 lblHD = new JLabel();
		 lblHD.setBackground(Color.cyan);
		 lblHD.setOpaque(true);
       p1b.add(lblHD);
       p1b.setLayout(new GridLayout(1,1,5,5));
		 p1b.setBorder(new TitledBorder("Broadcast HD"));
		 p1b.setBackground(Color.cyan);
       
   	 
		 lblStream = new JLabel();
		 lblStream.setBackground(Color.yellow);
		 lblStream.setOpaque(true);  
       p1c.add(lblStream);    
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
      p4 = new JPanel();
 
 	    vt = new Vector();
	    ChannelList cl = new ChannelList();//from channelinfo.java
	    
	    channelL = new JList(vt);
       channelL.setBackground(Color.orange);   
	    jp = new JScrollPane(channelL);
	    cl.createList();

       p4.add(jp);
       jp.setFont(new Font("Helvetica", Font.BOLD + Font.ITALIC, 14));
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

}

   public static void main(String args[])
   {
      UpdateFrame frame = new UpdateFrame();
		frame.add(frame.p);
      frame.setVisible(true);

}

}

