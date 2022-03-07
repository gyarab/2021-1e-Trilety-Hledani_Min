package com.example.miny2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    static final int POLICKA = 30;
    static final int SIRKA = 600;
    static final int VYSKA = 300;

    private static final int X_POL = 20;
    private static final int Y_POL = 10;

    final Tile[][] grid = new Tile[X_POL][Y_POL];

    Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(SIRKA, VYSKA);

        for (int y = 0; y < Y_POL; y++) {
            for (int x = 0; x < X_POL; x++) {
                Tile tile = new Tile(x, y);

                grid[x][y] = tile;
                root.getChildren().add(tile);
            }
        }

        return root;
    }


    static class Tile extends StackPane {

        final Rectangle border = new Rectangle(POLICKA, POLICKA, Color.BLUE);

        public Tile(int x, int y) {

            border.setStroke(Color.RED);


            getChildren().addAll(border);

            setTranslateX(x * POLICKA);
            setTranslateY(y * POLICKA);

            setOnMouseClicked(e -> open());
        }

        public void open() {

            border.setFill(null);


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
