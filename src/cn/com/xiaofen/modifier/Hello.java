package cn.com.xiaofen.modifier;

import java.io.Serializable;


import org.junit.runner.notification.RunListener.ThreadSafe;


@ThreadSafe
public class Hello<T,S> implements Serializable{
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void hello (){
		System.out.println(getMessage());
	}
	public Hello(String hello) {
		this.message=hello;
	}
	private Hello(String hello,String t){
		this.message=hello;
	}
	public Hello() {
	}
}
