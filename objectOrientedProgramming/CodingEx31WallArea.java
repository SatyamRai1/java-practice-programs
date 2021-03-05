public class CodingEx31WallArea {
    private double width;
    private double height;
    public CodingEx31WallArea(){
        this(0,0);

    }
    public CodingEx31WallArea(double width ,double height){
        if(width>=0 && height>=0){
            this.width=width;
            this.height=height;
        }else if(width>=0 && height<0){
            this.width=width;
            this.height=0;
        }else if(height>=0 && width<0){
            this.height=height;
            this.width=0;
        }else{
            this.height=0;
            this.width=0;
        }
    }



    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }


    public void setWidth(double width){
        if(width>=0){
            this.width=width;
        }else {
            this.width=0;
        }
    }
    public void setHeight(double height){
        if(height>=0){
            this.height=height;
        }else {
            this.height=0;
        }
    }

    public double getArea(){
        return width*height;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        CodingEx31WallArea wall1=new CodingEx31WallArea(5,4);
        System.out.println("area = "+wall1.getArea());
        wall1.setHeight(-1.5);
        System.out.println("width = "+wall1.getWidth());
        System.out.println("height = "+wall1.getHeight());
        System.out.println("new area = "+wall1.getArea());

    }
}
*/