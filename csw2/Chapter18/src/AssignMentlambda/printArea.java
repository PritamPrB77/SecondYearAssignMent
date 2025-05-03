package AssignMentlambda;

interface  Shape{
	double area();
	default void PrintArea() {
		System.out.println(" Area is"+area());
	}
	
}

public class printArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Shape circle=()-> {return Math.PI*3*3;};
            Shape square=()-> {return 3*3;};
            Shape rect=()-> {return 3*3;};
            circle.PrintArea();
            square.PrintArea();
            rect.PrintArea();
	}

}
