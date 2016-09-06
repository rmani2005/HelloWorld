package helloWorld;

import org.junit.*;
import org.testng.Assert;

public class junit 
{
    @Test
	public void junit1()
	{
		
		System.out.println("Junit@Test");
		Assert.assertEquals(1, 1);

	}

    @Before
	public void junit2()
	{
		
		System.out.println("Junit@Before");
		System.out.println("Junit@Check Before");
		Assert.assertEquals(1, 1);

	}

    
}
