//Author: Joshua Whitmore
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class GreatestCommonDivisorTest{
	@Test
	public void testGCD(){
	
	//arrange
	int aAZero = 0;
	int bAZero = 10;
	
	int aBZero = 20;
	int bBZero = 0;
	
	int aAOne = 1;
	int bAOne = 23;
	
	int aBOne = 101;
	int bBOne = 1;
	
	int aALarge = 1200;
	int bALarge = 20;
	
	int aBLarge = 30;
	int bBLarge = 3000000;
	
	int zeroResult = 0;
	int oneResult = 1;
	int twentyResult=20;
	int thirtyResult=30;
	//act
	int AZero = GreatestCommonDivisor.GCDNaive(aAZero,bAZero);
	int BZero = GreatestCommonDivisor.GCDNaive(aBZero,bBZero);
	int AOne = GreatestCommonDivisor.GCDNaive(aAOne,bAOne);
	int BOne = GreatestCommonDivisor.GCDNaive(aBOne,bBOne);
	int ALarge = GreatestCommonDivisor.GCDNaive(aALarge,bALarge);
	int BLarge = GreatestCommonDivisor.GCDNaive(aBLarge,bBLarge);
	
	//assert
	assertThat(AZero,equalTo(zeroResult));
	assertThat(BZero,equalTo(zeroResult));
	assertThat(AOne,equalTo(oneResult));
	assertThat(BOne,equalTo(oneResult));
	assertThat(ALarge,equalTo(twentyResult));
	assertThat(BLarge,equalTo(thirtyResult));
	
	
	
	
	
	
	
	}
}
