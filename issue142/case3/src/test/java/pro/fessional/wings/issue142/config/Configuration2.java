package pro.fessional.wings.issue142.config;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.fessional.wings.issue142.service.Service142;
import pro.fessional.wings.issue142.service.Service142Impl2;

/**
 * @author trydofor
 * @since 2023-10-22
 */

@Configuration(proxyBeanMethods = false)
@AutoConfigureOrder(1)
public class Configuration2 {

    @Bean
    @ConditionalOnMissingBean(Service142.class)
    public Service142 service142() {
        return new Service142Impl2();
    }
}
