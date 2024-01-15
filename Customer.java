// Customer.java
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<Book> purchasedBooks;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedBooks = new ArrayList<>();
    }

    public void purchaseBook(Book book) {
        purchasedBooks.add(book);
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId + ", Name: " + name + ", Email: " + email);
        System.out.println("Purchased Books:");
        for (Book book : purchasedBooks) {
            System.out.println("- " + book.getTitle() + " (ISBN: " + book.getIsbn() + ", Price: $" + book.getPrice() + ")");
        }
        System.out.println();
    }
}
