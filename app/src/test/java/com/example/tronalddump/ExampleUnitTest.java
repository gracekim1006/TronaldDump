package com.example.tronalddump;

import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_retrofit__calling() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.tronalddump.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TronaldDumpService service =
                retrofit.create(TronaldDumpService.class);

        Call<QuoteResponse2> recipeResponseCall =
                service.searchQuotes("Clinton",
                        1, 5);

        try {
            Response<QuoteResponse2> response = recipeResponseCall.execute();
            System.out.println(response.body().get_embedded().getQuotes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}