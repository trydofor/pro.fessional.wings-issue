package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case4Test {

    @Test
    void notExcepted() {
        AssertService142Helper.notExcepted("`@ImportAutoConfiguration` with `@Configuration` and `@AutoConfigureOrder` and `@Order`");
    }
}
