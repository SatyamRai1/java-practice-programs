//import java.lang.Math;
//Math.pow(num, 2);
//Math.sqrt(c);


public class CE32Point {


    private int x;
    private int y;

    public CE32Point(){

    }
    public CE32Point(int x, int y){
        this.x=x;
        this.y=y;
    }


    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
    public double distance(CE32Point point2){
        return Math.sqrt(Math.pow((this.x-point2.x),2)+Math.pow((this.y-point2.y),2));
    }
}
