import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        StudentTest list = new StudentTest ();

        Student student1 = new Student("Andrii");
        Student student2 = new Student("Serhii");
        Student student3 = new Student("Max");


        student1.setRating ( 50 );
        student2.setRating ( 30 );
        student3.setRating ( 10 );

        list.students.add ( student1 );
        list.students.add ( student2 );
        list.students.add ( student3 );

        System.out.println();
        System.out.println("\'getName()\' method test");
        System.out.println();


        System.out.println (student1.getName());
        System.out.println (student2.getName());
        System.out.println (student3.getName());

        System.out.println();
        System.out.println("\'getRating()\' method test");
        System.out.println();

        System.out.println (student1.getRating ());
        System.out.println (student2.getRating ());
        System.out.println (student3.getRating ());

        System.out.println();
        System.out.println("\'toString()\' method test");
        System.out.println();

        System.out.println (student1.toString ());
        System.out.println (student2.toString ());
        System.out.println (student3.toString ());

        System.out.println();
        System.out.println("\'betterStudent()\' method test");
        System.out.println();


        System.out.println (student1.betterStudent (student2));

        System.out.println();
        System.out.println(list.students.size ());
        System.out.println();

        System.out.println();
        System.out.println("\'getAvgRating()\' method test");
        System.out.println();

        System.out.println("Average ratings of " + list.students.size () + " students is " + Student.getAvgRating ());

        System.out.println();
        System.out.println("\'changeRating()\' method test");
        System.out.println();

        student1.changeRating ( 40 );
        student2.changeRating ( 20 );
        student3.changeRating ( 6 );

        System.out.println (student1.toString ());
        System.out.println (student2.toString ());
        System.out.println (student3.toString ());

        System.out.println();
        System.out.println("\'getAvgRating()\' method test again");
        System.out.println();

        System.out.println("Average ratings of " + list.students.size () + " students is " + Student.averageRating);






    }
}
