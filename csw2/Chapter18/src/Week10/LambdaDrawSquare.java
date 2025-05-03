package Week10;



interface drawSquare{
	void drawIt(int a);
}

public class LambdaDrawSquare {

	public static void main(String[] args) {

		drawSquare ds=(a) -> System.out.println("The side of square:"+a);
        ds.drawIt(5);
        drawSquare ds2=(a) -> {
        	int area=a*a;
        	System.out.println("Area:"+area);
        };
        ds2.drawIt(5);
	}

}
