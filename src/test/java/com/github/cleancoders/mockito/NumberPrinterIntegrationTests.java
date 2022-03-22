package com.github.cleancoders.mockito;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.concurrent.TimeoutException;

@RunWith(MockitoJUnitRunner.class)
public class NumberPrinterIntegrationTests {

    @Test
    public void testNumberPrinterProductive() throws TimeoutException {
        ICalculator realCalculator = new Calculator();
        IPrinter realPrinter = new ConsolePrinter();

        NumberPrinter numberPrinter = new NumberPrinter(realCalculator, realPrinter);
        numberPrinter.printNumbers(2);

        Assertions.assertDoesNotThrow(()-> numberPrinter.printNumbers(2));
    }

    @Test
    public void testNumberPrinterFakePrinter() throws TimeoutException {
        ICalculator realCalculator = new Calculator();
        IPrinter printerFake = new PrinterFake();

        NumberPrinter numberPrinter = new NumberPrinter(realCalculator, printerFake);
        numberPrinter.printNumbers(2);

        Assertions.assertDoesNotThrow(()-> numberPrinter.printNumbers(2));
    }
}

class PrinterFake implements IPrinter{

    @Override
    public void print(String s) {
        // Do nothing
    }
}