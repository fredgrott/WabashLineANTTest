package com.mobilebytes.wabashlineant.test;

import com.mobilebytes.wabashlineant.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;


public class TestWabash extends ActivityInstrumentationTestCase2<MainActivity>{

	private MainActivity mActivity;

	public TestWabash() {
		super("com.mobilebytes.wabashlineant", MainActivity.class);

	}

	@Override
    protected void setUp() throws Exception {
        super.setUp();
    	mActivity = getActivity();

    }


	 /**
     * Verifies that activity under test can be launched.
     */
    public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }

    @SmallTest
    public void testPreconditions() {
    	assertNotNull(mActivity);

    }




}
