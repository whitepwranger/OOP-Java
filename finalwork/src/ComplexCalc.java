import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.LogManager;
public class ComplexCalc {
    private ComplexViwer viwer;
    private int operation;
    private ComplexNum a,b;
    private static Logger log = Logger.getGlobal();
    public ComplexCalc(){
        viwer = new ComplexViwer();
        operation = 0;
        try {
            LogManager.getLogManager().readConfiguration(ComplexCalc.class.getResourceAsStream("/log.prop"));
        }catch (IOException e) {
            System.out.println("Log error!");
        }
    }
    public void Start(){
        try {
            while (true) {
                viwer.print("Введите первое число:");
                a = viwer.GetComplexNum();
                viwer.print("Выберите операцию:\n 1 - Сложение, 2 - Умножение, 3 - Деление");
                operation = viwer.getInt();
                viwer.print("Введите второе число:");
                b = viwer.GetComplexNum();
                viwer.print("Результат: ");
                switch (operation) {
                    case 1: {
                        viwer.PrintComplexNum((ComplexNum) a.Sum(b));
                        break;
                    }
                    case 2: {
                        viwer.PrintComplexNum((ComplexNum) a.Mul(b));
                        break;
                    }
                    default: {
                        viwer.PrintComplexNum((ComplexNum) a.Div(b));
                        break;
                    }
                }
                viwer.print("Продолжить? да/нет");
                if (viwer.getStr().compareTo("да") == 0) {
                    while (true) {
                        viwer.print("Выберите операцию:\n 1 - Сложение, 2 - Умножение, 3 - Деление");
                        operation = viwer.getInt();
                        viwer.print("Введите число:");
                        b = viwer.GetComplexNum();
                        viwer.print("Результат: ");
                        switch (operation) {
                            case 1: {
                                viwer.PrintComplexNum((ComplexNum) a.Sum(b));
                                break;
                            }
                            case 2: {
                                viwer.PrintComplexNum((ComplexNum) a.Mul(b));
                                break;
                            }
                            default: {
                                viwer.PrintComplexNum((ComplexNum) a.Div(b));
                                break;
                            }
                        }
                        viwer.print("Продолжить? да/нет");
                        if (viwer.getStr().compareTo("да") != 0) {
                            break;
                        }
                    }
                }
            }
        }catch (Exception ex){
            log.info(ex.toString());
        }
    }
}
