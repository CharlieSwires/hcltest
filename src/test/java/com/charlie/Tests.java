package com.charlie;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Tests {

    private MyService service = null;
    
    private RController controller = null;

    private static final Double delta = 0.00001;
    
    @Before
    public void startup() {
        service = new MyService();
        controller = new RController(service);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals((double)service.add(1, 3), 4.0, delta);
    }
    @Test
    public void testSub() {
        Assert.assertEquals((double)service.subtract(1, 3), -2.0, delta);
    }
    @Test
    public void testMultiply() {
        Assert.assertEquals((double)service.multiply(1, 3), 3.0, delta);
    }
    @Test
    public void testDivide() {
        Assert.assertEquals((double)service.divide(1, 2), 0.5, delta);
    }

    @Test
    public void testAdd2() {
        Assert.assertEquals((double)controller.add(1, 3), 4.0, delta);
    }
    @Test
   public void testSub2() {
        Assert.assertEquals((double)controller.subtract(1, 3), -2.0, delta);
    }
    @Test
    public void testMultiply2() {
        Assert.assertEquals((double)controller.multiply(1, 3), 3.0, delta);
    }
    @Test
    public void testDivid2() {
        Assert.assertEquals((double)controller.divide(1, 2), 0.5, delta);
    }

}
