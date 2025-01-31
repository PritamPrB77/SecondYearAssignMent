package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorQueue {

    static  class Student implements Comparable<Student>{
        String Name;
        int RollNo;
        public Student(String  Name,int RollNo){
            this.Name=Name;
            this.RollNo=RollNo;
        }
       @Override
        public int compareTo(Student s1) {
            //return  this.RollNo-s1.RollNo;
           //How we Sort Based on Name
           return  this.Name.compareTo(s1.Name);
        }
    }
    public static void main(String[] args) {
    //PriorQueue s1=new PriorQueue(); --->Learn This What Is PriorityQueue
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//it reverse the pq
            Scanner sc=new Scanner(System.in);
        System.out.println("enter to add in Pq:-");
//        for (int i = 0; i <5 ; i++) {
//            pq.add(sc.nextInt());
//        }
        pq.add(56);pq.add(6);

        while (!pq.isEmpty()){//pq.size>0
            System.out.println(pq.peek()+" "+pq.size());
            pq.remove();
        }
        System.out.println("--------------------------------------");
       PriorityQueue<Student> pq1=new PriorityQueue<>();
        System.out.println(pq1);
     pq1.add(new Student("Pritam",01));
        pq1.add(new Student("DeeptiSmita",100));
        pq1.add(new Student("Aeysha",90));
        pq1.add(new Student("KrushnaPriya",45));
        while (!pq1.isEmpty()){//pq.size>0
            System.out.println(pq1.peek().Name+" "+pq1.peek().RollNo +" "+pq1.size());
            pq1.remove();
        }



    }
}
