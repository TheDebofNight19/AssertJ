package com.github.TheDebofNight19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Hamcrest {

    private static final Logger LOG = LoggerFactory.getLogger(Hamcrest.class);

    /**
     * для Hamcrest создана пробная проверка, которая упадет
     */

    @Test
    public void test2() {
        LOG.info("This is a Wizard Hamcrest test!");
        BigDecimal goldInherited = new BigDecimal(55678.2).setScale(3, BigDecimal.ROUND_DOWN);
        HashMap<Integer, String> wands = new HashMap<>();
        wands.put(11, "Phoenix feather");
        Wizard wizard2 = new Wizard("Harry", "Gryffindore", 11, goldInherited, wands);

        assertThat(wizard2.getName(), equalTo("Harry"));
        assertThat(wizard2.getWands(), hasEntry(11, "Phoenix feather"));
        assertThat(wizard2.getWands(), hasKey(13));
        /**
         * после последнего ассерта тест упадет на ошибку
         */
    }
}