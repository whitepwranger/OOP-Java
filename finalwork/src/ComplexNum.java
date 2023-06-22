public class ComplexNum extends ComplexNumBase{

    public ComplexNum(double a, double b){
        super();
        super.Set(a,b);
    }
    public ComplexNum(){
        super();
    }
    @Override
    public ComplexNumBase Sum(ComplexNumBase t) {
        return new ComplexNum(Real() + t.Real(), Imaginary() + t.Imaginary());
    }

    @Override
    public ComplexNumBase Mul(ComplexNumBase t) {
        double r = Real() * t.Real() - Imaginary() * t.Imaginary();
        double i = Real() * t.Imaginary() + Imaginary() * t.Real();
        return  new ComplexNum(r,i);
    }

    @Override
    public ComplexNumBase Div(ComplexNumBase t) {
        double r = (Real() * t.Real() + Imaginary() * t.Imaginary()) / (t.Real() * t.Real() + t.Imaginary() * t.Imaginary());
        double i = (Imaginary() * t.Real() - Real() * t.Imaginary()) / (t.Real() * t.Real() + t.Imaginary() * t.Imaginary());
        return  new ComplexNum(r,i);
    }
}
