package com.upc.cargadirecta.providers;

import com.upc.cargadirecta.models.FCMBody;
import com.upc.cargadirecta.models.FCMResponse;
import com.upc.cargadirecta.retrofit.IFCMApi;
import com.upc.cargadirecta.retrofit.RetrofitClient;
import com.upc.cargadirecta.R;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
