package cswBITWISE;

public class Multiply {
        public static int Add(int x,int y) {
            int cy=0;
            while(y!=0) {
                cy=x&y;
                x=x^y;
                y=cy<<1;
            }
            return x;
        }

        public static  int Multiply(int x, int y) {
            int sum = 0;
            while (x != 0) {
                if ((x & 1) != 0) {
                    sum = Add(sum, y);

                }
                x = x >> 1;
                y = y << 1;

            }
            return sum;
        }
            public static void main (String[]args){
                // TODO Auto-generated method stub
                System.out.println(Multiply(5, 9));

            }

//    public static  int Multiply(int x, int y) {
//        int sum=0;
//        while(x!=0) {
//            if((x&1)!=0){
//                sum= Add(sum,y);
//                x=x>>1;
//                y=y<<1;
//            }
//        }
//        return sum;
//
//    }

    }
