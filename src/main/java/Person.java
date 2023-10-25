public class Person extends Animal{
    private String first = "", last = "";

    int code = 0;
    static int count = 0;




    public Person(){
        super();
        this.first = "";
        this.last = "";
        count++;

    }

    public Person(String first, String last){
        super();
        this.first = first;
        this.last = last;
        count++;

    }

    public Person(String first, String last, byte age, int code){
        super(age);
        this.first = first;
        this.last = last;
        this.code = code;
        count++;
    }
//    @Override
//    public String speak() {
//        String message = "";
//        if(!this.first.isEmpty() && !this.last.isEmpty())
//            message += "My name is " + this.first + " " + this.last;
//        else
//            message += "I don't have a name.";
//
//        if(age != 0)
//            message += " and I am " + this.age + " years old.";
//        return message;
//    }

//    @Override
//    public String getName() {
//        String message = "";
//        if(!this.first.isEmpty() && !this.last.isEmpty())
//            message += this.first + " " + this.last;
//        else
//            message += "N/A";
//
//        if(code != 0)
//            message += " " + String.valueOf(code).substring(String.valueOf(code).length()-4);
//        return message;
//    }

    public static String getPersonCount(){
       return "Person count: " + count;
    }


}
