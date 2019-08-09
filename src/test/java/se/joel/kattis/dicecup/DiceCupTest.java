package se.joel.kattis.dicecup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class DiceCupTest {

    private DiceCup diceCup;

    @BeforeEach
    void setUp() {
        diceCup = new DiceCup();
    }

    @Test
    void input1() {
        // given
        String input = "6 6";

        // when
        List<Integer> calculate = diceCup.calculate(input);

        // then
        assertThat(calculate, contains(7));
    }

    @Test
    void input2() {
        // given
        String input = "6 4";

        // when
        List<Integer> calculate = diceCup.calculate(input);

        // then
        assertThat(calculate, contains(
            5,
            6,
            7
        ));
    }

    @Test
    void input3() {
        // given
        String input = "12 20";

        // when
        List<Integer> calculate = diceCup.calculate(input);

        // then
        assertThat(calculate, contains(
            13,
            14,
            15,
            16,
            17,
            18,
            19,
            20,
            21
        ));
    }
}