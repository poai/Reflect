package cn.com.xiaofen.reobject;

import org.junit.Test;

/*Class.forName()*/
public class T3 {
	@Test
	public void test(){
		/*如果一个类的全限定名称是有效的则可以通过Class.forName()静态方法获取一个Class实例，不能用于原始类型。数组类型的类名可以通过调用 Class.getName()来获得，该语法适用于引用类型和原始类型*/
		try {
			Class a=Class.forName("cn.com.xiaofen.reobject.T1");
			Class cDoubleArray = Class.forName("[D");//double[].class
			Class cStringArray = Class.forName("[[Ljava.lang.String;");//String[][].class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
