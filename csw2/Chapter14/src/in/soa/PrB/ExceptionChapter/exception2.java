package in.soa.PrB.ExceptionChapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str="10/03/2025";
	String str2="2025/03/10";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			Date date= sdf.parse(str2);
			System.out.println("Parsed Date    "+date);
		}
		catch(ParseException obj) {
			System.out.println("Exception Caught");
		}
		finally{
			System.out.println("Run");
		}

	}

}
