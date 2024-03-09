import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook g1, g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(100);
		g1.addScore(97.6);
		g1.addScore(78.9);
		
		g2.addScore(66);
		g2.addScore(87.2);
		g2.addScore(79.8);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		g1.addScore(11.9);
		g2.addScore(92.5);
		g2.addScore(89.3);
		assertTrue(g1.toString().equals("100.0, 97.6, 78.9, 11.9, 0.0."));
		assertTrue(g2.toString().equals("66.0, 87.2, 79.8, 92.5, 89.3."));
		assertEquals(g1.getScoreSize(), 4);
		assertEquals(g2.getScoreSize(), 5);
	}

	@Test
	void testSum() {
		assertEquals(g1.sum(), 276.5);
		assertEquals(g2.sum(), 233.0);
	}

	@Test
	void testMinimum() {
		double min1 = 78.9;
		double min2 = 66;
		
		assertEquals(g1.minimum(), min1);
		assertEquals(g2.minimum(), min2);
	}

	@Test
	void testFinalScore() {
		double final1 = 197.6;
		double final2 = 167;
		 assertEquals(g1.finalScore(), final1);
		 assertEquals(g2.finalScore(), final2);
	}

	

}
