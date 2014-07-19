package com.xaloe.designpattern.singleton.innerclass;

/**
 * 
 * TODO (内部类初始化单例)
 * <p>
 * JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。</br>
 * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，</br>
 * 并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心3.2中的问题。</br>
 * 此外该方法也只会在第一次调用的时候使用互斥机制，这样就解决了3.1中的低效问题。</br>
 * 最后instance是在第一次加载SingletonContainer类时被创建的，而SingletonContainer类</br>
 * 则在调用getInstance方法的时候才会被加载，因此也实现了惰性加载。</br>
 * </p>
 * @author xie_zhibing@163.com
 *
 */
public class InnerClassInitSingleton {

	private InnerClassInitSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static class SingletonHolder{
		private static InnerClassInitSingleton instance = new InnerClassInitSingleton(); 
	} 
	
	public static InnerClassInitSingleton getInstance(){
		return SingletonHolder.instance;
	}
	
}
