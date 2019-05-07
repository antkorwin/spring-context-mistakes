package com.antkorwin.heisenbug.contextmistakes.ok;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 06.05.2019.
 *
 * @author Korovin Anatoliy
 */
@DataJpaTest
@ExtendWith(SpringExtension.class)
class CTest {

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void test() {
        assertThat(entityManager).isNotNull();
    }
}
