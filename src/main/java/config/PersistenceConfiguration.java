package config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:postgresql://localhost:5432/conference_app");
		System.out.println("My Coustom datasource bean");
		return builder.build();
	}
}
