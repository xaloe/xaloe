package com.xaloe.designpattern.abstractfactory.domain.impl;

import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.utils.DateUtil;

/**
 * 
 * TODO (比赛用篮球)
 * @author xie_zhibing@163.com
 *
 */
public class MatchBasketball implements IBall{
	
	/**
	 * TODO (构构造函数)
	 */
	public MatchBasketball() {		
		// TODO non parameter constructor stub
		super();
		System.out.println("我是比赛用篮球, 我的生产时间是【"+  DateUtil.now() +"】");
	}

	public void fly() {
		// TODO fly method stub
		System.out.println("我是比赛用篮球, 我可以飞！");
	}
	

}
