package cn.com.xiaofen.reobject;

import org.junit.Test;

/*方法返回Class对象*/
public class T5 {
	@Test
	public void test(){
		/*返回父类的Class对象*/
		Class c = javax.swing.JButton.class.getSuperclass();
		/*返回Class兑现的所有公共类、接口、枚举、成员，包括继承的成员*/
		Class<?>[] d = Character.class.getClasses();
		/*返回Class中的所有接口和显示申明的枚举*/
		Class<?>[] e = Character.class.getDeclaredClasses();
		/*返回当前类的申明Class对象*/
		Class f=Character.class.getDeclaringClass();
			
		//java.lang.reflect.Field.getDeclaringClass()
		//java.lang.reflect.Method.getDeclaringClass()
		//java.lang.reflect.Constructor.getDeclaringClass()
	}
}
