package com.example.brewdogapp.storage.net

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

const val SERVER_URL = "https://api.punkapi.com/v2/"

private var retrofit: Retrofit? = null
private var gson = Gson()
private var api: PunkApi? = null

fun getRetrofit(): Retrofit {
    if (retrofit == null) {
        retrofit = Retrofit.Builder()
            .baseUrl(SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }
    return retrofit!!
}

fun getApiService(): PunkApi {
    if (api == null) {
        api = getRetrofit().create(PunkApi::class.java)
    }
    return api!!
}
