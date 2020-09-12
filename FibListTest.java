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
	long expected = 0;
	//act
	long fibN = FibList.fibList(0);
	//assert
	assertThat(fibN,equalTo(0));

	}
}
