public class Point {
    private int x;
    private int y;

    //constructor for both instance variables
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //constructor to take one value and set x and y to that value
    public Point(int num) {
        x = num;
        y = num;
    }
    //constructor with no parameters that sets x and y to 0
    public Point() {
        x = 0;
        y = 0;
    }
    //getter for x instance
    public int getX(){
        return x;
    }
    //getter for y instance
    public int getY(){
        return y;
    }
    //setter for x instance variable
    public void setX(int newX) {
        x = newX;
    }
    //setter for y instance variable
    public void setY(int newY) {
        y = newY;
    }
    //method that returns coordinate String
    public String coordinate() {
        return "(" + x + "," + y + ")";
    }
    //method that returns quadrants of points
    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        }
        else if (x < 0 && y < 0) {
            quadrant = "III";
        }
        else if (x > 0 && y < 0) {
            quadrant = "IV";
        }
        else if (x == 0 && y == 0) {
            quadrant = "origin";
        } else {
            quadrant = "on an axis";
        }
        return quadrant;
    }
}
