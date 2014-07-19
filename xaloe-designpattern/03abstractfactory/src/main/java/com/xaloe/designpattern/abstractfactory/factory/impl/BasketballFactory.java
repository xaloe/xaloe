package com.xaloe.designpattern.abstractfactory.factory.impl;

import com.xaloe.designpattern.abstractfactory.domain.impl.MatchBasketball;
import com.xaloe.designpattern.abstractfactory.domain.impl.TrainingBasketball;
import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.designpattern.abstractfactory.factory.inf.IFactory;
/**
 * 
 * TODO (篮球工厂)
 * @author xie_zhibing@163.com
 *
 */
public class BasketballFactory implements IFactory {

	private static final BasketballFactory basketballFactory = new BasketballFactory();
		
	private BasketballFactory() {
		super();
	}

	public static IFactory getInstance() {
		// TODO getInstance method stub
		return basketballFactory;
	}
	
	public IBall produceTrainingBall() {
		// TODO produceTrainingBall method stub
		return new TrainingBasketball();
	}

	public IBall produceMatchBall() {
		// TODO produceMatchBall method stub
		return new MatchBasketball();
	}

}
