package cursogetafe.dianotaciones.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan({"cursogetafe.dianotaciones.test5"})
@Import({A05DesarolloConfig.class, A05ProduccionConfig.class})
public class A05Config {
	
	
	
}
