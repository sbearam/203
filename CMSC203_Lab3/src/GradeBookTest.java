/** @author Shawn Bearam */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest 
{
    private GradeBook g1;
    private GradeBook g2;

    @BeforeEach
    void setUp() throws Exception 
    {
        g1  = new GradeBook(5);
        g1.addScore(90);
        g1.addScore(85);
        g2 = new GradeBook(5);
        g2.addScore(70);
        g2.addScore(65);
    }

    @AfterEach
    void tearDown() throws Exception 
    {
        g1 = null;
        g2 = null;
    }
    
    @Test
    void addScoreTest()
    {
        assertTrue(g1.toString().equals("90.0 85.0 "));
        assertEquals(2, g1.getScoreSize());
        assertTrue(g2.toString().equals("70.0 65.0 "));
        assertEquals(2, g2.getScoreSize());
    }
    
    @Test
    void testMinimum()
    {
        assertEquals(85, g1.minimum());
        assertEquals(65, g2.minimum());
    }
    
    @Test
    void testSum()
    {
        assertEquals(175, g1.sum());
        assertEquals(135, g2.sum());
    }
    
    @Test
    void finalScoreTest()
    {
        assertEquals(90, g1.finalScore());
        assertEquals(70, g2.finalScore());
    }

}