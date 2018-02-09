package project1;

public class RIsl {
    
    private final double rad = Math.random() * 101;
    double x = Math.random() * (rad + 1);
    double y = Math.sqrt((rad * rad) - (x * x));
    public double playerx = 0;
    public double playery = 0;
    
    public static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

    }
    
    public static boolean crossedTheBorder(double x, double y) {
    
        return (y > Math.sqrt(10000 - (x * x)));
    
    }
}
