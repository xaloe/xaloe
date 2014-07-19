package com.xaloe.designpattern.abstractfactory.factory.impl;

import com.xaloe.designpattern.abstractfactory.domain.impl.MatchFootball;
import com.xaloe.designpattern.abstractfactory.domain.impl.TrainingFootball;
import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.designpattern.abstractfactory.factory.inf.IFactory;

/**
 * 
 * TODO (足球工厂)
 * @author xie_zhibing@163.com
 *
 */
public class FootballFactory implements IFactory {
	private static final FootballFactory footballFactory = new FootballFactory();
	
	private FootballFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IFactory getInstance() {
		// TODO getInstance method stub
		return footballFactory;
	}
	
	
	public IBall produceTrainingBall() {
		// TODO produceTrainingBall method stub
		return new TrainingFootball();
	}

	
	public IBall produceMatchBall() {
		// TODO produceMatchBall method stub
		return new MatchFootball();
	}

}
