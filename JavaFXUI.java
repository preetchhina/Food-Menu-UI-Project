import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuCreationUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menu Creation");

        // Labels and Input Fields
        Label nameLabel = new Label("Item Name:");
        TextField nameField = new TextField();
        Label priceLabel = new Label("Price:");
        TextField priceField = new TextField();
        Label caloriesLabel = new Label("Calories:");
        TextField caloriesField = new TextField();

        Button addButton = new Button("Add Item");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(priceLabel, 0, 1);
        gridPane.add(priceField, 1, 1);
        gridPane.add(caloriesLabel, 0, 2);
        gridPane.add(caloriesField, 1, 2);
        gridPane.add(addButton, 1, 3);

        addButton.setOnAction(e -> {
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            int calories = Integer.parseInt(caloriesField.getText());
            // Save the item (store it in a data structure like an array or list)
            System.out.println("Added: " + name + " | Price: " + price + " | Calories: " + calories);
        });

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
