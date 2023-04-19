/**
 * @author Yogesh Aknurwar
 * @date 19-04-2022
 * 
 */
package com.test.vagrant.tech.utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.test.vagrant.tech.constants.GlobalConstants;

public class Log4j {
	
	 @SuppressWarnings("rawtypes")
	 public static Logger initLog4j(Class cl) {

	 Logger log = Logger.getLogger(cl);
	 PropertyConfigurator.configure(GlobalConstants.LOG4J);

	 return log;
	 }
	 }
