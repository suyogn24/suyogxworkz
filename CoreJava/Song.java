class Song{
	
	String name;
	double length;
    SongType type;
	String singerName;
	String lang;
	String writer;
		      
			  
	void about()
	{
      System.out.println(this.name);
	  System.out.println(this.length);
      System.out.println(this.type);
	  System.out.println(this.singerName);
      System.out.println(this.lang);
	  System.out.println(this.writer);
	}
	 
	void updateName()
	{
	  this.name="Sami Sami";
	}
	 
	void updateName(String name)
	{
      this.name=name;
	}
		
	void updateLength()
	{
      this.length=6.24;
	}

    void updateLength(double length)
	{
      this.length=length;
	}
	  
	void updateType()
	{
      this.type=SongType.REMIX_SONG;
	}
	
	void updatetype(SongType type);
	{
		this.type=type;
	}
	  
	void updateSinger()
	{
        this.singerName="Atif Aslam";
	}
	
	void updateSinger(String singerName)
	{
		this.singerName=singerName;
	}
	
	void updateLang()
	{
		this.lang="Hindi";
	}
	
	void updateLang(String lang)	
	{
		this.lang=lang;
	}
	
	void updateWriter()
	{
		this.writer="Sameer";
	}
	
	void updatewriter(String writer)
	{
		this.writer=writer;
	}
	
	
	void update(String name,double length,SongType type,String singerName,String lang,String writer)
	{
		this.name=name;
		this.length=length;
		this.type=type;
		this.singerName=singerName;
		this.lang=lang;
		this.writer=writer;
	}
	
	
}

	

	
	
	
	
	
	
	
	
	