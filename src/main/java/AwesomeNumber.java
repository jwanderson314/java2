public class AwesomeNumber {
    int num = 0;

    public AwesomeNumber(int num){
        this.num = num;
    }

    public String toString(){
        return String.valueOf(num);

    }

    public static int add(AwesomeNumber num1, AwesomeNumber num2){
        return (Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));

    }

    public static int subtract(AwesomeNumber num1, AwesomeNumber num2){
        return (Integer.parseInt(num1.toString()) - Integer.parseInt(num2.toString()));
    }

}
