package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case5Test {

    @Test
    void notExcepted() {
        AssertService142Helper.notExcepted("normal boot-app with `@Configuration` and `@AutoConfigureOrder` and `@Order`");
    }
}
