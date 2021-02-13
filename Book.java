package libraryHw;

public class Book {
	 String title;
	  boolean borrowed = false;

	  
	  public Book(String bookTitle) {
	    this.title = bookTitle;
	  }
  
	  public void borrowed() {	   
	    this.borrowed = true;
	  }

	  
	  public void returned() {	    
	    this.borrowed = false;
	  }

	 
	  public boolean isBorrowed() {	    
	    return borrowed;
	  }

	  
	  public String getTitle() {
	    return title;
	  }
}
