package Hash;

import java.util.LinkedList;

public class HashMapImplementation {
    static  class MYhashMap<k,v>{
        public static final  int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75F;
        private class node{
            k key;v value;
            node(k key,v value){
                this.key=key;
                this.value=value;

            }
        }
        private int n;

        private  LinkedList<node> buckets[];//-->Array Of Linkedlist
        //we need to rehash it  because we put small elemts so it acess it so ll will expands in every array of ll
        //capacity-->N;
        //lambda =0.75;
        //threshold value= lambda*capacity=4*0.75=3;
        //to reduce collision we  re hash it when we rehash it if  no of elements >threshold value
        //in this  case ts-->is 3 when 4th eelemnt enter then we re hash it double the value and create  an double size
        //of array  and put it in its hash function not originally copy but conly copy the value of it

        private void initBuckets(int N){
            //N->capacity/size of bucket Array
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                //we initialize empty linkedlist in every bucket
                buckets[i]=new LinkedList<>();
            }

        }
        public MYhashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        private  void reHASH(){
            LinkedList<node>[] oldBuckets=buckets;
            initBuckets(oldBuckets.length*2);
            n=0;
            for (var bucket:oldBuckets){
                for(var node:bucket){
                    put(node.key,node.value);
                    //we copy the values for prev to new;
                }
            }

        }
        private  int Hashfunction(k key){
            int hc=key.hashCode();
            ///key.hashcode()-->is an inubuilt method in java to generate hashcode but
            //in our hash table bucket length is defined so we need to mod it with bucket length and
            //math.abs is due to hashcode can generate  -ve value also
            return (Math.abs(hc))%buckets.length;//-->return bucket index;
        }
        private int SearchInBuckeet( LinkedList<node >ll,k key){
            //traverse the ll ans looks for node with key ,if found it returns it's
            // index otherwise it return null value

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;

        }
        public  int size(){
            //return the number of entries in map
            return n;
        }
        public  void put(k key,v value){

            int bi=Hashfunction(key);
            LinkedList<node> currBUCKET=buckets[bi];
           int e1= SearchInBuckeet(currBUCKET,key);
           if(e1==-1){//key doesnt exit then we have enter a new value
               node node=new node(key ,value);
               currBUCKET.add(node);
               n++;
               //if not exit we create an new node
           }else{
              //update case
              node currnode=currBUCKET.get(e1);
              currnode.value=value;
               System.out.println("<----------------------UODATING VALUE---------------> "+currnode.value);
           }
           ///-----------------re ->HASHING
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){
             reHASH();
            }

        }
        public int capacity(){
            return buckets.length;
        }
        public double load(){
            return  ((n*1.0)/buckets.length);
        }
        public  v get ( k key){
            int bi=Hashfunction(key);
            LinkedList<node> currBUCKET=buckets[bi];
            int e1= SearchInBuckeet(currBUCKET,key);
            if(e1!=-1){//key exit
              node currnode=currBUCKET.get(e1);

              return currnode.value;
            }else{//key doesnt exit
               return null;

            }

        }
        public  v remove(k key){
            int bi=Hashfunction(key);
            LinkedList<node> currBUCKET=buckets[bi];
            int e1= SearchInBuckeet(currBUCKET,key);
            if(e1!=-1){//key exit

                node currnode=currBUCKET.get(e1);
                v val=currnode.value;
                currBUCKET.remove(e1);
                n--;
                return  val;

            }
           return null;
        }
    }

    public static void main(String[] args) {
        MYhashMap<String ,Integer> mp=new MYhashMap<>();
        System.out.println("testing put");
        mp.put("a",2);//1
        System.out.println("capacity-->"+mp.capacity());
        System.out.println("load factor--->"+mp.load());
        mp.put("b",23);//2
        mp.put("c",24);//3
        System.out.println("capacity-->"+mp.capacity());
        System.out.println("load factor--->"+mp.load());
        mp.put("d",1);//4
        mp.put("d",1);//dupelicat
        mp.put("d",13);//duplicate
        System.out.println("capacity-->"+mp.capacity());
        System.out.println("load factor--->"+mp.load());
        System.out.println("size is "+" "+mp.size());
        mp.put("e",131);
        mp.put("f",134);
        mp.put("g",132);
        System.out.println("size is "+" "+mp.size());
//        for(int i=0;i<mp.size();i++){
//            System.out.println(mp.get("a"));
//        }
        System.out.println("capacity-->"+mp.capacity());
        System.out.println("load factor--->"+mp.load());
        System.out.println("-------------------------------------");
        System.out.println("o/p"+"--->"+" "+mp.get("a"));
        System.out.println("o/p"+"--->"+" "+mp.get("b"));
        System.out.println("o/p"+"--->"+" "+mp.get("c"));
        System.out.println("o/p"+"--->"+" "+mp.get("d"));
        System.out.println("o/p"+"--->"+" "+mp.get("d3343"));
        System.out.println("o/p"+"--->"+" "+mp.get("f"));
        System.out.println("o/p"+"--->"+" "+mp.get("g"));
        System.out.println("o/p"+"--->"+" "+mp.get("e"));
        System.out.println("---------------------------------------");
        System.out.println("o/p"+"--->"+" "+mp.remove("c"));
        System.out.println("size is "+" "+mp.size());
        System.out.println("o/p"+"--->"+" "+mp.remove("d"));
        System.out.println("size is "+" "+mp.size());


    }


}
