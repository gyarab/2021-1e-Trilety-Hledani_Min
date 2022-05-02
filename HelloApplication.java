package com.example.miny2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class HelloApplication extends Application {


    static final int sirka = 300;
    static final int vyska = 300;
    static final int radek = 10; //kolik poliček bude v radku
    static final int sloupec = 10;   //kolik bude ve sloupci


    static Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(sirka, vyska);
        int y;
        int x;
        for (y = 0; y < sloupec; y++) {
            for (x = 0; x < radek; x++) {
                Tile tile;
                tile = new Tile(x, y);

                root.getChildren().add(tile);


            }
        }

        return root;
    }

    static class Tile extends StackPane {
        private final Text text = new Text();
        boolean i = true;
        int policka = 30; //velikost políček
        final Rectangle border = new Rectangle(policka, policka);


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


            border.setFill(Color.BLUE);


            text.setVisible(false);


            border.setStroke(Color.RED);


            getChildren().addAll(border, text);

            setTranslateX(x * policka);
            setTranslateY(y * policka);

            setOnMouseClicked(e -> otevrit());
            setOnMouseReleased(e -> border.setFill(Color.RED));
        }


        public void otevrit() {

            if (i) {
                text.setVisible(true);
                border.setFill(null);
            }

            if (!i) {
                System.out.println("Prohra");
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
