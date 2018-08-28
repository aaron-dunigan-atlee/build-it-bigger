package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.InstrumentationRegistry.getTargetContext;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void doInBackgroundTest() {
        Context context = getTargetContext();
        EndpointsAsyncTask testTask = new EndpointsAsyncTask();
        String result = testTask.doInBackground(context);
        assert !(result.isEmpty());
    }


}