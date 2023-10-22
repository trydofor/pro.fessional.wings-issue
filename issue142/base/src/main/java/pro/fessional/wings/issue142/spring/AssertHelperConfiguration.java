package pro.fessional.wings.issue142.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pro.fessional.wings.issue142.service.Service142;
import pro.fessional.wings.issue142.test.AssertService142Helper;

/**
 * @author trydofor
 * @since 2023-10-23
 */
@Configuration
public class AssertHelperConfiguration {

    private static final Log logger = LogFactory.getLog(AssertHelperConfiguration.class);

    @Autowired
    public void autowireAssertHelper(Service142 service142) {
        logger.info(">>> autowireAssertHelper");
        AssertService142Helper.setService142(service142);
    }
}
