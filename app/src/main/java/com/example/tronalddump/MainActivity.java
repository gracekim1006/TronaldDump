package com.example.tronalddump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchQuotes();
    }

    private void searchQuotes(){
        /*Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.tronalddump.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TronaldDumpService service =
                retrofit.create(TronaldDumpService.class);

        Call<QuotesResponse> recipeResponseCall =
                service.searchQuotes("Clinton",
                        0, 1);

        recipeResponseCall.enqueue(new Callback<QuotesResponse>() {
            @Override
            public void onResponse(Call<QuotesResponse> call,
                                   Response<QuotesResponse> response) {
                List<Quote2> recipes = response.body().getQuotes();
                Log.d("ENQUEUE", "onResponse: " + recipes.toString());
            }
            @Override
            public void onFailure(Call<QuotesResponse> call,
                                  Throwable t) {
                Log.d("ENQUEUE", "onFailure: " + t.getMessage());
            }
        });*/
    }
}
