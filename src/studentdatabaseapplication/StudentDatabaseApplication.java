package studentdatabaseapplication;

import java.util.Scanner;

public class StudentDatabaseApplication {

    public static void main(String[] args) {
        // # of students needed to add to database
        System.out.print("How many students do you wish to enroll? #:");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        //Convert this into an Arraylist if number is not a fixed amount of students and you want to add more.
        Student[] students = new Student[numberOfStudents];

        //Create n number of students.
        for(int i = 0; i < numberOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        //To show all data at once.
        for(int j = 0; j < numberOfStudents;j++){
            System.out.print(students[j].showInfo());
        }
    }
}
