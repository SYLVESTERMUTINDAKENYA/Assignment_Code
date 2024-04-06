import java.util.ArrayList;
import java.util.List;

interface PaymentProcessing {
    void makePayment();
}

interface ExternalPaymentGateway {}

class UserInterface {
    private String sessionId;

    public UserInterface(String sessionId) {
        this.sessionId = sessionId;
    }

    public void displayHome() {}

    public void showProducts() {}

    public void showCart() {}

    public void checkout() {}
}

class ProductCatalog {
    private List<String> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    public void searchProduct() {}

    public void viewDetails() {}
}

class ShoppingCart {
    private List<String> items;
    private double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItems() {}

    public void removeItems() {}

    public void updateQuantity() {}

    public void viewCart() {}

    public void checkout() {}
}

class UserAccounts {
    private List<User> users;

    public UserAccounts() {
        this.users = new ArrayList<>();
    }

    public void registerUser() {}

    public void loginUser() {}

    public void logoutUser() {}
}

class OrderProcessing {
    private List<Order> orders;

    public OrderProcessing() {
        this.orders = new ArrayList<>();
    }

    public void createOrder() {}

    public void processOrder() {}

    public void cancelOrder() {}
}

class InventoryManagement {
    private List<String> stock;

    public InventoryManagement() {
        this.stock = new ArrayList<>();
    }

    public void checkStock() {}

    public void updateStock() {}
}

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface("session123");
        ProductCatalog productCatalog = new ProductCatalog();
        ShoppingCart cart = new ShoppingCart();
        UserAccounts userAccounts = new UserAccounts();
        OrderProcessing orderProcessing = new OrderProcessing();
        PaymentProcessing paymentProcessing = new PaymentProcessing() {
            @Override
            public void makePayment() {}
        };
        ExternalPaymentGateway externalPaymentGateway = new ExternalPaymentGateway() {};
        InventoryManagement inventoryManagement = new InventoryManagement();
    }
}
