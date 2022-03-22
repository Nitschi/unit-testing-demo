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
        // Hint: Verify the Calculator and printer is called the correct number of times
        assert false;
    }
}