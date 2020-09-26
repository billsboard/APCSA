public class Booleans {
    public static void main(String[] args) {

        // Booleans are a data type that can only support values of true and false

        boolean x = true;

        /*
        Boolean operators:
        &&: Logical AND. Both values must be true
        ||: Logical OR. At least one value must be true
        !: NOT. Negates a boolean (makes it false)
         */

        int grade = 12;
        int age = 16;

        if(grade == 12 && age == 16){
            System.out.println("You are a genius like Cole");
        }

        // Exercise:
        /*
        You win a scholarship if you are in grade 12, have a GPA higher that 86%
        and have not been absent for more than 5 days
         */

        double GPA = 90;
        double absences = 2;
        grade = 12;

        if(grade == 12 && absences <= 5 && GPA >= 86){
            System.out.println("You win the scholarship!");
        }


        /*
        You have to see Ms. Jones if your absences are greater than 10, or your grade is less than 70%
        and you are in grade in grade 10, 11, or 12
         */

        grade = 11;
        absences = 3;
        GPA = 49;
        if((absences > 10 || GPA < 70) && (grade <= 12 && grade >= 10)){
            System.out.println("Go see Ms. Jones.");
        }


        /*
        If you are not in grade 12, and your GPA is between 75% and 85%,
        go get tutoring in the study.
         */

        grade = 10;
        GPA = 80;

        if(grade != 12 && (GPA >= 75 && GPA <= 85)){
            System.out.println("Go get tutoring.");
        }
        // Note 75 < GPA < 85 is not valid syntax



        /*
        Short circuit: When evaluating using the logical operators, if the first part of a statement
        already evaluates the entire statement, the second part is not checked

        Eg.
        (true || false) -> The true means the logical OR is true, so the second part of the statement is not checked
         */



        /*
        De Morgan's Laws

        !(a && b) is equivalent to !a || !b
        !(a || b) is equivalent to !a && !b
         */



    }
}
