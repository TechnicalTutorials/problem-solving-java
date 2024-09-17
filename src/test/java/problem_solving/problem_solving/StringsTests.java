package problem_solving.problem_solving;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.springframework.boot.test.context.SpringBootTest;
import problem_solving.problem_solving.array.TrappingRainwater;
import problem_solving.problem_solving.strings.BackspaceStringsCompare;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class StringsTests {

    BackspaceStringsCompare backspaceStringsCompare;

    @BeforeEach
    public void setUp() {
        System.out.println("setup");
        backspaceStringsCompare = new BackspaceStringsCompare();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown");
        //Clean up resources or perform other cleanup tasks
        backspaceStringsCompare = null;
    }

    @Test
    public void trw_positive1(){
        System.out.println("trw_positive1");
        boolean actual = backspaceStringsCompare.compareTwoStrings ( "abc#d", "abp#d");

        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void trw_negative1(){
        System.out.println("trw_negative1");
        boolean actual = backspaceStringsCompare.compareTwoStrings ( "abc#d", "abp#d#");

        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(true);
    }

    @Test
    public void trw_positive2(){
        System.out.println("trw_positive2");
        boolean actual = backspaceStringsCompare.compareTwoStrings ( "abc##d#", "abp##");

        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void trw_negative2(){
        System.out.println("trw_negative2");
        boolean actual = backspaceStringsCompare.compareTwoStrings ( "abc##d#", "abp##p##");

        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(true);
    }

    @Test
    public void trw_positive3(){
        System.out.println("trw_positive3");
        boolean actual = backspaceStringsCompare.compareTwoStrings ( "abc##d####", "##");

        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(true);
    }
}
