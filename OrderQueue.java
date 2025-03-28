public class OrderQueue implements Queue<T> {

    private Queue<CustomerOrder> queue; //linked queue of customer orders
    private int stock;
    private int size;

    //dfault const
    public OrderQueue() {

        queue = new Queue<>();
        stock = 0;
        size = 0;

    }

    public OrderQueue ( int initialStock ) {

        this();
        stock = initialStock;

    }

    public void addOrder ( String name, String date, int quantity ) {

        CustomerOrder order = new CustomerOrder ( name, date, quantity );
        queue.enqueue ( order );
        size++;

    }

    public void fulfillOrder() {

        if ( stock > 0 && !queue.isEmpty() ) {

            CustomerOrder order = queue.first();
            order.shipProduct();
            stock--;

        }

    }

}