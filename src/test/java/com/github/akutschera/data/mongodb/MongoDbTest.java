package com.github.akutschera.data.mongodb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SamePackageMongoRepository.class})
@DataMongoTest
public class MongoDbTest {

    @Autowired
    private SamePackageMongoRepository samePackageRepository;

    @Test
    public void repositoryShouldHaveBeenInitialized() throws Exception {
        assertThat( samePackageRepository.count() ).isEqualTo( 0L );
    }

}

