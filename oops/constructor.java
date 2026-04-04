import java.util.Scanner;


public class constructor {
    public static void main(String[] args) {


        //Student student1 = new Student();
        //Student student2 = new Student();

            /*student1.rno = 101;
            student1.name = "John";
            student2.rno = 102;
            student2.name = "Joe";*/


            /*System.out.println("Student Roll No: " + student2.name + student1.rno);
            Student student3 = new Student();
            System.out.println(student3);*/
        Student student4 = new Student(1, "john");
        Student student5 = new Student(2, "joe");
        System.out.println(student4+"\n"+student5+"\n");
    }

    static class Student {
        int rno;
        String name;

        Student(int rno, String name) {
            this.rno = rno;
            this.name = name;
        }

        @Override
        public String toString() {
            return  rno  + name ;
        }
    }
}


