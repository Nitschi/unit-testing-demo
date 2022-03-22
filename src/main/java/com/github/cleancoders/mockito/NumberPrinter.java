package com.github.cleancoders.mockito;

import java.util.concurrent.TimeoutException;

class NumberPrinter {

    private final ICalculator calculator;
    private final IPrinter printer;

    public NumberPrinter(ICalculator calculator, IPrinter printer) {
        this.calculator = calculator;
        this.printer = printer;
    }

    public void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            try {
                printer.print(calculator.calculate(i));
            } catch (TimeoutException e) {
                // Print an error
                printer.print("Calculator timed out");
            }
        }
    }
}
