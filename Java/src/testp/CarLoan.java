package testp;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class CarLoan {

    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("Before Suite is executed");
    }

    @AfterSuite
    public void AfterSuite()
    {
        System.out.println("After Suite is executed");
    }

    @BeforeClass
    public void BeforeClass()
    {
        System.out.println("Before Class CarLoan is executed");
    }

    @AfterClass
    public void AfterClass()
    {
        System.out.println("After Class CarLoan is executed");
    }

    @BeforeTest
    public void BeforeTest()
    {
        System.out.println("Before Test case is executed");
    }

    @AfterTest
    public void AfterTest()
    {
        System.out.println("After Test case is executed");
    }

    @BeforeMethod
    public void BeforeMethod()
    {
        System.out.println("Before Method case is executed");
    }

    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("After Method case is executed");
    }

    @Test
    public void CarLoanTest1()
    {
        System.out.println("CarLoan Test case 1 is executed");
    }

    @Test
    public void CarLoanTest2()
    {
        System.out.println("CarLoan Test case 2 is executed");

    }
}
