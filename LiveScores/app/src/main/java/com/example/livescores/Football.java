package com.example.livescores;

import com.google.gson.annotations.SerializedName;

public class Football {
    @SerializedName("Competition")
    private String Competition;

    @SerializedName("Team")
    private String Team;

    @SerializedName("Standings")
    private String Standings;

    @SerializedName("Match")
    private String Match;

    @SerializedName("Scorers")
    private String Scorers;

    @SerializedName("Areas")
    private String Areas;

    @SerializedName("Player")
    private String Player;

    public  Football(String competition,
                     String team,
                     String standings,
                     String match,
                     String scorers,
                     String areas ,
                     String player)

    {
        this.Competition = competition;
        this.Team = team;
        this.Standings = standings;
        this.Match = match;
        this.Scorers = scorers;
        this.Areas = areas;
        this.Player = player;
    }

    public String getCompetition() {
        return Competition;
    }
    public void setCompetition(String competition) {
        this.Competition = competition;
    }

    public String getTeam() {
        return Team;
    }
    public void setTeam(String team) {
        this.Team = team;
    }

    public String getStandings() {
        return Standings;
    }
    public void setStandings(String standings) {
        this.Standings = standings;
    }

    public String getMatch() {
        return Match;
    }
    public void setMatch(String match) {
        this.Match = match;
    }

    public String getScorers() {
        return Scorers;
    }
    public void setScorers(String scorers) {
        this.Scorers = scorers;
    }

    public String getAreas() {
        return Areas;
    }
    public void setAreas(String areas) {
        this.Areas = areas;
    }

    public String getPlayer() {
        return Player;
    }
    public void setPlayer(String player) {
        this.Player = player;
    }
}
