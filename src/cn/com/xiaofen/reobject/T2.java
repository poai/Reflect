package cn.com.xiaofen.reobject;

import java.io.PrintStream;

import org.junit.Test;

/*.class 语法*/
public class T2 {
	@Test
	public void test_1(){
		boolean b;
		//Class c = b.getClass();   // 编译错误
		Class a = boolean.class;  // 正确
		Class d = java.io.PrintStream.class;//正确
		Class e = int[][][].class;//正确
	}
}
