package week6day1;

public class exception1 {


			public static void main(String[] args) {
				try {
					String s ="SOA UNIVERSITY";
					int ch = s.charAt(s.length()-1);
					System.out.println("Character:"+ch);
					
				}
				catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException  obj) {
					// it tooks Same standard classes not took parent, child relationship class
					//it took either parent classes or child classes else it throws error and to resolve it you can use
					//alternate mathods like  catch  method then catch method 
		            
					System.out.println("Exception caught");
					System.out.println(obj.getMessage());
				}
				//1st add the derive class exvceptions then pention the parent class exceptios
				catch( IndexOutOfBoundsException e) {
					
				}
				
				finally {
					System.out.println("Rest portion of code...");
				}
			

		}

		      
		
		
	}
