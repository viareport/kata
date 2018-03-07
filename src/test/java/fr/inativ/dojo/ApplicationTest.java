package fr.inativ.dojo;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {
    Application toTest;

    @Before
    public void setUp() {
        toTest = new Application();
    }


    @Test
    public void add_should_return_sum() {
        assertThat(toTest.add(1, 2)).isEqualTo(3);
    }
}