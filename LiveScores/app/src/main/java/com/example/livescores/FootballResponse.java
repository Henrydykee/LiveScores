package com.example.livescores;

import com.google.gson.annotations.SerializedName;

public class FootballResponse

{
    @SerializedName("competition")
    private int competition;

    @SerializedName("team")
    private int team;

    @SerializedName("standing")
    private int standing;

    @SerializedName("match")
    private int match;

    @SerializedName("scorers")
    private int scorers;

    @SerializedName("areas")
    private int areas;

    @SerializedName("player")
    private int player;
}
