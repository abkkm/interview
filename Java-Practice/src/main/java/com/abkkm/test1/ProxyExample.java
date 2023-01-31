package com.abkkm.test1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


interface HelloWorld {
	public void sayHelloWorld();
}

class HelloWorldImpl implements HelloWorld{

	public void sayHelloWorld() {
		 {
				System.out.println("1");
				System.out.println("1");
				System.out.println("1");
			}
	}
	
}

public class ProxyExample implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader() , target.getClass().getInterfaces() , this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        System.out.println("123" + method.getName() + args);
        Object obj = method.invoke(target , args);
        System.out.println("123");
        return obj;
    }
    public static void main(String[] args) {
        ProxyExample example = new ProxyExample();
        HelloWorld proxy = (HelloWorld) example.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
 
    }
}


