import java.util.*;
public class Calc extends BaseCalc{
    private double a,b;
    private double result;
    private int operation;
    Scanner input;
    public Calc(Double num1, Double num2){
        a = num1; b = num2; result = 0;
        input = new Scanner(System.in);
    }
    public Calc(){
       this(0.0,0.0);
    }
    public void InputA(){
        System.out.println("Введите первое число:");
        a = input.nextDouble();
        operation = OutputChoice();

    }
    public double InputB(){
        System.out.println("Введите второе число:");
        b = input.nextDouble();
        switch (operation){
            case 1:{
                return sum(a,b);
            }
            case 2:{
                return subtraction(a,b);
            }
            case 3:{
                return multiplication(a,b);
            }
            case 4:{
                return division(a,b);
            }
            case 5:{
                return ROTW(a,b);
            }
            case 6: {
                return pow(a, b);
            }
        }
        return 0;
    }
    public  int OutputChoice(){
        System.out.println("Введите цифру, соответствующую необходимой операции:\n " +
                "1. +  \t " +
                "2. -  \t " +
                "3. *  \t " +
                "4. /  \t " +
                "5. %  \t " +
                "6. Степень  \t ");
        return input.nextInt();
    }
    public  int WhatsNext(){
        System.out.println("1.Продолжить с текущим результатом\n2.Ввести число заново");
        return input.nextInt();
    }
    public void Start(){
        InputA();
        while(true){
            result = InputB();
            System.out.println("Результат: " + result);
            if(WhatsNext() == 1){
                a = result;
                operation = OutputChoice();
            }else{
                InputA();
            }
        }
    }

}
