package com.wallee.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.text.FieldPosition;
import java.util.Date;


public class RFC3339DateFormatTest {

    @Test
    public void testFormat(){

        // GIVEN
        Date date = new Date(0);
        RFC3339DateFormat formatter = new RFC3339DateFormat();
        StringBuffer bf = new StringBuffer();

        // WHEN
        formatter.format(date, bf, new FieldPosition(1));

        // THEN
        Assert.assertEquals("1970-01-01T00:00:00.000Z", bf.toString());
    }
}