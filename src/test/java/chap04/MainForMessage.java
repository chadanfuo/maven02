package chap04;

import java.io.IOException;
import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForMessage {
	public static void main(String[] args) throws IOException{
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:message-config.xml");
		
		System.out.println(ctx.getMessage("hello", null,Locale.getDefault()));
		System.out.println(ctx.getMessage("welcome", new String[]{"ÃÖ¹ü±Õ"},Locale.getDefault()));
		

		System.out.println(ctx.getMessage("hello", null,Locale.ENGLISH));
		System.out.println(ctx.getMessage("welcome", new String[]{"madvirus"},Locale.ENGLISH));
		System.out.println(ctx.getMessage("hello", null,Locale.JAPAN));
//		System.out.println(ctx.getMessage("hello", null,Locale.CHINA));
		
		ctx.close();
	}
}
