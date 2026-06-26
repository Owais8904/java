package com.company;
class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void setId(int n) {
        this.id = n;
    }

    public int getId() {
        return id;
    }

    public void setname(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setage(int n) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }

    }

    public int getage(int n) {
        return age;
    }

    public void setmarks(int n) {
        if (marks >= 0 && marks <= 100) {
            this.marks = n;
        } else {
            System.out.println("INAVLID MARKS");
        }
    }

    public int getMarks(int n) {
        return marks;
    }

    public void printDetails() {
        System.out.println(" ID-" + id);
        System.out.println(" NAME-" + name);
        System.out.println(" AGE-" + age);
        System.out.println(" MARKS-" + marks);
    }

    public void isPass() {
        if (marks >= 35) {
            System.out.println(" RESULT:PASS");
        }
    }

    public void grade() {
        if (marks < 35) {
            System.out.println(" FAIL");
        } else if (marks >= 35 && marks <= 59) {
            System.out.println(" GRADE:D");
        } else if (marks > 60 && marks <= 74) {
            System.out.println(" GRADE:C");
        } else if (marks > 75 && marks <= 89) {
            System.out.println(" GRADE:D");
        } else if (marks > 90 && marks <= 100) {
            System.out.println("  GRADE:A");
        }
    }
}


    public class STUDENTMANAGEMENTSYSTEM{
        public static void main(String[] args) {
            Student std1 = new Student(101, "owais", 18, 98);
            Student std2 = new Student(102, "ali", 19, 77);
            Student std3 = new Student(103, "rohan", 17, 22);
            std1.printDetails();
            std1.isPass();
            std1.grade();
            System.out.println();

            std2.printDetails();
            std2.isPass();
            std2.grade();

            System.out.println();

            std3.printDetails();
            std3.isPass();
            std3.grade();


        }
    }

