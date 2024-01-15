// BookstoreApp.java
public class BookstoreApp {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        Book book1 = new Book("978-0-13-516630-7", "Clean Code", 39.99);
        Book book2 = new Book("978-0-321-87710-1", "Effective Java", 42.50);

        Customer customer1 = new Customer(1, "John Doe", "john@example.com");
        Customer customer2 = new Customer(2, "Jane Smith", "jane@example.com");

        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addCustomer(customer1);
        bookstore.addCustomer(customer2);

        bookstore.displayAvailableBooks();

        customer1.purchaseBook(book1);
        customer1.purchaseBook(book2);
        customer2.purchaseBook(book2);

        System.out.println("Customer Purchases:");
        bookstore.displayCustomerInfo();
    }
}
