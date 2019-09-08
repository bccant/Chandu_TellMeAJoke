package com.udacity.gradle.builditbigger;

import android.test.ApplicationTestCase;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.*;


public class EndpointsAsyncTaskTest {
    private String joke;

    @Test
    public void testJoke() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.gcmHook() {
            @Override
            public void onRetrieval(String joke) {

            }
        });
        endpointsAsyncTask.execute();
        try {
            joke = endpointsAsyncTask.get();
            assertNotNull("Fetched from the Java lib", joke);
            System.out.println("\n The retrieved joke is : \n"+joke);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }

}