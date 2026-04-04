import java.util.Scanner;


public class classes {
        public static void main(String[] args) {


            Student student1 = new Student();
            Student student2 = new Student();

            student1.rno[0] = 101;
            student1.name[0] = "John";
            student2.rno[0] = 102;


            System.out.println("Student Roll No: " + student1.name[0] + student1.rno[0]);
        }

        static class Student {
            int[] rno=new int[1] ;
            String[] name=new String[1] ;
        }

}
