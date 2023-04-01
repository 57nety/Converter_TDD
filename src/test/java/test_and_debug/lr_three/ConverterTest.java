package test_and_debug.lr_three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void converterClassCreationTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter");
    }

    @Test
    public void converterHaveOldRusSystemAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem");
    }

    @Test
    public void oldRusSystemHaveLengthAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Length");
    }

    @Test
    public void converterOldRusSystemLengthFromOneMejevayaVerstaToMeter(){
        Assertions.assertEquals(2134.0,Converter.OldRusSystem.Length.getFromMejevayaVerstaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMeterToMejevayaVersta(){
        Assertions.assertEquals(1.0/2134.0,Converter.OldRusSystem.Length.getFromSIToMejevayaVersta(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMahovayaSajenToMeter(){
        Assertions.assertEquals(1.76,Converter.OldRusSystem.Length.getFromMahovayaSajenToSI(1.0));
    }

    @Test
    public void converterOldRusSystemLengthFromOneMeterToMahovayaSajen(){
        Assertions.assertEquals(1.0/1.76,Converter.OldRusSystem.Length.getFromSIToMahovayaSajen(1.0));
    }
    @Test
    public void converterOldRusSystemLengthFromOneArshinToMeter(){
        Assertions.assertEquals(0.7112,Converter.OldRusSystem.Length.getFromArshinToSI(1.0));
    }
    @Test
    public void converterOldRusSystemLengthFromOneMeterToArshin(){
        Assertions.assertEquals(1.0/0.7112,Converter.OldRusSystem.Length.getFromSIToArshin(1.0));
    }

    @Test
    public void oldRusSystemHaveMassAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Mass");
    }

    @Test
    public void converterOldRusSystemMassFromOneBerkovecToKilogram(){
        Assertions.assertEquals(163.8,Converter.OldRusSystem.Mass.getFromBerkovecToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToBerkovec(){
        Assertions.assertEquals(1.0/163.8,Converter.OldRusSystem.Mass.getFromSiToBerkovec(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneZolotnikToKilogram(){
        Assertions.assertEquals(0.004266,Converter.OldRusSystem.Mass.getFromZolotnikToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToZolotnik(){
        Assertions.assertEquals(1.0/0.004266,Converter.OldRusSystem.Mass.getFromSIToZolotnik(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneDolyaToKilogram(){
        Assertions.assertEquals(0.00004443,Converter.OldRusSystem.Mass.getFromDolyaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemMassFromOneKilogramToDolya(){
        Assertions.assertEquals(1.0/0.00004443,Converter.OldRusSystem.Mass.getFromSIToDolya(1.0));
    }

    @Test
    public void oldRusSystemHaveValueAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Value");
    }

    @Test
    public void converterOldRusSystemValueFromOneShtofToCubicMeter(){
        Assertions.assertEquals(0.00123,Converter.OldRusSystem.Value.getFromShtofToSI(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCubicMeterToShtof(){
        Assertions.assertEquals(1/0.00123,Converter.OldRusSystem.Value.getFromSIToShtof(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCharkaToCubicMeter(){
        Assertions.assertEquals(0.000123,Converter.OldRusSystem.Value.getFromCharkaToSI(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneCubicMeterToCharka(){
        Assertions.assertEquals(1.0/0.000123,Converter.OldRusSystem.Value.getFromSIToCharka(1.0));
    }

    @Test
    public void converterOldRusSystemValueFromOneShkalikToCubicMeter(){
        Assertions.assertEquals(0.0000615,Converter.OldRusSystem.Value.getFromShkalikToSI(1.0));
    }

    @Test
    public void converterHaveUsaSystemAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem");
    }

    @Test
    public void usaSystemHaveLengthAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Length");
    }
    
    @Test
    public void usaSystemHaveMassAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Mass");
    }

    @Test
    public void usaSystemHaveValueAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem$Value");
    }

}