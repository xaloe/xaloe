package com.xaloe.designpattern.factorymethod.test;

import org.junit.Test;

import com.xaloe.designpattern.factorymethod.domain.inf.IBall;
import com.xaloe.designpattern.factorymethod.factory.impl.BasketballFactory;
import com.xaloe.designpattern.factorymethod.factory.impl.FootballFactory;
import com.xaloe.designpattern.factorymethod.factory.impl.VolleyballFactory;

public class FactoryMethodTest {

	@Test
	public void testFly(){
		//足球
		IBall football = FootballFactory.getInstance().produceBall();
		football.fly();
		
		//篮球
		IBall basketball = BasketballFactory.getInstance().produceBall();
		basketball.fly();
		
		//排球
		IBall volleyball = VolleyballFactory.getInstance().produceBall();
		volleyball.fly();
	}
}
