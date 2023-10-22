package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case7Test {

    @Test
    void notExcepted() {
        AssertService142Helper.notExcepted("`META-INF/..AutoConfiguration.imports` with `@Configuration` and `@Order`");
    }
}
