package assignments.inheritance_focusonconstructors;

public class CompSciStudent extends SeniorStudent {
    // An error will result since SeniorStudent has no default constructor

    // Resolve method 1:
    CompSciStudent(String name){
        super(name);
    }
}
