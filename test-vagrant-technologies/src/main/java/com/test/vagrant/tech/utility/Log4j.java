package com.test.vagrant.tech.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	
	 @SuppressWarnings("rawtypes")
	 public static Logger initLog4j(Class cl) {

	 Logger log = Logger.getLogger(cl);
	 PropertyConfigurator.configure("./src/main/resources/config/log4j.properties");

	 return log;
	 }
	 }
