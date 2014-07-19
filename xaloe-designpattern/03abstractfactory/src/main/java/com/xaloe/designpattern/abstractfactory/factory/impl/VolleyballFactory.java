package com.xaloe.designpattern.abstractfactory.factory.impl;

import com.xaloe.designpattern.abstractfactory.domain.impl.MatchVolleyball;
import com.xaloe.designpattern.abstractfactory.domain.impl.TrainingVolleyball;
import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.designpattern.abstractfactory.factory.inf.IFactory;

/**
 * 
 * TODO (排球工厂)
 * @author xie_zhibing@163.com
 *
 */
public class VolleyballFactory implements IFactory {

	private static final VolleyballFactory volleyballFactory = new VolleyballFactory();
	
	private VolleyballFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IFactory getInstance() {
		// TODO getInstance method stub
		return volleyballFactory;
	}
	
	
	public IBall produceTrainingBall() {
		// TODO produceTrainingBall method stub
		return new TrainingVolleyball();
	}

	
	public IBall produceMatchBall() {
		// TODO produceMatchBall method stub
		return new MatchVolleyball();
	}

}
