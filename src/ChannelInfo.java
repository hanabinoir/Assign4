
/*
    e - entertainment
	 m - movie
    n - news
	 s - scifi
	 t - sport

*/
class ChannelInfo
{

  private String chTitle;
  private double chStreamPrice;
  private double chBroadcastPrice;
  private char chGenre;
  private String chLogo;
  
    

  ChannelInfo(String title, double chSPrice,double chBPrice,char type, String chPic)
  {
  
     chTitle = title;
	  chStreamPrice = chSPrice;
    chBroadcastPrice = chBPrice;
    chGenre = type;
    chLogo = chPic;  

  }

	public String getChTitle()
	{
		return chTitle;
	}

	public double getChStreamPrice()
	{
		return chStreamPrice;
	}

	public double getChBroadcastPrice()
	{
		return chBroadcastPrice;
	}

	public char getChGenre()
	{
		return chGenre;
	}

	public String getChLogo()
	{
		return chLogo;
	}
	
	public void setChStreamPrice(double a){
		chStreamPrice = a;
	}
	
	public void setChBroadcastPrice(double a){
		chBroadcastPrice = a;
	}
	
	public void setChGenre(char a){
		chGenre = a;
	}
	
	/*public void setEmpSal(double s)
	{
		empSal = s;
	}*/

      
}

///////////////////////////////

class ChannelList
{

  ChannelInfo[] chList;
  
  public void createList()
  {
  
      chList = new ChannelInfo[19];
      
		chList[0] = new ChannelInfo("BBC Canada",3.99, 5.99,'e',"bbccan.jpg");
		chList[1] = new ChannelInfo("Bloomberg TV",3.99, 5.99,'n',"bloom.jpg");
		chList[2] = new ChannelInfo("CNN",3.99, 5.99,'n',"cnn.jpg");
		chList[3] = new ChannelInfo("Disney XD",4.99, 7.99,'e',"dis.jpg");
      chList[4] = new ChannelInfo("Encore Avenue",4.99, 7.99,'m',"ea.jpg");
		chList[5] = new ChannelInfo("HBO Canada",4.99, 7.99,'e',"hbo.jpg");
      chList[6] = new ChannelInfo("MovieTime",4.99, 7.99,'m',"mt.jpg");
		chList[7] = new ChannelInfo("MSNBC",3.99, 6.99,'n',"msn.jpg");
		chList[8] = new ChannelInfo("Rewind",4.99, 7.99,'m',"rew.jpg");
		chList[9] = new ChannelInfo("Silver Screen Classics",4.99, 8.99,'m',"sil.jpg");
		chList[10] = new ChannelInfo("Space",4.99, 7.99,'s',"space.jpg");
		chList[11] = new ChannelInfo("Sportsnet World",4.99, 7.99,'t',"sw.jpg");
      chList[12] = new ChannelInfo("Super Channel",5.99, 11.99,'m',"sc.jpg");
		chList[13] = new ChannelInfo("SyFy",4.99, 7.99,'s',"syfy.jpg");
      chList[14] = new ChannelInfo("Teletoon",4.99, 7.99,'e',"tele.jpg");
      chList[15] = new ChannelInfo("The Golf Channel",4.99, 7.99,'t',"gc.jpg");
		chList[16] = new ChannelInfo("The Movie Network",5.99, 9.99,'m',"tmn.jpg");
      chList[17] = new ChannelInfo("The Sports Network",4.99, 7.99,'t',"tsn.jpg");
      chList[18] = new ChannelInfo("Turner Classic Movies",4.99, 8.99,'m',"tcm.jpg");
		
  
  }




} 