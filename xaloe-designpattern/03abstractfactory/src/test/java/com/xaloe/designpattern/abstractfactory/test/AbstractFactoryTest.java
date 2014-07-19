package com.xaloe.designpattern.abstractfactory.test;

import org.junit.Test;

import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;
import com.xaloe.designpattern.abstractfactory.factory.impl.FootballFactory;


public class AbstractFactoryTest {

	@Test
	public void testFly(){
		//训练用足球
		IBall traingFootball = FootballFactory.getInstance().produceTrainingBall();
		traingFootball.fly();
		
		//比赛用足球
		IBall matchFootball = FootballFactory.getInstance().produceMatchBall();
		matchFootball.fly();
		
		//训练用篮球
		IBall traingBasketball = FootballFactory.getInstance().produceTrainingBall();
		traingBasketball.fly();
		
		//比赛用篮球
		IBall matchBasketball = FootballFactory.getInstance().produceMatchBall();
		matchBasketball.fly();
		
		//训练用排球
		IBall traingVolleyball = FootballFactory.getInstance().produceTrainingBall();
		traingVolleyball.fly();
		
		//比赛用排球
		IBall matchVolleyball = FootballFactory.getInstance().produceMatchBall();
		matchVolleyball.fly();

	}
}
