package test_and_debug.lr_three;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private ComboBox<String> cmbBoxLenFrom;
    private ComboBox<String> cmbBoxLenTo;
    private ComboBox<String> cmbBoxMassFrom;
    private ComboBox<String> cmbBoxMassTo;
    private ComboBox<String> cmbBoxValueFrom;
    private ComboBox<String> cmbBoxValueTo;

    private TextField lengthFrom;
    private TextField massFrom;
    private TextField valueFrom;

    public void clickBtnLength() {

    }

    public void clickBtnMass() {

    }

    public void clickBtnValue() {

    }

    @Override
    public void initialize(URL var1, ResourceBundle var2) {
        ObservableList<String> observableList;

        observableList = FXCollections.observableArrayList(
                "межевая верста","маховая сажень","аршин",
                "миля","ярд","фут",
                "си"
        );
        cmbBoxLenFrom.setItems(observableList);
        cmbBoxLenTo.setItems(observableList);

        observableList = FXCollections.observableArrayList(
                "берковец","золотник","доля",
                "короткая тонная","фунт","унция",
                "си"
        );
        cmbBoxMassFrom.setItems(observableList);
        cmbBoxMassTo.setItems(observableList);

        observableList = FXCollections.observableArrayList(
                "штоф", "чарка", "шкалик",
                "баррель", "галлон", "пинта",
                "си"
        );
        cmbBoxValueFrom.setItems(observableList);
        cmbBoxValueTo.setItems(observableList);
    }

}
