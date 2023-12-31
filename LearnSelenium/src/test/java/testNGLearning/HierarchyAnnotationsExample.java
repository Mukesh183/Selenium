package testNGLearning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HierarchyAnnotationsExample {
  @Test
  public void test1() {
	  System.out.println("Im Test1");
  }
  @Test
  public void test2() {
	  System.out.println("Im Test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Im after class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im before suite");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im after suite");
  }

}
