package cn.techpi.androidtestcase;

import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;

/**
 * Created by shen on 2015/9/8.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private MainActivity activity;
    public MainActivityTest(){
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity=getActivity();
    }

    public void testActivity(){
        assertNotNull(activity);
        System.out.println(activity.getTitle());
    }
}
