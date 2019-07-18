package com.example.livescores;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;
        import android.util.Log;

        import java.util.List;

        import retrofit2.Call;
        import retrofit2.Callback;
        import retrofit2.Retrofit;
        import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final String BASE_URL = "http://api.football-data.org/v2/";
    private static Retrofit retrofit = null;
    private RecyclerView recyclerView = null;
    private final static String API_KEY = "4e7a0df68861459680cceafe8941e296";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        connectAndGetApiData();
    }

    public void connectAndGetApiData(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    FootballApiService footballApiService = retrofit.create(FootballApiService.class);
    Call<FootballResponse> call;
    {
        call = footballApiService.getCompetition(API_KEY);
        call = footballApiService.getMatch(API_KEY);
        call = footballApiService.getAreas(API_KEY);
        call = footballApiService.getStanding(API_KEY);
        call = footballApiService.getTeam(API_KEY);
        call = footballApiService.getPlayer(API_KEY);
        call = footballApiService.getScorers(API_KEY);
    }
    call.enqueue(new Callback<FootballResponse>()
    {

        @Override
        public void onResponse (Call<FootballResponse> call, Response<FootballResponse> response) {
            List<Football> football = response.body().getResults();
            recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, getApplicationContext()));
            Log.d(TAG, "Number of movies received: " + movies.size());

    }   }

}
