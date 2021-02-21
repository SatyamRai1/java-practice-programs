


public class Car {
    public static void main(String[] args) {
        Car seltos=new Car("Kia Seltos",4,"glossy red",4.315,"SUV",16.49);
        System.out.println("Name: "+seltos.getName());
        System.out.println("Number of doors: "+seltos.getDoors());
        System.out.println("color of the car: "+seltos.getColor());
        System.out.println("Length of car: "+seltos.getLength());
        System.out.println("Segment of the car: "+seltos.getSegment());
        System.out.println("Cost of car in lakhs: Rs"+seltos.getCostInLakhs());
        System.out.println();
        System.out.println();

        Car cab1=new Car();
        System.out.println("Name: "+cab1.getName());
        System.out.println("no. of doors: "+cab1.getDoors());
        System.out.println("color: "+cab1.getColor());
        System.out.println("length: "+cab1.getLength());
        System.out.println("segment: "+cab1.getSegment());
        System.out.println("cost: "+cab1.getCostInLakhs());


    }
    private  String name;
    private int doors;
    private String color;
    private double length;
    private String segment;
    private double costInLakhs;


    //____________________________________Empty constructor_____________________________________________________________

    public Car(){
        this("Swift",4,"generic white",4.0,"hatchback",5.86);
    }

    //____________________________________Partial constructor____(one of the many that are possible)____________________

    public Car(double length, String segment, double costInLakhs){
        this("Swift Dzire",4,"Default White",length,segment,costInLakhs);
    }

    //___________________________________Full constructor_______________________________________________________________

    public Car(String name,int doors, String color, double length, String segment, double costInLakhs){
        this.name=name;
        this.doors=doors;
        this.color=color;
        this.length=length;
        this.segment=segment;
        this.costInLakhs=costInLakhs;
    }

    public String getName(){
        return this.name;
    }
    public int getDoors(){
        return this.doors;
    }
    public String getColor(){
        return this.color;
    }
    public double getLength(){
        return this.length;
    }
    public String getSegment(){
        return this.segment;
    }
    public double getCostInLakhs(){
        return this.costInLakhs;
    }
}


// private access nodifier means- 'don't allow a class other than this one to make changes to this variable/ method'

// if you want changes to be made by outside classes, change the access modifier to 'public'.what this means is
// youll be able to do dzire.model="suv" in the main class after changing the model field here to public
//this practice is not recommended as it violates the rules of encapsulation



// As a geeral rue,     1. always set member variables of a class as private.       2.to change the values of member variables of objects
//created of the class, use methods(public) defined in the class of the object
