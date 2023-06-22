public class ComplexViwer extends Viwer{
    public ComplexViwer(){
        super();
    }

    public void PrintComplexNum(ComplexNum t){
        print(t.Real() + " + " + t.Imaginary() + "i");
    }
    public void PrintComplexNum(double a, double b){
        print(a + " + " + b + "i");
    }
    public ComplexNum GetComplexNum(){
        print("Set real:");
        double a = get();
        print("Set imaginary:");
        double b = get();
        PrintComplexNum(a,b);
        return new ComplexNum(a,b);
    }
}
