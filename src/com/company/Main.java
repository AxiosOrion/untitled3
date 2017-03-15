package com.company;


    public void start(Stage primaryStage) throws Exception {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Options");
        inputDialog.setHeaderText("Select an option");
        inputDialog.setContentText("option 1 or option 2");
        inputDialog.showAndWait();
        String optionString ="";
        optionString = inputDialog.getResult();
        int option = Integer.parseInt(optionString);

        if (option==1) {
            System.out.println("Option 1 is selected");
        } else {
            System.out.printf("option %5s%d%-5c%1.4e is selected"," ",2,'X',12345.67890);
        }
    }
    public static void main(String [] args) {
        launch(args);
    }


}