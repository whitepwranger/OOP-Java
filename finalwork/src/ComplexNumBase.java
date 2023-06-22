public abstract class ComplexNumBase implements BasicOperations<ComplexNumBase>{
    private double real;
    private double imaginary;

    protected ComplexNumBase(){
        real = 0;
        imaginary = 0;
    }
    public ComplexNumBase Set(double a, double b){
        real = a;
        imaginary = b;
        return this;
    }
    public double Real(){
        return real;
    }
    public double Imaginary(){
        return imaginary;
    }

}

