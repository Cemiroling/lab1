package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class Controller {

    private View view = new View();
    private Model model = new Model();

    EventHandler<ActionEvent> MeterEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.MeterToInch(view, view.getMeter());
        }
    };

    EventHandler<ActionEvent> InchEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.InchToMeter(view, view.getInch());
        }
    };

    EventHandler<ActionEvent> ClearEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            view.TextClear();
        }
    };

    public Controller() {
        view.setMeterEvent(MeterEvent);
        view.setInchEvent(InchEvent);
        view.setClearEvent(ClearEvent);
    }

    public void setGridPane(GridPane grid) {
        view.setGrid(grid);
    }
}