package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.WebApplicationInitializer;

import hello.entity.User;
import hello.repository.UserRepository;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		// 测试数据，启动时添加
		return (args) -> {
			repository.save(new User("user1", "email1@example.com"));
			repository.save(new User("user2", "email2@example.com"));
			repository.save(new User("user3", "email3@example.com"));
			repository.save(new User("Jack", "jack@example.com"));
			repository.save(new User("Rose", "rose@example.com"));
		};
	}

}
