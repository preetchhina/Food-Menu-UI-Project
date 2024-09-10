import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class CalorieTrackingUI {

    private FoodMenuUIProject2024 app;

    public CalorieTrackingUI(FoodMenuUIProject2024 app) {
        this.app = app;
    }

    public void addCalorieTrackingSection(GridPane gridPane) {
        Label calorieLimitLabel = new Label("Calorie Limit:");
        TextField calorieLimitField = new TextField();
        Label totalCaloriesLabel = new Label("Total Calories: 0");
        Button checkCaloriesButton = new Button("Check Calories");

        gridPane.add(calorieLimitLabel, 0, 6);
        gridPane.add(calorieLimitField, 1, 6);
        gridPane.add(totalCaloriesLabel, 0, 7);
        gridPane.add(checkCaloriesButton, 1, 7);

        checkCaloriesButton.setOnAction(e -> {
            int totalCalories = 0;
            for (int i = 0; i < app.itemCount; i++) {
                totalCalories += app.itemCalories[i];
            }
            totalCaloriesLabel.setText("Total Calories: " + totalCalories);
            app.calorieLimit = Integer.parseInt(calorieLimitField.getText());
            if (totalCalories > app.calorieLimit) {
                System.out.println("Over calorie limit!");
            } else {
                System.out.println("Within calorie limit.");
            }
        });
    }
}
