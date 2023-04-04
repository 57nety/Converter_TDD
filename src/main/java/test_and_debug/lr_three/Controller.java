package test_and_debug.lr_three;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ComboBox<String> cmbBoxLenFrom;
    @FXML
    private ComboBox<String> cmbBoxLenTo;
    @FXML
    private ComboBox<String> cmbBoxMassFrom;
    @FXML
    private ComboBox<String> cmbBoxMassTo;
    @FXML
    private ComboBox<String> cmbBoxValueFrom;
    @FXML
    private ComboBox<String> cmbBoxValueTo;

    @FXML
    private TextField lengthFrom;
    @FXML
    private TextField massFrom;
    @FXML
    private TextField valueFrom;

    @FXML
    private TextField lengthTo;
    @FXML
    private TextField massTo;
    @FXML
    private TextField valueTo;

    public void clickBtnLength() {
        double lengthIn = Double.parseDouble(lengthFrom.getText());

        double lengthSI = switch (cmbBoxLenFrom.getValue()) {
            case "межевая верста" -> Converter.OldRusSystem.Length.getFromMejevayaVerstaToSI(lengthIn);
            case "маховая сажень" -> Converter.OldRusSystem.Length.getFromMahovayaSajenToSI(lengthIn);
            case "аршин" -> Converter.OldRusSystem.Length.getFromArshinToSI(lengthIn);
            case "миля" -> Converter.UsaSystem.Length.getFromMilyaToSI(lengthIn);
            case "ярд" -> Converter.UsaSystem.Length.getFromYardToSI(lengthIn);
            case "фут" -> Converter.UsaSystem.Length.getFromFutToSI(lengthIn);
            case "си" -> lengthIn;
        };

        double lengthOut = switch (cmbBoxLenTo.getValue()){
            case "межевая верста" -> Converter.OldRusSystem.Length.getFromSIToMejevayaVersta(lengthSI);
            case "маховая сажень" -> Converter.OldRusSystem.Length.getFromSIToMahovayaSajen(lengthSI);
            case "аршин" -> Converter.OldRusSystem.Length.getFromSIToArshin(lengthSI);
            case "миля" -> Converter.UsaSystem.Length.getFromSIToMilya(lengthSI);
            case "ярд" -> Converter.UsaSystem.Length.getFromSIToYard(lengthSI);
            case "фут" -> Converter.UsaSystem.Length.getFromSIToFut(lengthSI);
            case "си" -> lengthSI;
        };

        lengthTo.setText(Double.toString(lengthOut));
    }

    public void clickBtnMass() {

    }

    public void clickBtnValue() {

    }

    @Override
    public void initialize(URL var1, ResourceBundle var2) {
        ObservableList<String> observableList;

        observableList = FXCollections.observableArrayList(
                "межевая верста", "маховая сажень", "аршин",
                "миля", "ярд", "фут",
                "си"
        );
        cmbBoxLenFrom.setItems(observableList);
        cmbBoxLenTo.setItems(observableList);

        observableList = FXCollections.observableArrayList(
                "берковец", "золотник", "доля",
                "короткая тонная", "фунт", "унция",
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
