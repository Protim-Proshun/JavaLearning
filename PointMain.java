class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // distance between (0,0) and (x,y)
        double xSquare = x * x;
        double ySquare = y * y;

        return Math.sqrt(xSquare + ySquare);
    }

    public double distance(Point givenPoint) {
        // distance between this point and given point in parameter
        double xSquare = (x-givenPoint.getX()) * (x-givenPoint.getX());
        double ySquare = (y- givenPoint.getY()) * (y- givenPoint.getY());

        return Math.sqrt(xSquare + ySquare);
    }

    public double distance(int givenX, int givenY) {
        double xSquare = (x - givenX) * (x - givenX);
        double ySquare = (y - givenY) * (y - givenY);

        return Math.sqrt(xSquare + ySquare);
    }
}
public class PointMain {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
