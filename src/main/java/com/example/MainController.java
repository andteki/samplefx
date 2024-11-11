package com.example;

import com.google.gson.Gson;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

class User {
    String name;
}

public class MainController {

    @FXML
    void onClickDoitButton(ActionEvent event) {
        Gson gson = new Gson();
        String json = "{\"name\":\"John\"}";
        User user = gson.fromJson(json, User.class);
        System.out.println(user.name);
    }

}
