package com.benben;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void should_get_not_operation() {
        // given
        Chance chance = new Chance(0.3);

        // when
        Chance result = chance.not();

        // then
        assertEquals(result, new Chance(0.7));
    }

    @Test
    public void should_get_and_operation() {
        // given
        Chance chanceA = new Chance(0.3);
        Chance chanceB = new Chance(0.3);

        // when
        Chance result = chanceA.and(chanceB);

        // then
        assertEquals(result, new Chance(0.9));
    }

    @Test
    public void should_get_or_operation() {
        // given
        Chance chanceA = new Chance(0.3);
        Chance chanceB = new Chance(0.3);

        // when
        Chance result = chanceA.or(chanceB);

        // then
        assertEquals(result, new Chance(0.42));
    }
}