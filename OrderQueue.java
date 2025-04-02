import java.util.ArrayList;

public class OrderQueue extends ArrayQueue<T> {

    private Queue<CustomerOrder> queue; //linked queue of customer orders
    private int stock;
    private int size;

    //dfault const
    public OrderQueue() {

        this.queue = new Queue<>();
        this.stock = 0;
        this.size = 0;

    }

    public OrderQueue ( int initialStock ) {

        this.queue = new Queue<>();
        stock = initialStock;

    }

    public void addOrder ( String name, String date, int quantity ) {

        CustomerOrder order = new CustomerOrder ( name, date, quantity );
        queue.enqueue ( order );
        size++;

    }

    public void addStock ( int newStock ) {

        stock += newStock;

    }

    public void fulfillOrder() { //fulfills just one order

        if ( stock > 0 && !queue.isEmpty() ) {

            CustomerOrder order = queue.peek();
            order.shipProduct();
            stock--;

            if ( order.getQuantity() == 0 ) {

                queue.dequeue();
                size--;

            }

        }

    }

    public void fulfillAll() { //fulfills all orders

        while ( stock > 0 && !queue.isEmpty() ) {

            fulfillOrder();

        }

    }

    @Override
    public String toString() {

        if ( !queue.isEmpty() ) {

            return queue.peek().toString();

        }

        return "empty";

    }

}