package com.github.TheDebofNight19;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class AssertJ {
    private static final Logger LOG = LoggerFactory.getLogger(AssertJ.class);


    @BeforeSuite
    public void beforeSuite(){
        LOG.info("Before Suite");
    }

    @Test
    public void test1(){
        LOG.info("This is a testNG test!");
    }



    @AfterSuite
    public void afterSuite(){
        LOG.info("After Suite");
    }
}
