package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldReturnHello()
    {
        assertEquals("Hello", App.hello());
    }
}
