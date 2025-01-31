package cswBITWISE;

public class epsilon {
    static void diff_epsilen(float a, float b){
        float epsilen = 0.1f;
        if (Math.abs(a-b)<epsilen){
            System.out.println("Difference is less than epsilon");
        }
        else
            System.out.println("Difference is not less than epsilon");
    }

    public static void main(String[] args) {

    }
}
