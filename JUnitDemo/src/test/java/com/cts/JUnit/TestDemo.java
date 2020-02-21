package com.cts.JUnit;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;


public class TestDemo {
	static Logger log = Logger.getLogger(TestDemo.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.debug("Hello welcome to emart ");
	      log.info("Hello welcome to emart services");
	   }

}
