package ASSIGNMENT_2_2;

 class Pair<k,v>{
	 k key;v value;
	 Pair( k key, v value){
		 this.key=key;this.value=value;
	 }
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	 
} 



public class driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pair<String, String> s[]=new Pair[3];
//		Pair<String, String> s2=new Pair<String,String>("s1012","xyz");
		
		//for(int i=0;i<s.length;i++) {
			s[0]=new Pair<String,String>("s101","xy");
			s[1]=new Pair<String,String>("s102","xyz");
			s[2]=new Pair<String,String>("s103","pqr");
			
			for(Pair<String,String> k:s ) {
				System.out.print(k);
			}
		
		
		

	}

}
