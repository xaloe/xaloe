package com.xaloe.designpattern.simplefactory.test;

import org.junit.Test;

import com.xaloe.designpattern.simplefactory.domain.inf.IBall;
import com.xaloe.designpattern.simplefactory.factory.BallFactory;


/**
 * Unit test for SimpleFactoryTest.
 */
public class SimpleFactoryTest{
	
	/**
	 * 
	 * TODO (方法描述) <br/>
	 */
	@Test
	public void testFly() {
		BallFactory factory = new BallFactory();
		//足球
		IBall football = factory.produceFootball();
		football.fly();
		
		//篮球
		IBall basketball = factory.produceBasketball();
		basketball.fly();
		
		//羽毛球
		IBall volleyball = factory.produceVolleyball();
		volleyball.fly();
	}
}
