package com.powermoves.aleckson.understatement.Util;

import android.content.Context;

import com.powermoves.aleckson.understatement.Api.PopularApi;
import com.powermoves.aleckson.understatement.POJO.TvShow;
import com.powermoves.aleckson.understatement.R;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by aleckson on 4/29/2015.
 */
public class RestClient {

    private static PopularApi popularApi;
    public static final String SHOW_ENDPOINT = "http://api.themoviedb.org/3";
    private final Context context;


    public RestClient(Context context) {
        this.context = context;
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(SHOW_ENDPOINT)
                .build();
        popularApi = restAdapter.create(PopularApi.class);
        popularApi.getShow(context.getResources().getString(R.string.tmdb_key),
                "2", new Callback<TvShow>(){

                    @Override
                    public void success(TvShow tvShow, Response response) {



                    }

                    @Override
                    public void failure(RetrofitError error) {
                        error.printStackTrace();

                    }
                });


    }

    public PopularApi getPopularApi() {
        return popularApi;
    }


}
