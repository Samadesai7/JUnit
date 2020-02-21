package com.cts.JUnitProj;
import java.net.MalformedURLException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HelloWorld
{
    private static Logger LOGGER = null;
    @BeforeAll
    public static void setLogger() throws MalformedURLException{
    	 System.setProperty("log4j.configurationFile","log4j.properties");
         LOGGER = LogManager.getLogger();
    }
    @Test
    public void testOne()
    {
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        //LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
    }
}
     