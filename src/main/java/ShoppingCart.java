import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ShoppingCart {
    private ArrayList<Item> arr = new ArrayList<Item>();
    Locale usa = new Locale("en", "US");
    NumberFormat fmt = NumberFormat.getCurrencyInstance(usa);

    private double total = 0.0, charge = 0.0;
    public ShoppingCart(){

    }

    public ShoppingCart(double shippingCharge){
        this.charge = shippingCharge;
    }

//    public String toString(){
//        String message = "";
//        for(int i = 0; i < arr.size(); i++) {
//            double tot = arr.get(i).getPrice() * arr.get(i).getQuantity();
//            message += arr.get(i).getItemName() + " " + fmt.format(arr.get(i).getPrice()) + " (" + arr.get(i).getQuantity() + ") " + tot + "\n";
//
//        }
//        return message;
//    }



    public void addItem(Item item){
        arr.add(item);
    }

    public void calculateTotal(){
        for(int i = 0; i < arr.size(); i++){
            total += arr.get(i).quantity * arr.get(i).price;
        }
        if(charge != 0){
            total += charge;
        }
        else {

            if(total < 10.0)
                total += charge;

        }

        total *= 1.1;
        System.out.println("Items");
        System.out.println("-----");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i).toString());

        }
        if(charge==0)
            System.out.println("\nShipping: Free");
        else System.out.println("\nShipping: " + fmt.format(charge));
    }

    public double getTotal(){
        return total;
    }


    public Invoice shipOrder(String name, String address, String city, String state, String zip){
        return new Invoice(name, address, city, state, zip);
    }
}
