package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Controller controller = new Controller();

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("MeterIntoInch");
        stage.setWidth(355);
        stage.setHeight(155);
        GridPane root = new GridPane();
        controller.setGridPane(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
