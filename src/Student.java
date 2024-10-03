import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;

    public static double averageRating;


    // TODO implement Student class according to the instructions provided in the README.md file

    public static double getAvgRating() {
        // TODO return average rating of all students
        if (StudentTest.students.size () == 0) return 0;
        else {
            int sumRating = 0;
            double avgRating;
            for (Student student : StudentTest.students) {
                sumRating += student.getRating ();
            }
            avgRating = (double)sumRating / StudentTest.students.size ();
            return avgRating;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Student() {}

    public Student(String name) {
        this.name = name;
        this.rating = 0;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        return this.getRating () >= student.getRating ();
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        this.setRating( rating );
        averageRating = getAvgRating();


    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return "Student's name is " + this.getName () + " and rating is " + this.getRating ();
    }

/*
    public static void removeStudent(Student student) {
        // TODO remove student
    }
*/

}