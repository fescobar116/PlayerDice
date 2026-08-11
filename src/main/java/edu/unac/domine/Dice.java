package edu.unac.domine;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@AllArgsConstructor
@Data
public class Dice {
    private int sides;

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
