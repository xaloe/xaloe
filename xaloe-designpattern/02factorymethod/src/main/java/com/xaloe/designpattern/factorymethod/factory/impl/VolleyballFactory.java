package com.xaloe.designpattern.factorymethod.factory.impl;

import com.xaloe.designpattern.factorymethod.domain.impl.Volleyball;
import com.xaloe.designpattern.factorymethod.domain.inf.IBall;
import com.xaloe.designpattern.factorymethod.factory.inf.IFactory;

/**
 * 
 * @ClassName: VolleyballFactory 
 * @Description: TODO(排球工厂) 
 * @author zhibing.xie xie_zhibing@163.com
 * @date 2014年7月5日 下午11:47:11 
 *
 */
public class VolleyballFactory implements IFactory {
	
	private static final VolleyballFactory factory = new VolleyballFactory();
	
	private VolleyballFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static IFactory getInstance() {
		// TODO getInstance method stub
		return factory;
	}

	public IBall produceBall() {
		// TODO Auto-generated method stub
		return new Volleyball();
	}

}
