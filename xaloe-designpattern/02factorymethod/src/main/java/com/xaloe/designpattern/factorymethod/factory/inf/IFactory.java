package com.xaloe.designpattern.factorymethod.factory.inf;

import com.xaloe.designpattern.factorymethod.domain.inf.IBall;

/**
 * 球类工厂
 * @author zhibing.xie
 *
 */
public interface IFactory {
	
	/**
	 * 
	 * TODO (生产球类) <br/>
	 * @return
	 */
	public IBall produceBall();
	
	
}
