import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FoodMenuUIProject2024 extends Application {

    // Arrays for Menu Items
    String[] itemNames = new String[100];
    double[] itemPrices = new double[100];
    int[] itemCalories = new int[100];
    int itemCount = 0;

    // Budget and calorie tracking
    double budget = 0.0;
    int calorieLimit = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Food Menu UI Project 2024");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Menu creation UI
        MenuCreationUI menuCreationUI = new MenuCreationUI(this);
        menuCreationUI.addMenuCreationSection(gridPane);

        // Budget tracking UI
        BudgetTrackingUI budgetTrackingUI = new BudgetTrackingUI(this);
        budgetTrackingUI.addBudgetTrackingSection(gridPane);

        // Calorie tracking UI
        CalorieTrackingUI calorieTrackingUI = new CalorieTrackingUI(this);
        calorieTrackingUI.addCalorieTrackingSection(gridPane);

        // Recipe system UI
        RecipeSystemUI recipeSystemUI = new RecipeSystemUI(this);
        recipeSystemUI.addRecipeSystemSection(gridPane);

        // Meal planning UI
        MealPlanningUI mealPlanningUI = new MealPlanningUI(this);
        mealPlanningUI.addMealPlanningSection(gridPane);

        // Set up the Scene and show the window
        Scene scene = new Scene(gridPane, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
