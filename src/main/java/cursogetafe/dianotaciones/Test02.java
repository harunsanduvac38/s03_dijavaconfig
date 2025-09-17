package cursogetafe.dianotaciones;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cursogetafe.dianotaciones.config.A02Config;
import cursogetafe.dianotaciones.negocio.Negocio;

public class Test02 {
	
	public static void main(String[] args) {
		
		
		BeanFactory ctx = new AnnotationConfigApplicationContext(A02Config.class);
		
		Negocio neg = ctx.getBean("negocio", Negocio.class);
		
		System.out.println(neg.proceso(78));
		
		
	}

}
