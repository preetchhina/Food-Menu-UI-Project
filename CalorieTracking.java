Label calorieLimitLabel = new Label("Calorie Limit:");
TextField calorieLimitField = new TextField();
Label totalCaloriesLabel = new Label("Total Calories: 0");
int[] totalCalories = {0};

gridPane.add(calorieLimitLabel, 0, 6);
gridPane.add(calorieLimitField, 1, 6);
gridPane.add(totalCaloriesLabel, 0, 7);

addButton.setOnAction(e -> {
    String name = nameField.getText();
    double price = Double.parseDouble(priceField.getText());
    int calories = Integer.parseInt(caloriesField.getText());
    totalCalories[0] += calories;
    totalCaloriesLabel.setText("Total Calories: " + totalCalories[0]);
});
