/**
 * @author E.Parominsky 17/02/2026 09:46
 */
public class Main {

    public static void calculate(int calcValue){
        calcValue *= 100;
        System.out.println(calcValue);
    }

    public static void main(String[] args) {
        int localValue = 5;
        calculate(5);
        System.out.println(localValue);
    }
}
