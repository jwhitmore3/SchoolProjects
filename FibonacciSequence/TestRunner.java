//Author: Joshua Whitmore
//September 12 , 2020
//Coursera:Data Strucures and Algorithms

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;


public class TestRunner{

	public static void main(String[] args){
		Result result = JUnitCore.runClasses(FibListTest.class);

		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		} 

		System.out.println(result.wasSuccessful());
	}
}
