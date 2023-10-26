public class Rectangle extends Shape{

    private int width, height;
    @Override
    String draw() {
        String message = "";
        for(int i = 0; i < height; i++){
            for(int c = 0; c < width; c++){
                if(i==0 || i == height - 1)
                    message += "*";
                else if(c==0 || c == width - 1)
                    message += "*";
                else
                    message += " ";
            }
            message += "\n";
        }
        return message;

    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
}
