package com.company;
class Person{
    String Name;
    int age;
     Person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
    void display(){
        System.out.println("NAME:"+Name);
        System.out.println("AGE: "+age);
    }
}
class Student01 extends Person{
    int rollNo;
     Student01(String Name,int age,int rollNo){
        super(Name,age);
        this.rollNo=rollNo;
    }
    @Override
    void display(){
        super.display();
        System.out.println("ROLL NO "+rollNo);


    }

}
class Result extends Student01{
    int marks1,marks2,marks3;
     Result(String Name,int age,int rollNo,int marks1,int marks2,int marks3){
         super(Name,age,rollNo);
         this.marks1 = marks1;
         this.marks2 = marks2;
         this.marks3 = marks3;

     }
    @Override
    void display(){
        super.display();
        System.out.println("Marks 1: "+marks1);
        System.out.println("Marks 2: "+marks2);
        System.out.println("Marks 3: "+marks3);
        int total=marks1+marks2+marks3;
        double average=total/3;
        System.out.println("TOTAL: "+total);
        System.out.println("AVERAGE: "+average);
        if(average<40){
            System.out.println("FAIL");
        }
        else if(average>41 && average<=59){
            System.out.println("GRADE C");

        }
        else if(average>60 && average<=79){
            System.out.println("GRADE B");
        }
        else if(average>80 && average<=100){
            System.out.println("GRADE A");
        }
        else{
            System.out.println("INVALID AVERAGE");
        }
    }
}

public class inheritance_SRMS {
    public static void main(String[] args) {
        Result r=new Result("OWAIS",18,35,99,85,92);
        r.display();

    }
}
