package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.*;
import java.io.IOException;



public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart) {
        super();
        this.cart = cart;
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);
        this.setTitle("Pham Duy Dong - 5608 - Cart");
        this.setVisible(true);
        setSize(1100, 768);
        Platform.runLater(() -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/hust/soict/dsai/aims/screen/cart.fxml"));
                CartScreenController controller = new CartScreenController(cart);
                loader.setController(controller);
                Parent root = loader.load();
                fxPanel.setScene(new Scene(root));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        Platform.startup(() -> {});
        Cart cart = new Cart();
        cart.addMedia(new Book(1, "The Catcher in the Rye", "Fiction", 10.99f));
        SwingUtilities.invokeLater(() -> new CartScreen(cart));
    }
}
