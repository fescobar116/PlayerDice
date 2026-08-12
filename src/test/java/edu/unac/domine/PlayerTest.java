package edu.unac.domine;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PlayerTest {
    @Test
    void playerWins() {
        Dice diceMock = Mockito.mock(Dice.class);
        Mockito.when(diceMock.roll()).thenReturn(5);

        Player player = new Player(4, diceMock);

        assertTrue(player.play());
    }

    @Test
    void playerLoses(){
        Dice diceMock = Mockito.mock(Dice.class);
        Mockito.when(diceMock.roll()).thenReturn(2);

        Player player = new Player(4, diceMock);

        assertFalse(player.play());
    }
}