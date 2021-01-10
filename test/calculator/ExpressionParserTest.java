package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package calculator
 * Created at 09.01.2021
 *
 * @author Gubankov D.L.
 */
class ExpressionParserTest {
    int firstOperand = 8;
    int secondOperand = 2;
    String[] operators = new String[]{"+", "-", "*", "/"};

    @Test
    void parseArabic() throws Exception {
        for (String op : operators){
            ExpressionDTO expect = new ExpressionDTO(firstOperand, secondOperand, op, TypeOfExpression.ARABIC);
            Assertions.assertEquals(expect, ExpressionParser.parse("8 " + op + " 2"));
        }
    }

    @Test
    void parseRoman() throws Exception {
        for (String op : operators){
            ExpressionDTO expect = new ExpressionDTO(firstOperand, secondOperand, op, TypeOfExpression.ROMAN);
            Assertions.assertEquals(expect, ExpressionParser.parse("VIII " + op + " II"));
        }
    }

}