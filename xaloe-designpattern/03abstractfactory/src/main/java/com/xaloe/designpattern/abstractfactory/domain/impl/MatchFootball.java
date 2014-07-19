package com.xaloe.designpattern.abstractfactory.domain.impl;

import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.utils.DateUtil;

/**
 * 
 * TODO (比赛用足球)
 * @author xie_zhibing@163.com
 *
 */
public class MatchFootball implements IBall {

	/**
	 * 
	 * TODO (构构造函数)
	 */
	public MatchFootball() {
		super();
		System.out.println("我是比赛用足球, 我的生产时间是【"+  DateUtil.now() +"】");
	}

	public void fly() {
		// TODO fly method stub
		System.out.println("我是比赛用足球, 我可以飞！");
	}

}
