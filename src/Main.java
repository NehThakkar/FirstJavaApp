import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.GroceryItem;
import models.Purchases;

public class Main extends Application {
    public static void main(String[] args) {
        GroceryItem item1 = new GroceryItem("carrots",4.49,"vegetables");
        GroceryItem item2 = new GroceryItem("mangos",7.49,"fruits");

        Purchases shoppingCart = new Purchases();
        shoppingCart.addGroceryItem(item1);
        shoppingCart.addGroceryItem(item2);

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("views/groceryCartView.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Grocery App");
        stage.show();
    }
}
