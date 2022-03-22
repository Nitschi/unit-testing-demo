package com.github.cleancoders.mockito;

class ConsolePrinter implements IPrinter {
    @Override
    public void print(String s) {
        try {
            // Simulate slow access to IO
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {

        }
        System.out.println(s);
    }
}
