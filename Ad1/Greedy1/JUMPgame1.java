package Greedy1;
public class JUMPgame1 {

    public static boolean Jump(int arr[]){
//if 0 is available we cant run further  so 0 is terminate point and we need ro run at the last
        int max_IdxJumP=0;
        for(int i=0;i<arr.length;i++){
            if(i>max_IdxJumP) return false;
            max_IdxJumP=Math.max(max_IdxJumP,i+arr[i]);
        }

        return true;
    }
    public static  int Minjump2(int arr[]){
        int jump=0,l=0,r=0,mAx_juMP_Posble=0;
        while(r<arr.length){
            for(int i=l;i<=r;i++){
                mAx_juMP_Posble=Math.max(mAx_juMP_Posble,i+arr[i]);
            }
            l=r+1;r=mAx_juMP_Posble;jump+=1;
        }
        return jump;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,1,1,0,2,0};
        int brr[]={1,2,3,1,1,0,2,5};

        System.out.println(" is jump is possible: "+ Jump(arr));
        if(Jump(arr)) {
            System.out.println(" what is the minimum jump:" + Minjump2(arr));
        }
        else System.out.println("error in jumping , 0 is there");

    }
}
