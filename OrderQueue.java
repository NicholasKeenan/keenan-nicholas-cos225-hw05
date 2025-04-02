public class OrderQueue {

    private ArrayQueue<CustomerOrder> queue; //linked queue of customer orders
    private int stock;
    private int size;

    //dfault const
    public OrderQueue() {

        this.queue = new ArrayQueue<>();
        this.stock = 0;
        this.size = 0;

    }

    public OrderQueue ( int initialStock ) {

        this.queue = new ArrayQueue<>();
        this.stock = initialStock;

    }

    public void addOrder ( String name, String date, int quantity ) {

        queue.enqueue ( new CustomerOrder ( name, date, quantity ) );

    }

    public void addStock ( int newStock ) {

        stock += newStock;

    }

    public void fulfillOrder() { //fulfills just one order

        if ( stock <= 0 || queue.isEmpty() ) return;

        CustomerOrder order = queue.peek();
        order.shipProduct();
        stock--;

        if ( order.getQuantity() == 0 ) {

            queue.dequeue();

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