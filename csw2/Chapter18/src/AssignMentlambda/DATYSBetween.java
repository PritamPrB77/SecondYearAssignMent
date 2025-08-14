package AssignMentlambda;


	import java.time.LocalDate;
	import java.time.temporal.ChronoUnit;
		//AssignMent Ques-10
	public class DATYSBetween {

		public static void main(String[] args) {
		
			//scanner class two accept the start date
			LocalDate start =LocalDate.parse("1990-05-15");
	      
			LocalDate end=LocalDate.parse("2025-05-02");
	     //calculate days between two dates   
	  
			Long days = ChronoUnit.DAYS.between(start,end);
			
		  
		 System.out.println("number of days:"+days);
		}

	}


