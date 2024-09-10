import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class BudgetTrackingUI {

    private FoodMenuUIProject2024 app;

    public BudgetTrackingUI(FoodMenuUIProject2024 app) {
        this.app = app;
    }

    public void addBudgetTrackingSection(GridPane gridPane) {
        Label budgetLabel = new Label("Budget:");
        TextField budgetField = new TextField();
        Label totalCostLabel = new Label("Total Cost: 0");
        Button checkBudgetButton = new Button("Check Budget");

        gridPane.add(budgetLabel, 0, 4);
        gridPane.add(budgetField, 1, 4);
        gridPane.add(totalCostLabel, 0, 5);
        gridPane.add(checkBudgetButton, 1, 5);

        checkBudgetButton.setOnAction(e -> {
            double totalCost = 0;
            for (int i = 0; i < app.itemCount; i++) {
                totalCost += app.itemPrices[i];
            }
            totalCostLabel.setText("Total Cost: " + totalCost);
            app.budget = Double.parseDouble(budgetField.getText());
            if (totalCost > app.budget) {
                System.out.println("Over budget!");
            } else {
                System.out.println("Within budget.");
            }
        });
    }
}
