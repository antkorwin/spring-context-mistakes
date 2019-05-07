package com.antkorwin.heisenbug.contextmistakes.fail;

import com.antkorwin.heisenbug.contextmistakes.service.TemplateService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 05.05.2019.
 *
 * @author Korovin Anatoliy
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class BTest {

    @Autowired
    private TemplateService templateService;

    @Test
    void testBuild() {
        String result = templateService.build("%d + %d = %d",
                                              1, 2, 3);
        assertThat(result).isEqualTo("1 + 2 = 3");
    }
}
