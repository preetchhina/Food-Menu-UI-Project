Label mealPlanLabel = new Label("Select meals for Monday:");
Button breakfastButton = new Button("Add to Breakfast");
Button lunchButton = new Button("Add to Lunch");
Button dinnerButton = new Button("Add to Dinner");

gridPane.add(mealPlanLabel, 0, 8);
gridPane.add(breakfastButton, 0, 9);
gridPane.add(lunchButton, 1, 9);
gridPane.add(dinnerButton, 2, 9);

breakfastButton.setOnAction(e -> {
    // Add the current selected item to the breakfast plan
    System.out.println("Added to Monday Breakfast");
});
