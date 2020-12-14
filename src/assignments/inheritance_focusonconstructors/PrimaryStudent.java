package assignments.inheritance_focusonconstructors;

public class PrimaryStudent extends JuniorStudent {
    PrimaryStudent(String name, int grade){
        super();
        System.out.println("Primary Student");
        // super(); INVALID, super must be first statement in constructor
    }
}
