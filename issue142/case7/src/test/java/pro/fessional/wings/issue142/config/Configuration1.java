package pro.fessional.wings.issue142.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import pro.fessional.wings.issue142.service.Service142;
import pro.fessional.wings.issue142.service.Service142Impl1;

/**
 * @author trydofor
 * @since 2023-10-22
 */

@Configuration(proxyBeanMethods = false)
@Order(2)
public class Configuration1 {

    @Bean
    @Order(2)
    @ConditionalOnMissingBean(Service142.class)
    public Service142 service142() {
        return new Service142Impl1();
    }
}
