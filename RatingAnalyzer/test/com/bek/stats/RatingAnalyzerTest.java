package com.bek.stats;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RatingAnalyzerTest {
    RatingAnalyzer analyzer;

    @Before
    public void setUp() {
        int[] ratings = {3, 1, 4, 4, 1, 3, 3, 1, 3, 4, 3, 5, 5, 4, 3, 3};
        analyzer = new RatingAnalyzer(ratings);
    }

    @Test
    public void mean() {
        assertEquals(3.125, analyzer.mean(), .001);
    }

    @Test
    public void medianOddNumbers() {
        int[] ratings = {6, 4, 3, 12, 9};
        analyzer = new RatingAnalyzer(ratings);
        assertEquals(6.0, analyzer.median(), .001);
    }

    @Test
    public void medianEvenNumbers() {
        assertEquals(3.0, analyzer.median(), .001);
    }

    @Test
    public void mode() {
    }
}