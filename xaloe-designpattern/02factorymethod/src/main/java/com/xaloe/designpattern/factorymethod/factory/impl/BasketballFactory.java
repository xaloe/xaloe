package com.xaloe.designpattern.factorymethod.factory.impl;

import com.xaloe.designpattern.factorymethod.domain.impl.Basketball;
import com.xaloe.designpattern.factorymethod.domain.inf.IBall;
import com.xaloe.designpattern.factorymethod.factory.inf.IFactory;
/**
 * 
 * @ClassName: BasketballFactory 
 * @Description: TODO(篮球工厂) 
 * @author zhibing.xie xie_zhibing@163.com
 * @date 2014年7月5日 下午11:45:30 
 *
 */
public class BasketballFactory implements IFactory {

	private static final BasketballFactory factory = new BasketballFactory();
	
	private BasketballFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IFactory getInstance() {
		// TODO getInstance method stub
		return factory;
	}

	public IBall produceBall() {
		// TODO Auto-generated method stub
		return new Basketball();
	}

}
