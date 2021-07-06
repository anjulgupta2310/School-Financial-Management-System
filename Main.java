

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anjul on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Teacher Sarvanand = new Teacher(1,"Sarvanand",25,500);
        Teacher Anita = new Teacher(2,"Anita",27,700);
        Teacher DanveerSingh = new Teacher(3,"DanveerSingh",45,600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Sarvanand);
        teacherList.add(Anita);
        teacherList.add(DanveerSingh);


        Student Aryan = new Student(1,"Aryan",10,4);
        Student Anjul = new Student(2,"Anjul",17,12);
        Student Ayush = new Student(3,"Ayush",12,5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Aryan);
        studentList.add(Ayush);
        studentList.add(Anjul);




        School MVM = new School(teacherList,studentList);
        Teacher megan = new Teacher(6,"Megan",28, 900);
        Teacher teja = new Teacher(6,"Teja",28, 900);
        MVM.addTeacher(megan);
        MVM.addTeacher(teja);



        Aryan.payFees(5000);
        Anjul.payFees(6000);
        System.out.println("\n MVM has earned Rs. "+ MVM.getTotalMoneyEarned());
       

        System.out.println("\n------Making SCHOOL PAY SALARY----\n");
        Sarvanand.receiveSalary(Sarvanand.getSalary());
        System.out.println("MVM has spent for salary to " + Sarvanand.getName()
        +" and now has Rs. " + MVM.getTotalMoneyEarned());

        DanveerSingh.receiveSalary(DanveerSingh.getSalary());
        System.out.println("MVM has spent for salary to " + DanveerSingh.getName()
                +" and now has Rs. " + MVM.getTotalMoneyEarned());


        System.out.println(Anjul);

        Anita.receiveSalary(Anita.getSalary());

        System.out.println(Anita);


    }
}
