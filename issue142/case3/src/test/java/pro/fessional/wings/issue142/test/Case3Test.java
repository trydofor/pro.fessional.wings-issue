package pro.fessional.wings.issue142.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Case3Test {

    @Test
    void excepted() {
        AssertService142Helper.excepted("`META-INF/..AutoConfiguration.imports` with `@Configuration` and `@AutoConfigureOrder`");
    }
}
