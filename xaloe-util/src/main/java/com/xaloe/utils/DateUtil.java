package com.xaloe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * TODO (当前时间) <br/>
	 * 格式：yyyy-MM-dd HH:mm:ss <br/>
	 * @return
	 */
	public static String now(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	/**
	 * 
	 * TODO (当前日期) <br/>
	 * 格式：yyyy-MM-dd <br/>
	 * @return
	 */
	public static String today(){
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	
}
