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
class CalculatorTest {
    int firstOperand = 8;
    int secondOperand = 2;
    ExpressionDTO addition = new ExpressionDTO(firstOperand, secondOperand, "+", TypeOfExpression.ARABIC);
    ExpressionDTO subtraction = new ExpressionDTO(firstOperand, secondOperand, "-", TypeOfExpression.ARABIC);
    ExpressionDTO multiplication = new ExpressionDTO(firstOperand, secondOperand, "*", TypeOfExpression.ARABIC);
    ExpressionDTO division = new ExpressionDTO(firstOperand, secondOperand, "/", TypeOfExpression.ARABIC);

    @Test
    void calcAddition() throws Exception{
        Assertions.assertEquals("10", Calculator.calc(addition));
    }

    @Test
    void calcSubtraction() throws Exception{
        Assertions.assertEquals("6", Calculator.calc(subtraction));
    }

    @Test
    void calcMultiplication() throws Exception{
        Assertions.assertEquals("16", Calculator.calc(multiplication));
    }

    @Test
    void calcDivision() throws Exception{
        Assertions.assertEquals("4", Calculator.calc(division));
    }
}