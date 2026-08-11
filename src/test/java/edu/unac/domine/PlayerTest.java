package edu.unac.domine;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    void playerWins() {
        Dice dice = new Dice(6);

        Player player = new Player(4, dice);

        assertTrue(player.play());
    }

    @Test
    void playerLoses(){
        Dice dice = new Dice(6);

        Player player = new Player(4, dice);

        assertFalse(player.play());
    }
}