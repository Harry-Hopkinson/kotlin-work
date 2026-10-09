// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Use `` to write the tests name.
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    // Or write the test as a function.
    @Test
    fun markOf75GivesDistinction() {
        assertEquals("Distinction", grade(75))
    }

    @Test
    fun `Mark of 15 gives a fail`() {
        val mark = 15;                 // Arrange  (Setup the code to test)
        val result = grade(mark);      // Act      (Perform the action you want to test)
        assertEquals("Fail", result);  // Assert   (Check if the result matches expectation)
    }

    @Test
    fun `Test with negative input`() {
        val mark = -5;
        val result = grade(mark);
        assertEquals("?", result);
    }
}
