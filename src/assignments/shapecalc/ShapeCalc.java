package assignments.shapecalc;

public class ShapeCalc {
    static int numTimesUsed = 0;

    String name;

    ShapeCalc(){
        numTimesUsed++;
    }

    ShapeCalc(String name){
        this.name = name;
        numTimesUsed++;
    }

    static void circleInfo(double r){
        System.out.println(String.format("Circle:\nCircumference: %.3f, Area: %.3f ", Math.PI * 2 * r, Math.PI * r * r));
    }

    static void rectangleInfo(double l, double w){
        System.out.println(String.format("Rectangle:\nPerimeter: %.3f, Area: %.3f", 2 * (l + w), l * w));
    }

    /* Note, I do not think the width parameter is necessary for our cylinder calculations
    *  It goes unused, since w is just equal to 2 * r, which is used instead */
    static void cylinderInfo(double r, double h, double w){
        System.out.println(String.format("Cylinder:\nSurface Area: %.3f, Volume %.3f",
                Math.PI * r * r * 2 + Math.PI * 2 * r * h, Math.PI * r * r * h));
    }

    static int getNumTimesUsed(){
        return numTimesUsed;
    }
}
