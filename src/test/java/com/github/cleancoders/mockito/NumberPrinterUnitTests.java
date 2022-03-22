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
        // Hint: Only verify that the printer is invoked the correct number of times
        assert false;
    }

    @Test
    public void testCalculatorTimeoutExceptionIsCaught() throws TimeoutException {
        assert false;
    }
}