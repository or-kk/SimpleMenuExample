package com.example.simplemenuexample.models.api

import com.example.simplemenuexample.models.data.TestUserData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/api/v1/users")
    fun getUsers(): Call<TestUserData>
}