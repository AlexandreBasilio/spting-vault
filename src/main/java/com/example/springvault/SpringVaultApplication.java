package com.example.springvault;

import hello.MyConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class SpringVaultApplication  {

//    private final MyConfiguration configuration;
//
//    public SpringVaultApplication(MyConfiguration configuration) {
//        this.configuration = configuration;
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringVaultApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Logger logger = LoggerFactory.getLogger(SpringVaultApplication.class);
//
//        logger.info("----------------------------------------");
//        logger.info("Configuration properties");
//        logger.info("   example.username is {}", configuration.getUsername());
//        logger.info("   example.password is {}", configuration.getPassword());
//        logger.info("----------------------------------------");
//    }

    @Bean
    ApplicationRunner applicationRunner(MyConfiguration myconfig) {
        return args -> {
            log.info("msg from vault -  password=" + myconfig.getPassword() + " user=" + myconfig.getUsername());
        };
    }
}
