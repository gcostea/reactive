package net.herbert.reactive.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class CountryRepositoryTest {
    private final CountryRepository countryRepository;

    @Autowired public CountryRepositoryTest(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Test @DisplayName("Test that the country database is not empty")
    public void testThatTheCountryDatabaseIsNotEmpty() {
        countryRepository.count()
                .as(StepVerifier::create)
                .expectNext(3L)
                .verifyComplete();
    }
}