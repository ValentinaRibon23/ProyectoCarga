package com.upc.cargadirecta.retrofit;

import com.upc.cargadirecta.models.FCMBody;
import com.upc.cargadirecta.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAg6ttj9E:APA91bH-0lpj8Eu7wAh5wtOWLOn8QxADQQfXQHRkfuM-bK2b48lfJ3c3iwPBxOb30x3z7ziqzJIkTQVmciG8Gxhdj_zkekgvPKBadXvY_a1D2rHQ7vqY9aYJ4l3B4uph1mq4AfBMDXEs"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}
