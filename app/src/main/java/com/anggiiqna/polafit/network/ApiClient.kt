package com.anggiiqna.polafit.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://polafit-cloud-computing-357126485159.asia-southeast2.run.app/"
    private const val BASE_URL_ML = "https://polafit-machine-learning-357126485159.asia-southeast2.run.app/"

    fun create(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    fun createML(): ApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL_ML)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
