package com.example.livescores;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FootballApiService
{

    @GET("/Competition")
     Call<FootballResponse> getCompetition(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Match")
     Call<FootballResponse> getMatch(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Standing")
    Call<FootballResponse> getStanding(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Team")
    Call<FootballResponse> getTeam(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Scorers")
    Call<FootballResponse> getScorers(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Areas")
    Call<FootballResponse> getAreas(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);

    @GET("/Player")
    Call<FootballResponse> getPlayer(@Query("4e7a0df68861459680cceafe8941e296") String apiKey);
}
