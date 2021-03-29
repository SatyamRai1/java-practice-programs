public class ComplexNumber {
    private double real;
    private  double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }

    public void add(double re,double im){
        real+=re;
        imaginary+=im;

    }
    public void subtract(double re,double im){
        real-=re;
        imaginary-=im;
    }

    public void add(ComplexNumber comp){
        real+=comp.getReal();
        imaginary+=comp.getImaginary();
    }
    public void subtract(ComplexNumber comp){
        real-=comp.getReal();
        imaginary-=comp.getImaginary();
    }
}

