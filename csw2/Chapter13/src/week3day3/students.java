package week3day3;

public class students {
	  private String name;
	   private int age,mark;
	   
	   students(String name,int age,int mark){
		   this.mark=mark; this.name=name; this.age=age;
		   
	   }

	@Override
	public String toString() {
		return "students [name=" + name + ", age=" + age + ", mark=" + mark + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	   
  public boolean equals(Object obj) {
	  students that=(students)obj;
	  if((this.name==that.name)&&(this.age==that.age)) {
		  return true;
	  }
	return false;
	  
  }
	
	
}
