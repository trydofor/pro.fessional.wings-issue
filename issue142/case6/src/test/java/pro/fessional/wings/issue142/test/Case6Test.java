package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case6Test {

    @Test
    void notExcepted() {
        AssertService142Helper.notExcepted("`@Import` with `@AutoConfiguration` and `@AutoConfigureOrder` and `@Order`");
    }
}
