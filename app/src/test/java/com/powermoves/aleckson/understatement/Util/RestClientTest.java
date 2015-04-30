package com.powermoves.aleckson.understatement.Util;

import com.powermoves.aleckson.understatement.CustomRobolectricRunner;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Captor;
import org.robolectric.annotation.Config;


@RunWith(CustomRobolectricRunner.class)
@Config(emulateSdk = 21)
public class RestClientTest extends TestCase {

    private Captor cb;

    @Before
    public void setUp() throws Exception {
        super.setUp();

    }

    @Test
    public void  restClientRetrivedAndParsesJsonTest(){
        //Mockito.verify(mockAPi).getShow(Mockito.anyString(),
          //      cb);




    }
}