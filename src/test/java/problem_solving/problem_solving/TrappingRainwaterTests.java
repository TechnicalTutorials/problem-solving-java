package problem_solving.problem_solving;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import problem_solving.problem_solving.array.TrappingRainwater;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest
public class TrappingRainwaterTests {

    TrappingRainwater trappingRainwater;

    @BeforeEach
    public void setUp() {
        System.out.println("setup");
        trappingRainwater = new TrappingRainwater();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tearDown");
        //Clean up resources or perform other cleanup tasks
        trappingRainwater = null;
    }

    @Test
    public void trw_positive1(){
        System.out.println("positiveTestOne");
        int actual = trappingRainwater.getTrappedRainwater ( new int[]{1,3,7,9,8,20,4,22});
        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(17);
    }

    @Test
    public void trw_negative1(){
        System.out.println("negativeTestOne");
        int actual = trappingRainwater.getTrappedRainwater ( new int[]{1});
        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(1);
    }

    @Test
    public void trw_positive2(){
        System.out.println("positiveTestOne");
        int actual = trappingRainwater.getTrappedRainwater ( new int[]{1,3,1});
        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void trw_negative2(){
        System.out.println("negativeTestOne");
        int actual = trappingRainwater.getTrappedRainwater ( new int[]{1,20,2,30});
        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(20);
    }

    @Test
    public void trw_positive3(){
        System.out.println("trw_positive3");
        int actual = trappingRainwater.getTrappedRainwaterOptimized ( new int[]{1,3,1});
        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void trw_negative3(){
        System.out.println("trw_negative3");
        int actual = trappingRainwater.getTrappedRainwaterOptimized ( new int[]{1,20,2,30});
        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(20);
    }
    @Test
    public void trw_positive4(){
        System.out.println("trw_positive4");
        int actual = trappingRainwater.getTrappedRainwaterOptimized ( new int[]{1,3,1,0,5,2});
        System.out.println("actual: " + actual);
        assertThat(actual).isEqualTo(5);
    }

    @Test
    public void trw_negative4(){
        System.out.println("trw_negative4");
        int actual = trappingRainwater.getTrappedRainwaterOptimized ( new int[]{1,4,0,10,6});
        System.out.println("actual: " + actual);
        assertThat(actual).isNotEqualTo(5);
    }
}
