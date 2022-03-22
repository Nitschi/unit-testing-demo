package com.github.cleancoders.mockito;

class NumberPrinter {

    private final Calculator calculator;
    private final Printer printer;

    public NumberPrinter(Calculator calculator, Printer printer) {
        this.calculator = calculator;
        this.printer = printer;
    }

    public void printNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            printer.print(calculator.calculate(i));
        }
    }
}
