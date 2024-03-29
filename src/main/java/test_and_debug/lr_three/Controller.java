package test_and_debug.lr_three;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
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
        try {
            double lengthIn = Double.parseDouble(lengthFrom.getText());

            double lengthSI = switch (cmbBoxLenFrom.getValue()) {
                case "межевая верста" -> Converter.OldRusSystem.Length.getFromMejevayaVerstaToSI(lengthIn);
                case "маховая сажень" -> Converter.OldRusSystem.Length.getFromMahovayaSajenToSI(lengthIn);
                case "аршин" -> Converter.OldRusSystem.Length.getFromArshinToSI(lengthIn);
                case "миля" -> Converter.UsaSystem.Length.getFromMilyaToSI(lengthIn);
                case "ярд" -> Converter.UsaSystem.Length.getFromYardToSI(lengthIn);
                case "фут" -> Converter.UsaSystem.Length.getFromFutToSI(lengthIn);
                default -> lengthIn;
            };

            double lengthOut = switch (cmbBoxLenTo.getValue()) {
                case "межевая верста" -> Converter.OldRusSystem.Length.getFromSIToMejevayaVersta(lengthSI);
                case "маховая сажень" -> Converter.OldRusSystem.Length.getFromSIToMahovayaSajen(lengthSI);
                case "аршин" -> Converter.OldRusSystem.Length.getFromSIToArshin(lengthSI);
                case "миля" -> Converter.UsaSystem.Length.getFromSIToMilya(lengthSI);
                case "ярд" -> Converter.UsaSystem.Length.getFromSIToYard(lengthSI);
                case "фут" -> Converter.UsaSystem.Length.getFromSIToFut(lengthSI);
                default -> lengthSI;
            };

            lengthTo.setText(Double.toString(lengthOut));
        } catch (Exception e) {
            System.out.println("Что-то не так:\n- Не выбраны величины ковертации\n- Поле исходного значения не корректно");
        }
    }

    public void clickBtnMass() {
        try {
            double massIn = Double.parseDouble(massFrom.getText());

            double massSI = switch (cmbBoxMassFrom.getValue()) {
                case "берковец" -> Converter.OldRusSystem.Mass.getFromBerkovecToSI(massIn);
                case "золотник" -> Converter.OldRusSystem.Mass.getFromZolotnikToSI(massIn);
                case "доля" -> Converter.OldRusSystem.Mass.getFromDolyaToSI(massIn);
                case "короткая тонная" -> Converter.UsaSystem.Mass.getFromKorotkayaTonnaToSI(massIn);
                case "фунт" -> Converter.UsaSystem.Mass.getFromFuntToSI(massIn);
                case "унция" -> Converter.UsaSystem.Mass.getFromUnciyaToSI(massIn);
                default -> massIn;
            };

            double massOut = switch (cmbBoxMassTo.getValue()) {
                case "берковец" -> Converter.OldRusSystem.Mass.getFromSiToBerkovec(massSI);
                case "золотник" -> Converter.OldRusSystem.Mass.getFromSIToZolotnik(massSI);
                case "доля" -> Converter.OldRusSystem.Mass.getFromSIToDolya(massSI);
                case "короткая тонная" -> Converter.UsaSystem.Mass.getFromSIToKorotkayaTonna(massSI);
                case "фунт" -> Converter.UsaSystem.Mass.getFromSIToFunt(massSI);
                case "унция" -> Converter.UsaSystem.Mass.getFromSIToUnciya(massSI);
                default -> massSI;
            };

            massTo.setText(Double.toString(massOut));
        } catch (Exception e) {
            System.out.println("Что-то не так:\n- Не выбраны величины ковертации\n- Поле исходного значения не корректно");
        }
    }

    public void clickBtnValue() {
        try {
            double valueIn = Double.parseDouble(valueFrom.getText());

            double valueSI = switch (cmbBoxValueFrom.getValue()) {
                case "штоф" -> Converter.OldRusSystem.Value.getFromShtofToSI(valueIn);
                case "чарка" -> Converter.OldRusSystem.Value.getFromCharkaToSI(valueIn);
                case "шкалик" -> Converter.OldRusSystem.Value.getFromShkalikToSI(valueIn);
                case "баррель" -> Converter.UsaSystem.Value.getFromBarrelToSI(valueIn);
                case "галлон" -> Converter.UsaSystem.Value.getFromGalonToSI(valueIn);
                case "пинта" -> Converter.UsaSystem.Value.getFromPintaToSI(valueIn);
                default -> valueIn;
            };

            double valueOut = switch (cmbBoxValueTo.getValue()) {
                case "штоф" -> Converter.OldRusSystem.Value.getFromSIToShtof(valueSI);
                case "чарка" -> Converter.OldRusSystem.Value.getFromSIToCharka(valueSI);
                case "шкалик" -> Converter.OldRusSystem.Value.getFromSIToShkalik(valueSI);
                case "баррель" -> Converter.UsaSystem.Value.getFromSIToBarrel(valueSI);
                case "галлон" -> Converter.UsaSystem.Value.getFromSIToGalon(valueSI);
                case "пинта" -> Converter.UsaSystem.Value.getFromSIToPinta(valueSI);
                default -> valueSI;
            };

            valueTo.setText(Double.toString(valueOut));
        } catch (Exception e) {
            System.out.println("Что-то не так:\n- Не выбраны величины ковертации\n- Поле исходного значения не корректно");
        }
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
