package test_and_debug.lr_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void converterClassCreationTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter");
    }

    @Test
    public void oldRusSystemClassCreationTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$OldRusSystem");
    }

    @Test
    public void usaSystemClassCreationTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter$UsaSystem");
    }
}