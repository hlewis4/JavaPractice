package io.ennate.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
   public static void main(String[] args) {
	  System.out.println("In main");
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	  System.out.println("After context init");
	  HelloWorld hello = context.getBean(HelloWorld.class);
	  hello.sayHello();
	  context.close();
	  System.out.println("After closing the context");
   }
}
