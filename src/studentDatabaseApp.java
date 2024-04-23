import studentDatabaseApplication.student;

import java.util.Scanner;

public class studentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students we want to add
        System.out.println("Enter number of students to enroll:");
        Scanner in =new Scanner(System.in);
        int numberofstudents=in.nextInt();
        student[] students =new student[numberofstudents];

        //create n number of students
        for (int n=0; n<numberofstudents; n++){
        students[n]=new student();
        students[n].ID();
        students[n].enroll();
        students[n].payTuition();
        System.out.println(students[n].toString());
    }
}
}
