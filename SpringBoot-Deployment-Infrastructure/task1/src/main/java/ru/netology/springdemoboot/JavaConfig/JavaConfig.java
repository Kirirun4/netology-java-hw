package ru.netology.springdemoboot.JavaConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springdemoboot.Profile.DevProfile;
import ru.netology.springdemoboot.Profile.ProductionProfile;
import ru.netology.springdemoboot.Profile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {

        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {

        return new ProductionProfile();
    }
}