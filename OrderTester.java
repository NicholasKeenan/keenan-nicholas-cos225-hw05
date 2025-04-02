public class OrderTester {

    public static void main ( String[] args ) {

        OrderQueue queue = new OrderQueue ( 14 );

        queue.addOrder ( "Customer1", "2023-01-01", 5 );
        queue.addOrder ( "Customer2", "2023-01-02", 5 );
        queue.addOrder ( "Customer3", "2023-01-03", 8 );

        System.out.println ( queue );

        queue.fulfillAll();

        System.out.println ( queue );

        queue.addStock ( 18 );

        queue.addOrder ( "Customer4", "2023-01-04", 3 );
        queue.addOrder ( "Customer5", "2023-01-05", 3 );
        queue.addOrder ( "Customer6", "2023-01-06", 5 );

        queue.fulfillAll();

        System.out.println ( queue );

    }

}