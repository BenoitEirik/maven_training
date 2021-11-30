package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {

    @Test
    void op_add() {
        int sum = Sample.op(Sample.Operation.ADD, 1, 2);
        Assertions.assertThat(sum).as("sum of 1 + 2").isEqualTo(3);
    }

    @Test
    void op_mult() {
        int mult = Sample.op(Sample.Operation.MULT, 1, 2);
        Assertions.assertThat(mult).as("sum of 1 + 2").isEqualTo(2);
    }

    @Test
    void fact() {
        int factorial = Sample.fact(10);
        Assertions.assertThat(factorial).as("factorial of 10").isEqualTo(3628800);
    }
}
