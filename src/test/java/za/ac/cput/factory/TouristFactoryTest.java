package za.ac.cput.factory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.Tourist;

import static org.junit.Assert.*;

public class TouristFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTourist() {

        String name = "Carly-Ann";
        String sName = "Abrahams";
        int age = 25;
        Tourist tor = TouristFactory.getTourist(name, sName, age);


        System.out.println(tor);
        Assert.assertNotNull(tor.getTouristId());

    }
}