package com.example.recyclerviewmvvm

class MoviesRepository(
    private val api: MoviesApi
) : SafeApiRequest() {

    suspend fun getMovies() = apiRequest { api.getMovies() }

}