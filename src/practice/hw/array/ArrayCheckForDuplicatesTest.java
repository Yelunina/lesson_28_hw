package practice.hw.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCheckForDuplicatesTest {
    ArrayCheckForDuplicates arrayCheckForDuplicates;

    @BeforeEach
    void setUp() {
        arrayCheckForDuplicates = new ArrayCheckForDuplicates();
    }

    @Test
    void checkForDuplicates() {
        int[] arr = {10,20,10,40};
        assertEquals(true,ArrayCheckForDuplicates.checkForDuplicates(arr));
    }
}