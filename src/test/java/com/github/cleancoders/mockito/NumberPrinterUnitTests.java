package com.github.cleancoders.mockito;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.concurrent.TimeoutException;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NumberPrinterUnitTests {

    @Test
    public void testPrinterInvokedRightTimes() throws TimeoutException {
        ICalculator calculatorStubResponder = mock(ICalculator.class);
        when(calculatorStubResponder.calculate(anyInt())).thenReturn("1");
        IPrinter printerMock = mock(IPrinter.class);

        NumberPrinter numberPrinter = new NumberPrinter(calculatorStubResponder, printerMock);
        numberPrinter.printNumbers(2);

        verify(printerMock, times(2)).print("1");
    }

    @Test
    public void testCalculatorTimeoutExceptionIsCaught() throws TimeoutException {
        ICalculator calculatorStubSaboteur = mock(ICalculator.class);
        when(calculatorStubSaboteur.calculate(anyInt())).thenThrow(new TimeoutException());
        IPrinter printerMock = mock(IPrinter.class);

        NumberPrinter numberPrinter = new NumberPrinter(calculatorStubSaboteur, printerMock);
        Assertions.assertDoesNotThrow(() -> numberPrinter.printNumbers(2), "Number printer did not handle Exception");

        verify(printerMock, times(2)).print("Calculator timed out");
    }
}