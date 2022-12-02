package hello;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "example")
@Data
public class MyConfiguration {

    private String username;
    private String password;
}
