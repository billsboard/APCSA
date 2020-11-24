package assignments.shapecalc;

public class Runner {
    public static void main(String[] args) {
        System.out.println(ShapeCalc.getNumTimesUsed());

        ShapeCalc sc = new ShapeCalc();
        System.out.println(ShapeCalc.getNumTimesUsed());

        ShapeCalc.circleInfo(1);
        ShapeCalc.rectangleInfo(2, 4);

        /* Note, I do not think the width parameter is necessary for our cylinder calculations */
        ShapeCalc.cylinderInfo(2, 10, 4);

        sc = new ShapeCalc("Ki");
        System.out.println(sc.name);
        System.out.println(ShapeCalc.getNumTimesUsed()); // Incremented
    }
}
