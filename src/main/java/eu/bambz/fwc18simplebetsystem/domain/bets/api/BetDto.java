package eu.bambz.fwc18simplebetsystem.domain.bets.api;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class BetDto {

    private long id;
    private LocalDateTime time;
    private TeamDto team1;
    private TeamDto team2;
    private PlayerBetDto player1;
    private PlayerBetDto player2;
    private boolean canBet;

}
