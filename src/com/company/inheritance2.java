package com.company;
class person{
    String name;
    int age;
   public  void setDetails(String n,int a){
       this.name=n;
       this.age=a;
    }
    public void displayDetails(){
        System.out.println("Name- "+this.name);
        System.out.println("Age- "+this.age);
    }
}
class Student1 extends person {
    int marks;

    public void setMarks(int marks) {
        this.marks = marks;

    }

    public int getMarks() {
        return marks;
    }

}
public class inheritance2 {
    static void main(String[] args) {
        Student1 s=new Student1();
        s.setDetails("owais",20);
        s.displayDetails();
        s.setMarks(90);
        System.out.println("Marks- "+s.getMarks());

    }
}
