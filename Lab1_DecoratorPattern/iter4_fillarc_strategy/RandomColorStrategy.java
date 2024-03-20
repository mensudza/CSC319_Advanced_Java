package iter4_fillarc_strategy;

import java.awt.*;
import java.util.Random;

public class RandomColorStrategy extends ColorStrategy{
    private final Color[] COLORS = {
            Color.BLACK,
            Color.GREEN,
            Color.MAGENTA,
            Color.PINK,
            Color.YELLOW,
            Color.ORANGE,
            Color.BLUE,
    };

    private Random rand;

    public RandomColorStrategy(){
        rand = new Random();
        colors[0] = COLORS[rand.nextInt(COLORS.length)];
        colors[1] = COLORS[rand.nextInt(COLORS.length)];
        colors[2] = COLORS[rand.nextInt(COLORS.length)];
        colors[3] = COLORS[rand.nextInt(COLORS.length)];
    }
}
