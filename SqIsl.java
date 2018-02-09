package project1;

public class SqIsl {
    
    double x = Math.random() * (101+100) - 100;
    double y = Math.random() * (101+100) - 100;
    public double playerx = 0;
    public double playery = 0;
    
    public static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

    }
}
