package com.xaloe.designpattern.abstractfactory.factory.inf;

import com.xaloe.designpattern.abstractfactory.domain.inf.IBall;

/**
 * 球类工厂
 * @author zhibing.xie
 *
 */
public interface IFactory {
	
	/**
	 * 
	 * TODO (生产训练用球)
	 * @return
	 */
	public IBall produceTrainingBall();
	
	/**
	 * 
	 * TODO (生产比赛用球)
	 * @return
	 */
	public IBall produceMatchBall();
	
	
	
}
