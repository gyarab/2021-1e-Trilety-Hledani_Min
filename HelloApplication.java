package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

import static javafx.scene.paint.Color.*;


public class HelloApplication extends Application {


    static final int radek = 10; //kolik poliček bude v radku
    static final int sloupec = 10;   //kolik bude ve sloupci


    static Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(300, 300);
        int y;
        int x;
        for (y = 0; y < sloupec; y++) {
            for (x = 0; x < radek; x++) {
               Tile tile = new Tile(x, y);
                root.getChildren().add(tile);


            }
        }

        return root;
    }

    static class Tile extends StackPane  {
        private final Text text = new Text();
        boolean i = true;
        final Rectangle border;


        public Tile(int x, int y) {

            if (x == 0 & y == 0) {
                i = false;
            }
            if (x == 0 & y == 1) {
                i = false;

            }
            if (x == 0 & y == 2) {
                i = true;
                text.setText("2");
            }
            if (x == 0 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 0 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 0 & y == 5) {
                i = false;
            }
            if (x == 0 & y == 6) {
                i = true;
                text.setText("1");
            }
            if (x == 0 & y == 7) {
                i = true;
                text.setText("1");
            }
            if (x == 0 & y == 8) {
                i = true;
                text.setText("1");
            }
            if (x == 0 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 0) {
                i = true;
                text.setText("3");
            }
            if (x == 1 & y == 1) {
                i = true;
                text.setText("4");
            }
            if (x == 1 & y == 2) {
                i = false;
            }
            if (x == 1 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 5) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 6) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 7) {
                i = true;
                text.setText("1");
            }
            if (x == 1 & y == 8) {
                i = false;
            }
            if (x == 1 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 2 & y == 0) {
                i = false;
            }
            if (x == 2 & y == 1) {
                i = true;
                text.setText("2");
            }
            if (x == 2 & y == 2) {
                i = true;
                text.setText("1");
            }
            if (x == 2 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 2 & y == 7) {
                i = true;
                text.setText("1");
            }
            if (x == 2 & y == 8) {
                i = true;
                text.setText("1");
            }
            if (x == 2 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 3 & y == 0) {
                i = true;
                text.setText("1");
            }
            if (x == 3 & y == 1) {
                i = true;
                text.setText("2");
            }
            if (x == 3 & y == 2) {
                i = true;
                text.setText("1");
            }
            if (x == 3 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 3 & y == 8) {
                i = true;
                text.setText("1");
            }
            if (x == 3 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 1) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 2) {
                i = false;
            }
            if (x == 4 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 5) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 6) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 8) {
                i = true;
                text.setText("1");
            }
            if (x == 4 & y == 9) {
                i = false;
            }
            if (x == 5 & y == 0) {
                i = true;
                text.setText("1");
            }
            if (x == 5 & y == 1) {
                i = true;
                text.setText("2");
            }
            if (x == 5 & y == 2) {
                i = true;
                text.setText("2");
            }
            if (x == 5 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 5 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 5 & y == 5) {
                i = true;
                text.setText("1");
            }
            if (x == 5 & y == 5) {
                i = false;
            }
            if (x == 5 & y == 6) {
                i = true;
                text.setText("2");
            }
            if (x == 5 & y == 7) {
                i = true;
                text.setText("1");
            }
            if (x == 5 & y == 8) {
                i = true;
                text.setText("2");
            }
            if (x == 5 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 6 & y == 0) {
                i = true;
                text.setText("1");
            }
            if (x == 6 & y == 1) {
                i = false;
            }
            if (x == 6 & y == 2) {
                i = true;
                text.setText("1");
            }
            if (x == 6 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 6 & y == 5) {
                i = true;
                text.setText("2");
            }
            if (x == 6 & y == 6) {
                i = true;
                text.setText("3");
            }
            if (x == 6 & y == 7) {
                i = false;
            }
            if (x == 6 & y == 8) {
                i = true;
                text.setText("2");
            }
            if (x == 6 & y == 9) {
                i = true;
                text.setText("1");
            }
            if (x == 7 & y == 0) {
                i = true;
                text.setText("1");
            }
            if (x == 7 & y == 1) {
                i = true;
                text.setText("2");
            }
            if (x == 7 & y == 2) {
                i = true;
                text.setText("2");
            }
            if (x == 7 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 7 & y == 4) {
                i = true;
                text.setText("1");
            }
            if (x == 7 & y == 5) {
                i = true;
                text.setText("1");
            }
            if (x == 7 & y == 6) {
                i = false;
            }
            if (x == 7 & y == 7) {
                i = true;
                text.setText("2");
            }
            if (x == 7 & y == 8) {
                i = true;
                text.setText("2");
            }
            if (x == 7 & y == 9) {
                i = false;
            }
            if (x == 8 & y == 1) {
                i = true;
                text.setText("1");
            }

            if (x == 8 & y == 2) {
                i = false;
            }
            if (x == 8 & y == 3) {
                i = true;
                text.setText("1");
            }

            if (x == 8 & y == 5) {
                i = true;
                text.setText("2");
            }
            if (x == 8 & y == 6) {
                i = true;
                text.setText("2");
            }
            if (x == 8 & y == 7) {
                i = true;
                text.setText("2");
            }
            if (x == 8 & y == 8) {
                i = true;
                text.setText("2");
            }
            if (x == 8 & y == 9) {
                i = true;
                text.setText("2");
            }
            if (x == 9 & y == 1) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 2) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 3) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 5) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 6) {
                i = false;
            }
            if (x == 9 & y == 7) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 8) {
                i = true;
                text.setText("1");
            }
            if (x == 9 & y == 9) {
                i = false;
            }

            border = new Rectangle(30, 30);
            border.setFill(BLUE);
            text.setVisible(false);
            border.setStroke(RED);


            getChildren().addAll(border, text);

            setTranslateX(x * 30);
            setTranslateY(y * 30);

            setOnMouseClicked(e -> {
                try {
                    otevrit(new Stage());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            });
            setOnMouseReleased(e -> border.setFill(RED));
        }


        public void otevrit(Stage stage) throws IOException {

            if (i) {
                text.setVisible(true);
                border.setFill(null);
            }

            if (!i) {

                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                getScene().setRoot(createContent());


            }
        }

    }


    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(createContent());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}