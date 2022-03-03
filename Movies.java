class StringAddAndDisplayMovie{

    String[] movieNames=new String[20];
	int tempValue=0;
	
    void addMoviesName(String StringAddAndDisplayMovie){
		
	System.out.println(" Movie Names "+ StringAddAndDisplayMovie);
	this.movieNames[tempValue]=StringAddAndDisplayMovie;
	tempValue = tempValue++;
	
	}
	
	void displayMoviesName()
	{
		System.out.println("Displaying Movie Names");
		
	for(int n=0;n<movieNames.length;n++)
		
		System.out.println(this.movie[n]);
		System.out.println(StringAddAndDisplayMovie);
		
	}
}
