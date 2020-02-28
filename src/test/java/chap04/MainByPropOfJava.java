package chap04;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import chap04.config.ConfigByProp;

public class MainByPropOfJava {
	public static void main(String[] args) throws IOException{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigByProp.class);
		ctx.close();
	}
}
