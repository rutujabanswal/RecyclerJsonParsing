package com.learn2crack.recyclerjsonparsing;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("marvel")
    Call<JSONResponse> getJSON();
}
