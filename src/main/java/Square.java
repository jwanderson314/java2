public class Square extends Shape{

    private int sideLength;

    public Square(int sideLength){
        this.sideLength = sideLength;
    }
    @Override
    String draw() {
        String message = "";
        for(int i = 0; i < sideLength; i++){
            for(int c = 0; c < sideLength; c++){
                if(i == 0 || i == sideLength - 1)
                    message += "*";
                else if(c == 0 || c == sideLength - 1)
                    message += "*";
                else message += " ";
            }
            message += "\n";
        }
        return message;
    }
}
