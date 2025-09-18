package cursogetafe.dianotaciones.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Profile({"desarollo", "default"})
@Configuration
@PropertySource("classpath:app.properties")
public class A05DesarolloConfig {
	
	
	@Autowired
	Environment prop;
	

	
	@Bean("datasource")
	public DataSource getDsDesarollo(){
		BasicDataSource bds = new BasicDataSource();
		
		bds.setUrl(prop.getProperty("test.bbdd.url"));
		bds.setDriverClassName(prop.getProperty("test.bbdd.driver"));
		bds.setUsername(prop.getProperty("test.bbdd.user"));
		bds.setPassword(prop.getProperty("test.bbdd.pass"));
		
		return bds;
	}
}
