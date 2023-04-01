package test_and_debug.lr_three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void converterClassCreationTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter");
    }

    @Test
    public void converterHaveOldRusSystemAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem");
    }

    @Test
    public void oldRusSystemHaveLengthAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Length");
    }

    @Test
    public void converterOldRusSystemLengthFromOneMejevayaVerstaToMeter() {
        Assertions.assertEquals(2134.0, Converter.OldRusSystem.Length.getFromMejevayaVerstaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMeterToMejevayaVersta() {
        Assertions.assertEquals(1.0 / 2134.0, Converter.OldRusSystem.Length.getFromSIToMejevayaVersta(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMahovayaSajenToMeter() {
        Assertions.assertEquals(1.76, Converter.OldRusSystem.Length.getFromMahovayaSajenToSI(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMeterToMahovayaSajen() {
        Assertions.assertEquals(1.0 / 1.76, Converter.OldRusSystem.Length.getFromSIToMahovayaSajen(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneArshinToMeter() {
        Assertions.assertEquals(0.7112, Converter.OldRusSystem.Length.getFromArshinToSI(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMeterToArshin() {
        Assertions.assertEquals(1.0 / 0.7112, Converter.OldRusSystem.Length.getFromSIToArshin(1.0));
    }

    @Test
    public void oldRusSystemHaveMassAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Mass");
    }

    @Test
    public void converterOldRusSystemMassFromOneBerkovecToKilogram() {
        Assertions.assertEquals(163.8, Converter.OldRusSystem.Mass.getFromBerkovecToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToBerkovec() {
        Assertions.assertEquals(1.0 / 163.8, Converter.OldRusSystem.Mass.getFromSiToBerkovec(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneZolotnikToKilogram() {
        Assertions.assertEquals(0.004266, Converter.OldRusSystem.Mass.getFromZolotnikToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToZolotnik() {
        Assertions.assertEquals(1.0 / 0.004266, Converter.OldRusSystem.Mass.getFromSIToZolotnik(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneDolyaToKilogram() {
        Assertions.assertEquals(0.00004443, Converter.OldRusSystem.Mass.getFromDolyaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToDolya() {
        Assertions.assertEquals(1.0 / 0.00004443, Converter.OldRusSystem.Mass.getFromSIToDolya(1.0));
    }

    @Test
    public void oldRusSystemHaveValueAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Value");
    }

    @Test
    public void converterOldRusSystemValueFromOneShtofToCubicMeter() {
        Assertions.assertEquals(0.00123, Converter.OldRusSystem.Value.getFromShtofToSI(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCubicMeterToShtof() {
        Assertions.assertEquals(1 / 0.00123, Converter.OldRusSystem.Value.getFromSIToShtof(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCharkaToCubicMeter() {
        Assertions.assertEquals(0.000123, Converter.OldRusSystem.Value.getFromCharkaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCubicMeterToCharka() {
        Assertions.assertEquals(1.0 / 0.000123, Converter.OldRusSystem.Value.getFromSIToCharka(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneShkalikToCubicMeter() {
        Assertions.assertEquals(0.0000615, Converter.OldRusSystem.Value.getFromShkalikToSI(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCubicMeterToShkalik() {
        Assertions.assertEquals(1.0 / 0.0000615, Converter.OldRusSystem.Value.getFromSIToShkalik(1.0));
    }

    @Test
    public void converterHaveUsaSystemAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem");
    }

    @Test
    public void usaSystemHaveLengthAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Length");
    }

    @Test
    public void converterUsaSystemLengthFromOneMilyaToMeter() {
        Assertions.assertEquals(1609.0, Converter.UsaSystem.Length.getFromMilyaToSI(1.0));
    }

    @Test
    public void converterUsaSystemLengthFromOneMeterToMilya() {
        Assertions.assertEquals(1.0 / 1609.0, Converter.UsaSystem.Length.getFromSIToMilya(1.0));
    }

    @Test
    public void converterUsaSystemLengthFromOneYardToMilya() {
        Assertions.assertEquals(0.9144, Converter.UsaSystem.Length.getFromYardToSI(1.0));
    }

    @Test
    public void converterUsaSystemLengthFromOneMilyaToYard() {
        Assertions.assertEquals(1.0 / 0.9144, Converter.UsaSystem.Length.getFromSIToYard(1.0));
    }

    @Test
    public void converterUsaSystemLengthFromOneFutToMilya() {
        Assertions.assertEquals(0.3048, Converter.UsaSystem.Length.getFromFutToSI(1.0));
    }

    @Test
    public void converterUsaSystemLengthFromOneMilyaToFut() {
        Assertions.assertEquals(1.0 / 0.3048, Converter.UsaSystem.Length.getFromSIToFut(1.0));
    }

    @Test
    public void usaSystemHaveMassAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Mass");
    }

    @Test
    public void converterUsaSystemMassFromOneKorotkayaTonnaToKilogram() {
        Assertions.assertEquals(907.2, Converter.UsaSystem.Mass.getFromKorotkayaTonnaToSI(1.0));
    }

    @Test
    public void converterUsaSystemMassFromOneKilogramToKorotkayaTonna() {
        Assertions.assertEquals(1.0 / 907.2, Converter.UsaSystem.Mass.getFromSIToKorotkayaTonna(1.0));
    }

    @Test
    public void converterUsaSystemMassFromOneFuntToKilogram() {
        Assertions.assertEquals(0.4536, Converter.UsaSystem.Mass.getFromFuntToSI(1.0));
    }

    @Test
    public void converterUsaSystemMassFromOneKilogramToFunt() {
        Assertions.assertEquals(1.0 / 0.4536, Converter.UsaSystem.Mass.getFromSIToFunt(1.0));
    }

    @Test
    public void converterUsaSystemMassFromOneUnciyaToKilogram() {
        Assertions.assertEquals(0.02835, Converter.UsaSystem.Mass.getFromUnciyaToSI(1.0));
    }

    @Test
    public void converterUsaSystemMassFromOneKilogramToUnciya() {
        Assertions.assertEquals(1.0 / 0.02835, Converter.UsaSystem.Mass.getFromSIToUnciya(1.0));
    }

    @Test
    public void usaSystemHaveValueAsInnerClassTest() throws ClassNotFoundException {
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Value");
    }

    @Test
    public void converterUsaSystemValueFromOneBarrelToCubicMeter() {
        Assertions.assertEquals(0.159, Converter.UsaSystem.Value.getFromBarrelToSI(1.0));
    }

    @Test
    public void converterUsaSystemValueFromOneCubicMeterToBarrel() {
        Assertions.assertEquals(1.0 / 0.159, Converter.UsaSystem.Value.getFromSIToBarrel(1.0));
    }

    @Test
    public void converterUsaSystemValueFromOneGalonToCubicMeter() {
        Assertions.assertEquals(0.003785, Converter.UsaSystem.Value.getFromGalonToSI(1.0));
    }

}