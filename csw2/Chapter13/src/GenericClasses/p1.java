package GenericClasses;

public class p1<t> {
	t obj;
	public static<t> void printArray(t[]arr) {
		
		for(t elem:arr) {
			System.out.print(elem+" ");
			
		}
		
		System.out.println();
		
//	for(Integer i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
//	
//	System.out.println();
//	}
	// it also works in nOrmal arr  
		
		
		
		
	}
	public static void main(String [] args) {
		Integer [] Arr= {1,2,3,4,5};
		Double [] Arr1= {1.1,2.3,3.4,4.4,5.5};
		Character [] Arr2= {'h','a','c','k'};
		String Arr4[]= {"csw","ert"};
		
		
		//p1.<Character>printArray(Arr2);
		//printArray(Arr4);
		printArray(Arr);
		printArray(Arr1);
		printArray(Arr2);
		printArray(Arr4);
		
	}

}
