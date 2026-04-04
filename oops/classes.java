import java.util.Scanner;


public class classes {
        public static void main(String[] args) {


            Student student1 = new Student();
            Student student2 = new Student();

            student1.rno = 101;
            student1.name = "John";
            student2.rno = 102;
            student2.name = "Joe";


            System.out.println("Student Roll No: " + student2.name + student1.rno);
        }

        static class Student {
            int rno ;
            String name ;
        }

}
