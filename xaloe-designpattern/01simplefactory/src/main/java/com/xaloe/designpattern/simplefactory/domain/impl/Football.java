package com.xaloe.designpattern.simplefactory.domain.impl;

import com.xaloe.designpattern.simplefactory.domain.inf.IBall;
import com.xaloe.utils.DateUtil;

public class Football implements IBall {

	/**
	 * 
	 * TODO (构构造函数)
	 */
	public Football() {
		super();
		System.out.println("我是足球, 我的生产时间是【"+  DateUtil.now() +"】");
	}

	public void fly() {
		// TODO fly method stub
		System.out.println("我是足球, 我可以飞！");
	}

}
