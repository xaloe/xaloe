package com.xaloe.designpattern.factorymethod.factory.impl;

import com.xaloe.designpattern.factorymethod.domain.impl.Football;
import com.xaloe.designpattern.factorymethod.domain.inf.IBall;
import com.xaloe.designpattern.factorymethod.factory.inf.IFactory;

/**
 * 
 * @ClassName: FootballFactory 
 * @Description: TODO(足球工厂) 
 * @author zhibing.xie xie_zhibing@163.com
 * @date 2014年7月5日 下午11:46:46 
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

	public IBall produceBall() {
		// TODO Auto-generated method stub
		return new Football();
	}

}
