package com.xaloe.designpattern.singleton.classload;

/**
 * 
 * TODO (饿汉式单例)
 * <p>
 * 饿汉式单例是线程安全的，它会在类加载的时候创建类的实例，
 * 因为不能保证它的实例一定会被使用，如果实例初始化非常耗费资源，
 * 这种单例会影响程序的性能
 * </p>
 * @author xie_zhibing@163.com
 *
 */
public class HungerSingleton {
	private static final HungerSingleton instance = new HungerSingleton();
	
	private HungerSingleton(){
		
	}
	
	public static HungerSingleton getInstance(){
		return instance;
	}
	
	
}
