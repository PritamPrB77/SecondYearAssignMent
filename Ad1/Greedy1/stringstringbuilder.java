package Greedy1;

public class stringstringbuilder{


    static  String reverse(String s){
        String ans="";

        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }

        return ans+" ";
    }
    public static void main(String[] args) {
//        String s1 = "hello";
//        System.out.println("hello");
//        Scanner sc=new Scanner(System.in);
////        System.out.println("ntr ur nm");
//        String s2=sc.next();
////        System.out.println(s2);
//        System.out.println("ntr ur nm");
//        String s3=sc.nextLine();
////        System.out.println(s3);
//        String s3=new String("hellolll");
//        String s4="hello";
//        System.out.println(s3.equals(s4));
        //System.out.println(s3.replace('p','v'));
       // System.out.println(s3.charAt(90));
        //System.out.println(s3.substring(1,4));

        //int a='a';
//        int ch=(int) 'a';
//        char ch1= (char)97;
//        System.out.println(ch1);
//        String s1="a";
//        String s22="A";
//        System.out.println(s1.compareTo(s22));
//        StringBuilder s1=new StringBuilder("hEkLllo");
//        System.out.println((int)'Z');
//        System.out.println(s1.length());
//        //System.out.println(s1.reverse());
//        System.out.println(s1.append('r'));

        //convert capital to small and small to capital
//        String s1="helloAA";
//          String ans="";
//        for(int i=0;i<s1.length();i++){
//            int ascii=(int)s1.charAt(i);
//            if(ascii>=97 &&ascii<=122 ){
//                ascii-=32;
//                char ch=(char) ascii;
//               // s1.setCharAt(i,ch);
//                //System.out.println(ch);
//                //System.out.println(s1.substring(0,i)+ch);
//                //System.out.println(s1.substring(i+1));
//              //ans= s1.substring(0,i)+ch+s1.substring(i+1,s1.length());
//               ans+=ch;
//            }
//            else if(ascii>=65&&ascii<=90){
//                ascii+=32;
//                char ch=(char) ascii;
//                //s1.setCharAt(i,ch);
//                ans+=ch;
//            }
//        }
//        System.out.println(s1);
//        System.out.println(ans);
//
        ///reverse each word means like this
        //let i=i am a boy
        //o/p should be i ma a yob its easy usimg string builder but in strung
//        String s1="i am a boy";
//        s1+=" ";
//        //its due to reverse the last word
//        String ans="";
//        String part="";
//        for(int i=0;i<s1.length();i++){
//
//            char ch=s1.charAt(i);
//            System.out.println(ch);
//            if (ch==' ') {
//                //we cant use "" there is dif meaning between "" and ''
//                String s2=reverse(part);
//                ans+=s2;
//                part="";
//
//            }
//            else{
//                part+=ch;
//            }
//        }
//        System.out.println(ans);


        //let try this->aaabbccd convert into a3b2c2d

        String str="aaabbccddd";
        char prev=str.charAt(0);
        System.out.println(str);
        char curr=' ';
        int count=1;
        String ans="";
        for(int i=1;i<str.length();i++){
            curr=str.charAt(i);
           // System.out.println(curr);
            if(prev==curr){
                count++;
            }
            else{
                ans+=prev;
                ans+=count;
                count=1;
                prev=str.charAt(i);
            }

        }
        //ans+=prev+count;
        //System.out.println(prev);
        ans+=prev;
        ans+=count;
        //System.out.println(count);
        System.out.println(ans);

    }
}
