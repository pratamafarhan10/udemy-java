import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("0.1");
        BigDecimal y = new BigDecimal("0.2");

        System.out.println(x.add(y));
        System.out.println(x.subtract(y));
        System.out.println(x.divide(y));
    }    
}
