// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BaseCalc bcalc = new Calc();
        Calc calc = (Calc) bcalc;
        System.out.println("5 + 4 = " + (int)bcalc.sum(5.0,4.0));
        calc.Start();
    }
}