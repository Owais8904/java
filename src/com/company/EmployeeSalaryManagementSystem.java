package com.company;

public class EmployeeSalaryManagementSystem {
    public static void main(String[] args) {
        int salary[]={25000,30000,12000,80000,3000};
        for(int element:salary){
            System.out.println(element);
        }
        int max=salary[0];
        for(int ele:salary){
            if(max<ele){
                max=ele;
            }
        }
        System.out.println("Highest salary: "+max);

        int low=salary[0];
        for(int ele:salary){
            if(low>ele){
                low=ele;

            }
        }
        System.out.println("Lower salary: "+low);

        int sum=0;
        int avg=0;
        for(int ele:salary){
            sum+=ele;
        }
        avg=sum/ salary.length;
        System.out.println("AVERAGE SALARY IS: "+avg);

        int earncount=0;
        for(int ele:salary){
            if(ele>30000){
                earncount++;
            }
        }
        System.out.println("employees earning above 30000  "+earncount);

        int key=12000;
        Boolean found=false;

        for(int ele:salary){
            if(ele==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("salary xists");
        }
        else{
            System.out.println("not exists");
        }


    }
}
