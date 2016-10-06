package ua.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mega on 06.10.2016.
 */

public class MathTest {

    @Before
    public void before() {
        System.out.println("Здесь можно инициализировать, открывать ресурсы...");
    }
    @After
    public void after() {
        System.out.println("Здесь можно закрывать ресурсы...");
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");
        int res = Math.add(2, 3);
        Assert.assertEquals(5, res);
    }

    @Test
    public void testAdd2() {
        System.out.println("testAdd2");
        int res = Math.add(2, 3);
        Assert.assertNotEquals(10, res);
    }

    @Test
    public void testDiv() {
        System.out.println("testDiv");
        int res = Math.div(10, 2);
        Assert.assertEquals(5, res);
    }

    @Test(expected = ZeroException.class)
    public void testDiv2() {
        System.out.println("testDiv2");
        int res = Math.div(10, 0);
    }
}
