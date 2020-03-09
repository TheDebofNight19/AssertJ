package com.github.TheDebofNight19;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.math.BigDecimal;
import java.util.HashMap;
import static org.assertj.core.api.Assertions.*;


public class AssertJ {
    private static final Logger LOG = LoggerFactory.getLogger(AssertJ.class);


    @BeforeSuite
    public void beforeSuite(){
        LOG.info("Before Suite");
    }

    @Test
    public void test1(){

        LOG.info("This is a Wizard assertion test!");
        BigDecimal goldInherited = new BigDecimal(80632.2).setScale(3,BigDecimal.ROUND_DOWN);
        HashMap<Integer, String> wands = new HashMap<>();
        wands.put(13, "Dragon heart string");
        Wizard wizard1 = new Wizard("Draco", "Slytherin", 11, goldInherited, wands);
        assertThat(wizard1).hasFieldOrProperty("name")
                            .hasFieldOrProperty("house")
                            .isInstanceOf(Wizard.class)
                            .hasFieldOrProperty("wands");

    }

    @AfterSuite
    public void afterSuite(){
        LOG.info("After Suite");
    }
}
