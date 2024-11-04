package day10_jUnit;

import org.junit.*;

public class AnnotationsTest {
    @Test
    public void  method1(){
        System.out.println("Method 1");
    }
    @Test
    public void method2(){
        System.out.println("Method 2");
    }
    @Test
    public void method3(){
        System.out.println("Method 3");
    }
    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void after(){
        System.out.println("After");
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("This is before class!!");
    }
    @AfterClass
    public static void AfterClass(){
        System.out.println("This is after class!!");
    }
@Test
    public void checkArrays(){
        char [] text = {'j', 'u', 'n', 'i', 't'};
        char [] ac = "JUnit".toLowerCase().toCharArray();
        Assert.assertArrayEquals(text, ac);
    }
@Test
    public void startsWith(){
        String text = "Hiiii";
    if(text.startsWith("H")){
        System.out.println("Starts with H");
    }else{
        System.out.println("Fail");
        Assert.fail("It doesnt start with H");
    }
       //Assert.assertTrue("it is not true",text.startsWith("H"));
    }


}
