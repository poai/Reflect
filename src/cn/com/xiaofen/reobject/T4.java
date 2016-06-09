package cn.com.xiaofen.reobject;

import org.junit.Test;
/*原始类型包装类的TYPE字段*/
public class T4 {
	@Test
	public void test() {
		/* 每一个原始类型及void在java.lang包下都存在一个包装类，每一个包装类型存在一个字段TYPE等于原始类型的Class对象 */
		Class c = Double.TYPE;//==double.class;
		Class d = Void.TYPE;//==void.class;
	}
}
