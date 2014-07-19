package com.xaloe.designpattern.singleton.unsafe;

/**
 * 
 * TODO (不安全的懒汉式单例)
 * <p>
 * 这种单例不在类加载时创建实例，在单线程环境下调用getInstance()方法只会创建一个实例，
 * 在多线程环境下调用getInstance()方法不保证创建唯一实例，它不是线程安全的。 
 * </p>
 * @author xie_zhibing@163.com
 *
 */
public class LazyUnsafeSingleton {
	
	private static LazyUnsafeSingleton instance;
	
	private LazyUnsafeSingleton(){
		
	}
	
	/**
	 * <p>
	 * 如果两个线程A和B同时执行了该方法，然后以如下方式执行：</br>
	 * 1. A进入if判断，此时instance为null，因此进入if内 </br>
	 * 2. B进入if判断，此时A还没有创建instance，因此instance也为null，因此B也进入if内 </br>
	 * 3. A创建了一个LazySafeInefficientSingleton并返回 </br>
	 * 4. B也创建了一个LazySafeInefficientSingleton并返回 </br>
	 * 此时问题出现了，我们的单例被创建了两次，而这并不是我们所期望的。 </br>
	 * </p>
	 * @return
	 */
	public static LazyUnsafeSingleton getInstance(){
		if(instance == null){
			instance = new LazyUnsafeSingleton();
		}
		return instance;
	}
}
