package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package calculator
 * Created at 09.01.2021
 *
 * @author Gubankov D.L.
 */
class ConverterTest {

    @Test
    void arabicToRoman() {
        Assertions.assertEquals("XLIX", Converter.arabicToRoman(49));
    }
}