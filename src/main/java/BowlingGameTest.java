import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class BowlingGameTest {
	
	private BowlingGame g = new BowlingGame();
	

	void rollMany(int rolls, int pins) {
		for (int i = 0; i < rolls; i++) {
			g.roll(pins);
		}
	}

	@Test
	public void testZero() {
		rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	@Test
	public void testAllOnes() {
		rollMany(20, 1);
		assertEquals(20, g.score());
	}

	@Test
	public void testOneSpare() {
		g.roll(5);
		g.roll(5);
		g.roll(3);
		rollMany(17, 0);
		assertEquals(16, g.score());
	}
	
	@Test
	public void testOneStrike() {
		g.roll(10);
		g.roll(3);
		g.roll(4);
		rollMany(16, 0);
		assertEquals(24, g.score());
	}
	
	@Test 
	public void testTwoStrike() {
		g.roll(10);
		g.roll(10);
		g.roll(3);
		g.roll(4);
		rollMany(15, 0); 
		assertEquals(47, g.score());
	}
	
	@Test
	public void testPerfectGame() {
		rollMany(12, 10);
		assertEquals(300, g.score());
	}
    

}
