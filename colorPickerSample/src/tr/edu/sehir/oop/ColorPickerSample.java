package tr.edu.sehir.oop;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ColorPickerSample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("ColorPicker");
        Scene scene = new Scene(new HBox(20), 400, 100);
        HBox box = (HBox) scene.getRoot();
        box.setPadding(new Insets(5, 5, 5, 5));
        final ColorPicker colorPicker = new ColorPicker();
        colorPicker.setValue(Color.CORAL);

        final Text text = new Text("Try the color picker!");
        text.setFont(Font.font ("Verdana", 20));
        text.setFill(colorPicker.getValue());


        colorPicker.setOnAction((ActionEvent t) -> {
            text.setFill(colorPicker.getValue());
        });

        box.getChildren().addAll(colorPicker, text);

        stage.setScene(scene);
        stage.show();
    }
}