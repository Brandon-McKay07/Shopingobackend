package cbfsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "cbfsd")	// Enable @Restcontroller, @Service and @Repository annotation 
@EnableJpaRepositories(basePackages = "cbfsd.com.repository")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
@EntityScan(basePackages = "cbfsd.com.entity")		// @Entity classes enable in spring boot 
public class CbfsdSpringBackendRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbfsdSpringBackendRestapiApplication.class, args);
		System.out.println("Server Up");
	}

}

