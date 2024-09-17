package problem_solving.problem_solving;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import problem_solving.problem_solving.array.TwoSum;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class ProblemSolvingApplicationTests {

	TwoSum twoSum;

	@BeforeEach
	public void setUp() {
		System.out.println("setup");
		twoSum = new TwoSum();
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tearDown");
		//Clean up resources or perform other cleanup tasks
		twoSum = null;
	}

	@Test
	public void positiveTestOne(){
		System.out.println("positiveTestOne");
		int actual = twoSum.findIndicesO2( new int[]{1,3,7,9,8,20,4,-9}, 11);
		assertThat(actual).isEqualTo(3);
	}

	@Test
	public void negativeTestOne(){
		System.out.println("negativeTestOne");
		int actual = twoSum.findIndicesO2( new int[]{1,3,7,9,8,20,4,-9}, 11);
		assertThat(actual).isNotEqualTo(4);
	}

	@Test
	public void postiveTestTwo(){
		System.out.println("postiveTestTwo");
		int actual = twoSum.findIndicesO2( new int[]{1,3,7,9,8,20,4,-9, 30}, 50);
		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void negativeTestTwo(){
		System.out.println("negativeTestTwo");
		int actual = twoSum.findIndicesO2( new int[]{1,3,7,9,8,20,4,-9, 30, 41}, 50);
		assertThat(actual).isNotEqualTo(3);
	}

	@Test
	public void postiveTestThree(){
		System.out.println("postiveTestThree");
		int actual = twoSum.findIndicesO2( new int[]{}, 50);
		assertThat(actual).isEqualTo(0);
	}

	@Test
	public void negativeTestThree(){
		System.out.println("negativeTestThree");
		int actual = twoSum.findIndicesO2( new int[]{1}, 50);
		assertThat(actual).isNotEqualTo(1);
	}

	@Test
	public void postiveTestFour(){
		System.out.println("postiveTestFour");
		int actual = twoSum.findIndicesO2( new int[]{1,2,4}, 5);
		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void positiveTestOneOptmized(){
		System.out.println("positiveTestOneOptmized");
		int actual = twoSum.findIndicesOptimized( new int[]{1,3,7,9,8,20,4,-9}, 11);
		assertThat(actual).isEqualTo(3);
	}

	@Test
	public void negativeTestOneOptimized(){
		System.out.println("negativeTestOneOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{1,3,7,9,8,20,4,-9}, 11);
		assertThat(actual).isNotEqualTo(4);
	}

	@Test
	public void postiveTestTwoOptimized(){
		System.out.println("postiveTestTwoOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{1,3,7,9,8,20,4,-9, 30}, 50);
		assertThat(actual).isEqualTo(1);
	}

	@Test
	public void negativeTestTwoOptimized(){
		System.out.println("negativeTestTwoOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{1,3,7,9,8,20,4,-9, 30, 41}, 50);
		assertThat(actual).isNotEqualTo(3);
	}

	@Test
	public void postiveTestThreeOptimized(){
		System.out.println("postiveTestThreeOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{}, 50);
		assertThat(actual).isEqualTo(0);
	}

	@Test
	public void negativeTestThreeOptimized(){
		System.out.println("negativeTestThreeOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{1}, 50);
		assertThat(actual).isNotEqualTo(1);
	}

	@Test
	public void postiveTestFourOptimized(){
		System.out.println("postiveTestFourOptimized");
		int actual = twoSum.findIndicesOptimized( new int[]{1,2,4}, 5);
		assertThat(actual).isEqualTo(1);
	}
}
