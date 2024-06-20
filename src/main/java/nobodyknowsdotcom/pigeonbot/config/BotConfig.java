package nobodyknowsdotcom.pigeonbot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app.bot")
public class BotConfig {
    private String token;
    private String name;
}
