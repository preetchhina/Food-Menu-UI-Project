Label recipeLabel = new Label("Enter Recipe:");
TextField recipeField = new TextField();
Button addRecipeButton = new Button("Add Recipe");

gridPane.add(recipeLabel, 0, 10);
gridPane.add(recipeField, 1, 10);
gridPane.add(addRecipeButton, 1, 11);

addRecipeButton.setOnAction(e -> {
    String recipe = recipeField.getText();
    // Save the recipe in a file or array
    System.out.println("Recipe Added: " + recipe);
});
