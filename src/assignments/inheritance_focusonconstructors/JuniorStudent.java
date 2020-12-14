package assignments.inheritance_focusonconstructors;

public class JuniorStudent {
    String name;
    int grade;

    JuniorStudent(){
        System.out.println("No constructor");
    }

    JuniorStudent(String name, int grade){
        this.name = name;
        this.grade = grade;
        System.out.printf("Junior student is %s and in grade %d\n", name, grade);
    }
}
