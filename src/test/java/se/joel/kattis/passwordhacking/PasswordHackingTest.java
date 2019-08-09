package se.joel.kattis.passwordhacking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class PasswordHackingTest {

    private PasswordHacking passwordHacking = new PasswordHacking();

    @Test
    void input1() {
        // given
        var passwordProbabilities = List.of(0.6666f, 0.3334f);

        // when
        var probability = passwordHacking.calculate(passwordProbabilities);

        // then
        assertThat(probability, is(1.3334f));
    }

    @Test
    void input2() {
        // given
        var passwordProbabilities = List.of(
            0.5432f,
            0.3334f,
            0.1234f
        );

        // when
        var probability = passwordHacking.calculate(passwordProbabilities);

        // then
        assertThat(probability, is(1.5802f));
    }

    @Test
    void input3() {
        // given
        var passwordProbabilities = List.of(
            0.3334f,
            0.5432f,
            0.1234f
        );

        // when
        var probability = passwordHacking.calculate(passwordProbabilities);

        // then
        assertThat(probability, is(1.5802f));
    }

    @Test
    void input4() {
        // given
        var passwordProbabilities = List.of(
            1.000f
        );

        // when
        var probability = passwordHacking.calculate(passwordProbabilities);

        // then
        assertThat(probability, is(1.000f));
    }
}