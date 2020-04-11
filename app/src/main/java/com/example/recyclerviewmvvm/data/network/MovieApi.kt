package com.example.recyclerviewmvvm.data.network

import com.example.recyclerviewmvvm.data.models.Movie
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MoviesApi {

    @GET("movies")
    suspend fun getMovies() : Response<List<Movie>>

    companion object{
        operator fun invoke() : MoviesApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://us-central1-fir-api-2deff.cloudfunctions.net/app/api/")
                .build()
                .create(MoviesApi::class.java)
        }
    }
}