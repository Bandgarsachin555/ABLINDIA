package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void abc()
	{
		Assert.assertEquals("sachin", "sachin");
	}
	@Test(dependsOnMethods = {"abc"})
	public void pur()
	{
		Assert.assertEquals("sachin", "sachin");
	}
	
	@Test(dependsOnMethods= {"pur"})
	public void xyz()
	{
		Assert.assertEquals("sachin", "sachin");
	}
}
