package com.kaneria.bhargav.ibstest1.configuration;

import com.kaneria.bhargav.ibstest1.business.Provider;
import com.kaneria.bhargav.ibstest1.business.ProviderA;
import com.kaneria.bhargav.ibstest1.business.ProviderB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBeanConfiguration {
    @Bean
    @ConditionalOnProperty(name="provider", havingValue = "providerA")
    Provider getAProvider() {
        return new ProviderA();
    }

    @Bean
    @ConditionalOnProperty(name="provider", havingValue = "providerB")
    Provider getBProvider() {
        return new ProviderB();
    }
}
