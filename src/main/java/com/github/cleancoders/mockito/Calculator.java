package com.github.cleancoders.mockito;

import java.util.concurrent.TimeoutException;

class Calculator implements ICalculator {
    @Override
    public String calculate(int number) throws TimeoutException{
        return Integer.toString(number);
    }
}
