package development.scam.androiddevelopmenttemplate;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.Assert;

import development.scam.androiddevelopmenttemplate.MainActivity;

/**
 * Created by chibs on 2015-08-19.
 */
public class MainActivityTest
       extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testTests()
    {
        Assert.assertTrue(true);
    }

    public void testTesters()
    {
        Assert.assertTrue(true);
    }
}
