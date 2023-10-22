package pro.fessional.wings.issue142.service;


import jakarta.annotation.PostConstruct;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author trydofor
 * @since 2023-10-22
 */
public class Service142Impl2 implements Service142 {

    private static final Log logger = LogFactory.getLog(Service142Impl2.class);
    @Override
    public Class<? extends Service142> who() {
        logger.info("Service142Impl2");
        return this.getClass();
    }

    @PostConstruct
    public void postConstruct() {
        logger.info(">>> Service142Impl2.postConstruct");
    }
}
