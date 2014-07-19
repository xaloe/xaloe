package com.xaloe.designpattern.simplefactory.factory;

import com.xaloe.designpattern.simplefactory.domain.impl.Basketball;
import com.xaloe.designpattern.simplefactory.domain.impl.Football;
import com.xaloe.designpattern.simplefactory.domain.impl.Volleyball;
import com.xaloe.designpattern.simplefactory.domain.inf.IBall;

/**
 * 生产工厂
 * @author zhibing.xie
 *
 */
public class BallFactory {

	/**
	 * 生产足球
	 * @return
	 */
	public IBall produceFootball(){
		return new Football();
	}
	
	/**
	 * 生产篮球
	 * @return
	 */
	public IBall produceBasketball(){
		return new Basketball();
	}
	
	/**
	 * 生产排球
	 * @return
	 */
	public IBall produceVolleyball(){
		return new Volleyball();
	}
	
}
