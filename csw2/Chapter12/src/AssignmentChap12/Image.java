package AssignmentChap12;

public class Image {

	 private int imageWidth; 
	    private int imageHeight; 
	    private String colorCode; 
	    public Image() { 
	        this.imageWidth = 0; 
	        this.imageHeight = 0; 
	        this.colorCode = "#000000"; 
	    } 
	    public Image(int imageWidth, int imageHeight, String colorCode) { 
	        this.imageWidth = imageWidth; 
	        this.imageHeight = imageHeight; 
	        this.colorCode = colorCode; 
	    } 
	    public int getImageWidth() { 
	        return imageWidth; 
	    } 
	    public int getImageHeight() { 
	        return imageHeight; 
	    } 
	    public String getColorCode() { 
	        return colorCode; 
	    } 
	    public void setImageWidth(int imageWidth) { 
	        this.imageWidth = imageWidth; 
	    } 
	    public void setImageHeight(int imageHeight) { 
	        this.imageHeight = imageHeight; 
	    } 
	    public void setColorCode(String colorCode) { 
	        this.colorCode = colorCode; 
	    } 
	    
	    @Override
	    public String toString() { 
	        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ",Color Code: " + colorCode + "]"; 
	    } 
	    public static void main(String[] args) { 
	        Image defaultImage = new Image(); 
	        System.out.println("Default Image Details: " + defaultImage.toString()); 
	        Image parameterizedImage = new Image(1920, 1080, "#FFFFFF"); 
	        System.out.println("Parameterized Image Details: " + 
	parameterizedImage.toString()); 
	        parameterizedImage.setImageWidth(1280); 
	        parameterizedImage.setImageHeight(720); 
	        parameterizedImage.setColorCode("#FF5733"); 
	        System.out.println("Updated Parameterized Image Details: " + 
	parameterizedImage.toString()); 
	    }

}
