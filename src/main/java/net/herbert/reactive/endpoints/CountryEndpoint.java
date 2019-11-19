package net.herbert.reactive.endpoints;

import net.herbert.reactive.model.Country;
import net.herbert.reactive.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/countries")
public class CountryEndpoint {

    @GetMapping
    public Flux<Country> getAll() {
        return countryRepository.findAll();
    }

    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    private final CountryRepository countryRepository;
}
