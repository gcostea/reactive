package net.herbert.reactive.repository;

import net.herbert.reactive.model.Country;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CountryRepository extends ReactiveCrudRepository<Country, Long> {
}
