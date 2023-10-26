import java.util.ArrayList;

public class Calculator implements Calculatable{

    ArrayList<String> arr = new ArrayList<String>();
    public Calculator(){

    }
    @Override
    public Integer add(Integer number1, Integer number2) {
        arr.add(number1 + " + " + number2 + " = " + (number1 + number2));
        return (number1 + number2);
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        arr.add(number1 + " - " + number2 + " = " + (number1 - number2));
        return (number1 - number2);
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        arr.add(number1 + " * " + number2 + " = " + (number1 * number2));
        return (number1 * number2);
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        arr.add(number1 + " / " + number2 + " = " + (number1 / number2));
        return (number1 / number2);
    }

    @Override
    public String getHistory() {
        String x = "";
        for(int i = 0; i < arr.size(); i++){
            x += arr.get(i) + "\n";
        }
        return x;
    }
}
