//Author: Joshua Whitmore
//September 12 , 2020
//Coursera:Data Strucures and Algorithms
//Note:This is my first time using JUNIT, and it was not a part of the course corriculum
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class FibListTest{

	@Test
	public void testFibList(){
	//arrange
	long expectedZero = 0;
	long expectedOne = 1;
	long expectedTen = 55;
	long expectedThree=2;
	//act
	long fibNZero = FibList.fibList(0);
	long fibNOne = FibList.fibList(1);
	long fibNTen = FibList.fibList(10);
	long fibNThree = FibList.fibList(3);
	//assert
	assertThat(fibNZero,equalTo(expectedZero));
	assertThat(fibNOne,equalTo(expectedOne));
	assertThat(fibNTen,equalTo(expectedTen));
	assertThat(fibNThree,equalTo(expectedThree));

	}
}
