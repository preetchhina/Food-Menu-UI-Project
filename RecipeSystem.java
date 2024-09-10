import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.stage.Modality;

public class RecipeSystemUI {

    private FoodMenuUIProject2024 app;

    public RecipeSystemUI(FoodMenuUIProject2024 app) {
        this.app = app;
    }

    public void addRecipeSystemSection(GridPane gridPane) {
        Button recipeButton = new Button("Add/View Recipe");

        recipeButton.setOnAction(e -> {
            Stage recipeWindow = new Stage();
            recipeWindow.initModality(Modality.APPLICATION_MODAL);
            recipeWindow.setTitle("Recipe Details");

            GridPane recipePane = new GridPane();
            Label recipeLabel = new Label("Enter Recipe:");
            TextField recipeField = new TextField();
            Button saveRecipeButton = new Button("Save Recipe");

            recipePane.add(recipeLabel, 0, 0);
            recipePane.add(recipeField, 1, 0);
            recipePane.add(saveRecipeButton, 1, 1);

            saveRecipeButton.setOnAction(ev -> {
                String recipe = recipeField.getText();
                System.out.println("Recipe Saved: " + recipe);
                recipeWindow.close();
            });

            Scene recipeScene = new Scene(recipePane, 300, 200);
            recipeWindow.setScene(recipeScene);
            recipeWindow.showAndWait();
        });

        gridPane.add(recipeButton, 1, 8);
    }
}
