package studentDatabaseApplication;

import java.util.Scanner;

public class student {
    private String firstName;
    private String secondName;
    private int Year;
    private String studentID;
    private String courses=null;
    private int tuitionBalance=400;
    private static int costofCourse=600;
    private static int id=1000;



    public student (){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter First Name:");
        this.firstName=in.nextLine();

        System.out.println("Enter Second Name:");
        this.secondName=in.nextLine();
        System.out.println("Enter year");

        System.out.println("1.year1\n2.year2\n3.year3\n4.year4");
                this.Year=in.nextInt();

        System.out.println(firstName+" "+secondName+" "+Year);


    }

//generate an ID
    public void ID(){
        //grade level+ID
        id++;
        this.studentID=Year+" "+id;
        System.out.println(studentID);
    }
    //enroll in courses
    public void enroll(){
        do {
            System.out.println("Enter course to enroll(Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q") ) {
                courses = courses + course;
                tuitionBalance = tuitionBalance + costofCourse;
            } else {
                break;
            }

        }
        while(1!=0);


        }
    //viewBalance
    public void viewBalance() {
        System.out.println("Your balance is " + tuitionBalance);
    }
        //pay tuition
        public void payTuition(){
            System.out.println("Enter payment");
            Scanner in=new Scanner(System.in);
            int payment= in.nextInt();
            tuitionBalance=tuitionBalance-payment;
            System.out.println("Thank you for your payment of "+ payment);
       viewBalance();
    }
    //show status
    public String toString(){
        return "Name:"+firstName+" "+secondName+" "+
                "courses enrolled: "+ courses+
                "View Balance: " + tuitionBalance;
    }
}
