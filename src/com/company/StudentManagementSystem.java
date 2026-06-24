package com.company;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Student management System using arrays

        int marks[]={45,50,78,80,99,20};
        for(int ele:marks){
            System.out.println(ele);
        }
        int max=0;
        for(int ele:marks){
            if(max<ele){
                max=ele;
            }
        }
        System.out.println("Highest marks "+max);
        int small=marks[0];
        for(int ele:marks){
            if(small>ele){
                small=ele;
            }
        }
        System.out.println("Smallest marks "+small);
        int sum=0;
        int avg=0;
        for(int ele:marks){
            sum +=ele;
            avg=sum/ marks.length;

        }
        System.out.println("Average is :"+avg);

        int key=99;
        boolean found=false;
        for(int ele:marks){
            if(ele==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Marks is present ");
        }
        else{
            System.out.println("absent");
        }

        int count=0;
        for(int ele:marks) {
            if (ele >= 35) {
                count++;
            }
        }
        System.out.println("passed students--> "+count);



    }
}
