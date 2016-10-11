package java.basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;





public class AnnotationPractice {

	@Retention(RetentionPolicy.RUNTIME)
	@Target(value = {ElementType.METHOD, ElementType.FIELD})
	public @interface Call {
		public String value() default "";
	}

	@Call
	static void call(){
		System.out.println(1);
	}

	static void call2(){
		System.out.println(2);
	}

	@Call
	static void call3(){
		System.out.println(3);
	}



	public static void main(String[] args){
		Class<?> c = null;
		Method[] m = null;

		try{
			c = Class.forName("Dore");
			m = c.getDeclaredMethods();

			// 1 and 3 are expected
			for(Method e : m){
				e.setAccessible(true);
				if(e.getAnnotation(AnnotationPractice.Call.class) != null){
					e.invoke(null);
				}
			}


		}catch(Exception e){
		}


	}





}

