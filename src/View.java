package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class View {
    private Label lbl1 = new Label("Метры");
    private Label lbl2 = new Label("Дюймы");
    private TextField text1 = new TextField();
    private TextField text2 = new TextField();
    private Button btn1 = new Button("Метры в дюймы");
    private Button btn2 = new Button("Дюймы в метры");
    private Button btn3 = new Button("Очистить");

    public void setGrid(GridPane grid){
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));

        GridPane.setHalignment(lbl1, HPos.LEFT);
        grid.add(lbl1, 0,0);
        GridPane.setHalignment(lbl2, HPos.LEFT);
        grid.add(lbl2, 2,0);
        GridPane.setHalignment(text1, HPos.CENTER);
        grid.add(text1, 0,1, 2,1);
        GridPane.setHalignment(text2, HPos.CENTER);
        grid.add(text2, 2,1,2,1);
        GridPane.setHalignment(btn1, HPos.CENTER);
        grid.add(btn1, 0,2);
        GridPane.setHalignment(btn3, HPos.CENTER);
        grid.add(btn3, 1,2,2,1);
        GridPane.setHalignment(btn2, HPos.CENTER);
        grid.add(btn2, 3,2);
    }

    public String getMeter() {
        return text1.getText();
    }

    public String getInch() {
        return text2.getText();
    }

    public void setMeter(String metertext) {
        text1.setText(metertext);
    }

    public void setInch(String inchtext) {
        text2.setText(inchtext);
    }

    public void MeterErr(){
        TextClear();
        text2.setPromptText("-");
        text1.setPromptText("Вводите цифры!");
    }

    public void InchErr(){
        TextClear();
        text1.setPromptText("-");
        text2.setPromptText("Вводите цифры!");
    }

    public void TextClear (){
        text1.clear();
        text2.clear();
        text1.setPromptText("");
        text2.setPromptText("");
    }

    public void setMeterEvent (EventHandler<ActionEvent> handle){
        btn1.setOnAction(handle);
    }

    public void setInchEvent (EventHandler<ActionEvent> handle){
        btn2.setOnAction(handle);
    }

    public void setClearEvent (EventHandler<ActionEvent> handle){
        btn3.setOnAction(handle);
    }
}


