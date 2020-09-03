package io.ennate.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.ennate.simple.Application;

public class Runner {
	public static void main(String[] args) {
		  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);		  
		  NotifService notifService = context.getBean(NotifService.class);
		  notifService.sendNotification("hashikalewis17@gmail.com", "Hiiiii!");
		  context.close();

	}
}
