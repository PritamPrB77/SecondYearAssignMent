package AssignmentChap12;

class  imageLibrary{
	private Image imges[];
	private int size;
	imageLibrary(int cap){  
		imges=new Image[cap];
		size=0;		
	}
	  public void insertImage(Image image) { 
	        if (size < imges.length) { 
	            imges[size++] = image; 
	        } else { 
 
	 
	            System.out.println("Image library is full."); 
	        } 
	    } 
	 
	  public Image searchImage(String colorCode) { 
	        for (int i = 0; i < size; i++) { 
	            if (imges[i].getColorCode().equals(colorCode)) { 
	                return imges[i]; 
	            } 
	        } 
	        return null; 
	    } 
	
	   public Image getImage(int index) { 
	        if (index >= 0 && index < size) { 
	            return imges[index]; 
	        } 
	        return null; 
	    } 
	   public void displayAllImages() { 
	        for (int i = 0; i < size; i++) { 
	            System.out.println(imges[i].toString()); 
	        } 
	    } 
}

public class ImageController {
	 public static void main(String[] args) { 
	        imageLibrary imageLibrary = new imageLibrary(10); 
	        Image image1 = new Image(1920, 1080, "#FFFFFF"); 
	        Image image2 = new Image(1280, 720, "#FF5733"); 
	        imageLibrary.insertImage(image1); 
	        imageLibrary.insertImage(image2); 
	        System.out.println("All Images:"); 
	        imageLibrary.displayAllImages(); 
	        String searchColorCode = "#FF5733"; 
	        Image searchedImage = imageLibrary.searchImage(searchColorCode); 
	        if (searchedImage != null) { 
	            System.out.println("Searched Image: " + searchedImage.toString()); 
	        } else { 
	            System.out.println("Image with color code " + searchColorCode + " not found."); 
	        } 
	        int index = 0; 
	        Image imageAtIndex = imageLibrary.getImage(index); 
	        if (imageAtIndex != null) { 
	            System.out.println("Image at Index " + index + ": " + 
	imageAtIndex.toString()); 
	        } else { 
	            System.out.println("No image at index " + index); 
	        } 
	    } 
}
