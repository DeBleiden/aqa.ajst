package net.absoft.mortalwombat;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        assertTrue(ageChecker.canPlayGame(22), "Allowed.");
    }

    @Test
    public void testThatTooYongUsersCanNotPlay() {
        AgeChecker ageChecker = new AgeChecker();
        assertFalse(ageChecker.canPlayGame(18), "Not allowed.");
    }
}
