package eu.bambz.fwc18simplebetsystem.domain.bets.query;


import eu.bambz.fwc18simplebetsystem.domain.common.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BetsQueryConfig {

    public BetsQueryFacade betsQueryFacade() {
        return new BetsQueryFacade(new InMemoryBetsQueryRepository(), TimeService.testTimeService());
    }

    @Bean
    public BetsQueryFacade betsQueryFacade(JpaBetsQueryRepository jpaBetsQueryRepository) {
        return new BetsQueryFacade(jpaBetsQueryRepository, TimeService.defaultTimeService());
    }

}
