import org.junit.Test;

public class MainTest
{
    @Test
    public void getClassString()
    {
        String str = "hello Hello";
        boolean got = str.contains("Hello");
        System.out.println("String contains 'Hello' :" + got);
        got = str.contains("hallo");
        System.out.println("String contains 'hallo' :" + got);
    }
}
