package com.example.teamwork.data.api

import com.example.teamwork.data.models.Country
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


//запросы в интернете это endPoints
interface RestCountriesService {
    /*Внизу endPoint(запрос) чтобы получить города по имени. То есть внизу функция для получения
    города по его миени*/
    @GET("name/{cca2}")
    suspend fun getCountryByName(@Path("cca2") cityName: String): List<Country>
}

var retrofit: Retrofit = Retrofit.Builder()
    .baseUrl("https://restcountries.com/v3.1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

var restCountriesApi: RestCountriesService = retrofit.create(RestCountriesService::class.java)