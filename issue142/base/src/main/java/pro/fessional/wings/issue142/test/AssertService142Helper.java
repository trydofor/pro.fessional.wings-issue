package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Assertions;
import org.springframework.stereotype.Service;
import pro.fessional.wings.issue142.service.Service142;
import pro.fessional.wings.issue142.service.Service142Impl1;
import pro.fessional.wings.issue142.service.Service142Impl2;

/**
 * @author trydofor
 * @since 2023-10-23
 */
@Service
public class AssertService142Helper {

    private static Service142 service142;

    public static void setService142(Service142 service142) {
        AssertService142Helper.service142 = service142;
    }

    public static void excepted(String message) {
        Assertions.assertEquals(Service142Impl2.class, service142.who(), message);
    }

    public static void notExcepted(String message) {
        Assertions.assertEquals(Service142Impl1.class, service142.who(), message);
    }

    public static void excepted(Class<? extends Service142> excepted, String message) {
        Assertions.assertEquals(excepted, service142.who(), message);
    }
}
