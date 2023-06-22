import java.util.Scanner;

public abstract class Viwer {
    private Scanner scanner;
    protected Viwer(){
       scanner = new Scanner(System.in);
    }
    public void print(String str){
        System.out.println(str);
    }
    public double get(){
        return scanner.nextDouble();
    }
    public Integer getInt(){
        return scanner.nextInt();
    }
    public String getStr(){
        return scanner.next();
    }

}
