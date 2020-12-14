package assignments.inheritance_focusonconstructors;

public class Runner {
    public static void main(String[] args) {
        JuniorStudent aaron = new JuniorStudent();
        JuniorStudent ben = new JuniorStudent("Ben", 1);

        PrimaryStudent rose = new PrimaryStudent("Rose", 2);
        // Prints no constructor, but never calls the JuniorStudent constructor that takes
        // two parameters

        CompSciStudent renee = new CompSciStudent("Renee"); // No error
    }
}
