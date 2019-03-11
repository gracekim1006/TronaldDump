package com.example.tronalddump;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface TronaldDumpService {
    @Headers("accept: application/hal+json")
    @GET("search/quote")
    Call<QuoteResponse2> searchQuotes(
            @Query("query") String search,
            @Query("page") int page,
            @Query("size") int pageSize);
}
