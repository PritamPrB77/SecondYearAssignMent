package librarySystem;

public  abstract class LibraryResource {
	private String title;
	private String Author;
	LibraryResource(String title,String Author){
		this.Author=Author; this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	public abstract void  Displaydetails();
	public static void main(String args[]) {
		//LibraryResource s1=new LibraryResource ();
		
	}

}
