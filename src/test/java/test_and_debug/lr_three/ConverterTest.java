package test_and_debug.lr_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void converterClassCreationTest() throws ClassNotFoundException{
        Class.forName("test_and_debug.lr_three.Converter");
    }
}