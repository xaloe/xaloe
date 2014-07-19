package com.xaloe.designpattern.singleton.dublecheck;

/**
 * 
 * TODO (安全的高效的懒汉式单例)
 * <p>
 * 这种单例不在类加载时创建实例，使用synchronized控制，保证getInstance()方法只创建一个实例。
 * 多线程环境下会保证创建唯一实例，而从JVM的优化角度讲，这个情况仍可能发生错误。 
 * </p>
 * <p> 参考了《Java多线程编程环境中单例模式的实现》 http://xupo.iteye.com/blog/463426
 * </p>
 * @author xie_zhibing@163.com
 *
 */
public class LazySafeEfficientSingleton {
	
	private static volatile LazySafeEfficientSingleton instance;
	
	private LazySafeEfficientSingleton() {
		
	}
	
	/**
	 * <p>
	 * 从代码逻辑上看这种方式已经可以保证多线程下实例化唯一实例，<br/>
	 * 但实际上，从JVM的角度讲，这些代码仍然可能发生错误。对于JVM而言，它执行的是一个个Java指令。<br/>
     * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new LazySafeEfficientSingleton(); <br/>
     * 语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的<br/> 
     * LazySafeEfficientSingleton实例分配空间，然后直接赋值给instance成员变量，<br/>
     * 然后再去初始化这个LazySafeEfficientSingleton实例。<br/>
     * 这样就使出错成为了可能，我们仍然以A、B两个线程为例：<br/>
     * 1. A、B线程同时进入了第一个if判断<br/>
     * 2. A首先进入synchronized块，由于instance为null，所以它执行instance = new LazySafeEfficientSingleton();<br/>
     * 3. 由于JVM内部的优化机制，JVM先划分出了一些分配给LazySafeEfficientSingleton实例的空白内存，
     *    并赋值给instance成员变量（<b>注意此时JVM没有开始初始化这个实例</b>），然后A离开了synchronized块。<br/>
	 * 4. B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。<br/>
	 * 5. 此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。<br/>
	 * </p>
	 * @return
	 */
	public static LazySafeEfficientSingleton getInstance(){		
		if(instance == null){
			synchronized(LazySafeEfficientSingleton.class){
				if(instance == null){
					instance = new LazySafeEfficientSingleton();
				}
			}
		}
		return instance;
	}
}
