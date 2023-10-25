import java.text.NumberFormat;
import java.util.Locale;

public class Item {
    double price = 0.0;
    int quantity = 0;
    String itemName = "";
    Locale usa = new Locale("en", "US");
    NumberFormat fmt = NumberFormat.getCurrencyInstance(usa);

    public Item(double price, int quantity, String itemName){
        this.price = price;
        this.quantity = quantity;
        this.itemName = itemName;
    }

    public String toString(){
        String message = "";
        double tot = this.price * this.quantity;
        message += this.itemName + " " + fmt.format(this.price) + " (" + this.quantity + ") " + fmt.format(tot);
        return message;
    }

    public String getItemName(){
        return itemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}
