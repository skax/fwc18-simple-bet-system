package eu.bambz.fwc18simplebetsystem.domain.bets.common;


import lombok.Value;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
@Value
public class MatchTime {

    private static final int TIME_OFFSET = 10;

    private LocalDateTime time;

    public boolean canBet(LocalDateTime now) {
        return now.plusMinutes(TIME_OFFSET).isBefore(time);
    }

}
