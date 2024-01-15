// Bookstore.java
import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> availableBooks;
    private List<Customer> customers;

    public Bookstore() {
        this.availableBooks = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println("- " + book.getTitle() + " (ISBN: " + book.getIsbn() + ", Price: $" + book.getPrice() + ")");
        }
        System.out.println();
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Information:");
        for (Customer customer : customers) {
            customer.displayCustomerInfo();
        }
    }
}
