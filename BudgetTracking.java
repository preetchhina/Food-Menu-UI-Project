Label budgetLabel = new Label("Budget:");
TextField budgetField = new TextField();
Label totalCostLabel = new Label("Total Cost: 0");
double[] totalCost = {0.0};

Button checkBudgetButton = new Button("Check Budget");

gridPane.add(budgetLabel, 0, 4);
gridPane.add(budgetField, 1, 4);
gridPane.add(totalCostLabel, 0, 5);
gridPane.add(checkBudgetButton, 1, 5);

addButton.setOnAction(e -> {
    String name = nameField.getText();
    double price = Double.parseDouble(priceField.getText());
    int calories = Integer.parseInt(caloriesField.getText());
    totalCost[0] += price;
    totalCostLabel.setText("Total Cost: " + totalCost[0]);
});

checkBudgetButton.setOnAction(e -> {
    double budget = Double.parseDouble(budgetField.getText());
    if (totalCost[0] > budget) {
        System.out.println("Over budget!");
    } else {
        System.out.println("Within budget.");
    }
});
