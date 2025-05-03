package week8day3;

import java.io.File;

public class GitIntoFile {

	public static void main(String[]args) {
		
	     File f=new File("E:\\Sem2csw\\Chapter17\\src\\week8day3\\demo.txt");
	     if(f.exists()) {
//	    	  get file name
	    	 System.out.println(f.getName());
//	    	 full path from the root directory
	    	 System.out.println(f.getAbsolutePath());
//	    	 
//	    	 f.setReadable(false);// it depends on os
//	    	 f.setWritable(true);
//	    	 f.setWritable(false);// by default true but if we false the comment out it saves ot that wrote cant be possible
//	    	  to write we have to set True and the if we comment we can write here
// check weather readable or not
	    	 System.out.println(f.canRead());
//check weather writable or not
	    	System.out.println(f.canWrite());
//	    	length of file in in bytes and return zero for empty file
	    	System.out.println(f.length());
	    
	     }
	     else {
	    	 System.out.println("file not exists");
	     }
	}
}
