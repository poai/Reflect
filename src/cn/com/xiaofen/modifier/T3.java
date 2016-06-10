package cn.com.xiaofen.modifier;

import org.junit.Test;

public class T3 {

	@Test
	public void test(){
		
		Hello<Object,Object> hello=new Hello<Object,Object>();
		hello.setMessage("hello");
		
		Class h=hello.getClass();
	}
}
