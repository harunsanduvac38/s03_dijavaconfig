package cursogetafe.dianotaciones;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cursogetafe.dianotaciones.persistencia.ClienteDao;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		BeanFactory ctx = new ClassPathXmlApplicationContext("a01_ctx.xml");
		
		ClienteDao cDao = ctx.getBean("clienteDao", ClienteDao.class);
		
		System.out.println(cDao.findById(75));
		System.out.println(cDao);
		System.out.println();

		ClienteDao otro = ctx.getBean("clienteDao", ClienteDao.class);
		System.out.println(otro.findById(75));
		System.out.println(otro);
	}

}
