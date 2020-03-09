package com.github.TheDebofNight19;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertJ2 {
    private static final Logger LOG = LoggerFactory.getLogger(AssertJ2.class);


    @Test
    public void testS1(){
        LOG.info("This is a testNG test -2");
    }

    /**
     * Параметризованный тест
     * @return
     */

    @DataProvider(name = "Data Provider")
    public Object[] dataProvider(){

        return new Object[][]{
                {"Test No", 1},
                {"Test No", 2}
        };
    }

    @Test(dataProvider = "Data Provider")
    public void testS2(String test, int num){
        LOG.info("This is another testNG test -2");
        String print = String.format("TEST: %s | NOM: %d", test, num);
        System.out.println(print);
    }

}
