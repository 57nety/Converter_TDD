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
    public void oldRusSystemHaveValueAsInnerClassTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem$Value");
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