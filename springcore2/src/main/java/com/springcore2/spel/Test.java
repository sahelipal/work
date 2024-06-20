package com.springcore2.spel;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("com/springcore2/spel/spelconfig.xml");
		Demo demo=(Demo)ct.getBean("demo");
		System.out.println(demo);
		
//		SpelExpressionParser temp=new SpelExpressionParser();
//		 Expression expression=temp.parseExpression("22+55");
//		System.out.println(expression.getValue());
	}

}
