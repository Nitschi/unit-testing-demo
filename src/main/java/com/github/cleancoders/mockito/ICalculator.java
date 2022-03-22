package com.github.cleancoders.mockito;

import java.util.concurrent.TimeoutException;

interface ICalculator {
    String calculate(int number) throws TimeoutException;
}
