class SongTester{

  public static void main (String[] things);
  {  
  
  Song song=new Song("Sami Sami",06.24,REMIX_SONG,"Atif Aslam","Hindi","sameer");
  
  song.about();
  
  System.out.println();
  
  song.updateName();
  song.updateLength();
  song.updateSongType();
  song.updatesinger();
  song.updateLang();
  song.updateWriter();
  
  
  System.out.println();
  
  song.updateName("Kabhi Kabhi");
  song.updateLength(07.23);
  song.updateType(SongType.SILENT);
  song.updateSinger("Lata Mangeshkar");
  song.updateLang("Marathi");
  song.updateWriter("Shravan");
   
  System.out.println();
  }
  
  
}

   
  
  
  
  
  
  
  