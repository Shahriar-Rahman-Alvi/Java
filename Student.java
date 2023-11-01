import java.util.*;
import java.util.ArrayList;

class studentInfo{

    Scanner sc = new Scanner(System.in);

    String student_name,student_id;
    double student_credit;
    ArrayList<String> courses = new ArrayList<>();

    studentInfo(String name, String id, double credit){
        student_name = name;
        student_id = id;
        student_credit = credit;
    }

    void add_course(){
        courses.add(sc.nextLine());
        courses.replaceAll(String :: toUpperCase);
    }

    void drop_course(){
        courses.remove(sc.nextLine().toUpperCase());
    }

}
public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        studentInfo s1 = new studentInfo("Miftahul Islam Tashfin", "2022-3-60-34", 27.5);

        s1.courses.add("CSE110");
        s1.courses.add("PHY109");
        s1.courses.add("STA102");

        System.out.println("Add/Drop for Student 1\n");
        System.out.println("Student name : " + s1.student_name + "\nStudent ID : " + s1.student_id + "\nStudent Credits Earned : " + s1.student_credit );

        char userinput;

        do {

            System.out.println("\nStudent Courses : " + s1.courses);
            System.out.println("\nChoose an option");
            System.out.println("1. Add");
            System.out.println("2. Drop");
            System.out.println("3. Exit\n");

            userinput = sc.next().charAt(0);

            switch(userinput) {

                case '1' :
                    System.out.println("Please enter the course you want to add");
                    s1.add_course();
                    break;

                case '2' :
                    System.out.println("Please enter the course you want to drop");
                    s1.drop_course();
                    break;

                case '3' :
                    System.out.println("\nCourses after Add/Drop : " + s1.courses);
                    System.out.println("Add/Drop completed for " + s1.student_name + "\n");
                    break;

                default :
                    System.out.println("Please enter a valid option");
                    break;
            }

        }while(userinput != '3');


        studentInfo s2 = new studentInfo("Sarafat Alam Irfan", "2022-3-60-61", 23.5);

        s2.courses.add("CSE209");
        s2.courses.add("GEN226");
        s2.courses.add("MAT104");

        System.out.println("Add/Drop for Student 2\n");
        System.out.println("Student name : " + s2.student_name + "\nStudent ID : " + s2.student_id + "\nStudent Credits Earned : " + s2.student_credit );

        do {

            System.out.println("\nStudent Courses : " + s2.courses);
            System.out.println("\nChoose an option");
            System.out.println("1. Add");
            System.out.println("2. Drop");
            System.out.println("3. Exit\n");

            userinput = sc.next().charAt(0);

            switch(userinput) {

                case '1' :
                    System.out.println("Please enter the course you want to add");
                    s2.add_course();
                    break;

                case '2' :
                    System.out.println("Please enter the course you want to drop");
                    s2.drop_course();
                    break;

                case '3' :
                    System.out.println("\nCourses after Add/Drop : " + s2.courses);
                    System.out.println("Add/Drop completed for " + s2.student_name);
                    break;

                default :
                    System.out.println("Please enter a valid option");
                    break;
            }

        }while(userinput != '3');

    }

}
