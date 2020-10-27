package studentdatabaseapplication;

import java.util.Scanner;

public class Student {
    //This is  by using encapsulation
    //Which is wrapping the data and acting on the data as a single unit.
    //More so keeping these variables private
    //Then providing public getters and setter methods to modify the data/ view variable values.
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    //static means the value or property is true for all objects
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("" +
                "1 - Freshman\n" +
                "2 - Sophomore\n" +
                "3 - Junior\n" +
                "4 - Senior\n" +
                "Enter student's grade level: ");
        this.gradeYear = in.nextInt();
        setStudentID();
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }
    //Generates the studentID and appends gradeyear with id number
    private void setStudentID() {
        id++;
        this.studentID =  gradeYear + "" + id;

    }

    //Enroll student into courses
    public void enroll(){
        //Loop, user hits 0 when done enrolling.
        do {
            System.out.print("Enter Course to enroll. (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                courses = "\n " + course + " " + courses;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{

                break;
            }
        } while(1 != 0);
       // System.out.print("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        System.out.print("How much would you like to pay: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

    //show status
    public String showInfo(){
        return "\nName: " + firstName+ " " + lastName +
                "\n" + "Grade Level: " + gradeYear +
                "\n" + "StudentID: " + studentID +
                "\n" + "Courses: " + courses +
                "\n" + "Tuition Balance: $" + tuitionBalance + "\n";
    }

}
