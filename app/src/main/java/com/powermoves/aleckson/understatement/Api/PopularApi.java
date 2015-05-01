package com.powermoves.aleckson.understatement.Api;

import com.powermoves.aleckson.understatement.POJO.TvShow;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by aleckson on 4/28/2015.
 */
public interface PopularApi {

    @GET("/tv/popular")
    public  void getShow(
            @Query("api_key") String key,
            @Query("page") String page,
            Callback<TvShow> response

    );
}
