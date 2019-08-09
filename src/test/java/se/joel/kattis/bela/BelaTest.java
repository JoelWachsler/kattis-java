package se.joel.kattis.bela;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class BelaTest {

    private Bela bela = new Bela();

    @Test
    void input1() {
        // given
        List<String> input = List.of(
            "2 S",
            "TH",
            "9C",
            "KS",
            "QS",
            "JS",
            "TD",
            "AD",
            "JH"
        );

        // when
        int calculate = bela.calculate(input);

        // then
        assertThat(calculate, is(60));
    }

    @Test
    void input2() {
        // given
        List<String> input = List.of(
            "4 H",
            "AH",
            "KH",
            "QH",
            "JH",
            "TH",
            "9H",
            "8H",
            "7H",
            "AS",
            "KS",
            "QS",
            "JS",
            "TS",
            "9S",
            "8S",
            "7S"
        );

        // when
        int calculate = bela.calculate(input);

        // then
        assertThat(calculate, is(92));
    }
}