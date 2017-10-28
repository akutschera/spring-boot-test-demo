package com.github.akutschera.data.jpatest;

/**
 * Created by Andreas Kutschera.
 */

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
// not really necessary because it is excluded in application.properties
// just here to show that how it is done on a per-test basis
@SpringBootTest( properties = {
        "spring.jpa.properties.hibernate.show_sql=false"
})
@DataJpaTest
public class SamePackageRepositoryTest {

    @Autowired
    private SamePackageRepository samePackageRepository;

    @Test
    public void atStartRepositoryIsEmpty() throws Exception {
        assertThat( samePackageRepository.count() ).isEqualTo( 0L );
    }

}
