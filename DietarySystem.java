CheckBox vegetarianCheck = new CheckBox("Vegetarian");
CheckBox glutenFreeCheck = new CheckBox("Gluten-Free");

gridPane.add(vegetarianCheck, 0, 12);
gridPane.add(glutenFreeCheck, 1, 12);

vegetarianCheck.setOnAction(e -> {
    if (vegetarianCheck.isSelected()) {
        // Filter menu items to show only vegetarian options
        System.out.println("Vegetarian Filter Applied");
    }
});
