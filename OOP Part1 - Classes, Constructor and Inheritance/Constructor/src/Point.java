public class Point {

    public static void main(String[] args) {
            Point first = new Point(6,5);
            Point Second = new Point(3,1);
            System.out.println("Distance(0,0) = " + first.distance());
            System.out.println("Distance(second) = " + first.distance(Second));
            System.out.println("Distance(0,0) = " + first.distance(2,2));
            Point point = new Point();
            System.out.println("distance() = " + point.distance());
    }

    private int x, y;

    public Point() {
        System.out.println("Empty Constructor");
    }

    /*    xA = this.x; (the x from    Point "A", our instance variable x)

                    yA = this.y; (the y from Point "A", our instance variable y)

                    xB = 0.0; (the instructions tell us to calculate between our Point and 0,0, I use 0.0 because it returns a double, by writing a decimal number, it gives me a reminder of what for the data is going to be)

                    yB = 0.0;  (the instructions tell us to calculate between our Point and 0,0, I use 0.0 because it returns a double, by writing a decimal number, it gives me a reminder of what for the data is going to be) */


    public double distance() {
        
        return Math.sqrt((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y));
    }

                     
    public double distance(int x, int y) {
          
        return Math.sqrt((this.y - x) * (this.y - x) + (this.x - y) * (this.x - y));
    }

    /* (xB − xA) * (xB - xA) + (yB − yA) *  (yB - yA)


        xA = this.x; (the x from Point "A", our instance variable x)

        yA = this.y; (the y from Point "A", our instance variable y)

        xB = x from another, or another.x

        yB = y from another, or another.y */

    public double distance(Point another) {
        return Math.sqrt((another.x - this.x)  *  (another.x - this.x) + (another.y - this.y) *  (another.y - this.y));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
