package com.github.cleancoders.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.concurrent.TimeoutException;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NumberPrinterFunctionalTests {

    @Test
    public void testNumberPrinterWithCalculator() throws TimeoutException {
        ICalculator calculatorSpy = spy(new Calculator());
        IPrinter printerMock = mock(IPrinter.class);

        NumberPrinter numberPrinter = new NumberPrinter(calculatorSpy, printerMock);
        numberPrinter.printNumbers(2);

        verify(printerMock).print("1");
        verify(printerMock).print("2");
        verify(calculatorSpy, times(2)).calculate(anyInt());
    }
}