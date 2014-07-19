package com.xaloe.designpattern.singleton.syncmethod;

/**
 * 
 * TODO (安全的低效的懒汉式单例)
 * <p>
 * 这种单例不在类加载时创建实例，使用synchronized控制，保证getInstance()方法只创建一个实例。
 * 多线程环境下，每个线程执行getInstance()方法时，都会等待其他线程先释放该类的锁。 
 * </p>
 * @author xie_zhibing@163.com
 *
 */
public class LazySafeInefficientSingleton {
	
	private static LazySafeInefficientSingleton instance;
	
	private LazySafeInefficientSingleton(){
		
	}
	
	/**
	 * <p>
	 * 这种解决办法的确可以防止错误的出现，但是它却很影响性能：<br/>
	 * 每次调用getInstance方法的时候都必须获得Singleton的锁，<br/>
	 * 而实际上，当单例实例被创建以后，其后的请求没有必要再使用互斥机制了<br/>
	 * </p>
	 * @return
	 */
	public static synchronized LazySafeInefficientSingleton getInstance(){
		if(instance == null){
			instance = new LazySafeInefficientSingleton();
		}
		return instance;
	}
	
}
