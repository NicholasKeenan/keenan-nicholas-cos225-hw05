public class CustomerOrder {

    private String name;
    private String date;
    private int quantity;

    //dfault construct
    public CustomerOrder() {

        this.name = null;
        this.date = null;
        this.quantity = 0;

    }

    //p construct
    public CustomerOrder ( String name, String date, int quantity ) {

        this.name = name;
        this.date = date;
        this.quantity = quantity;

    }

    //fucntion to ship product
    public void shipProduct() {

        if ( quantity > 0 ) {

            quantity--;

        }

    }

    public int getQuantity() {//gets quantity for later function

        return quantity;

    }

    //tostring
    @Override
    public String toString() {

        return String.valueOf ( quantity );

    }

}