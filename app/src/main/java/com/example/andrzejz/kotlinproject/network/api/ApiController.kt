package com.example.andrzejz.kotlinproject.network.api

import com.example.andrzejz.kotlinproject.network.traits.ApiService
import com.example.andrzejz.kotlinproject.singletons.Constants
import retrofit.RestAdapter

/**
 * Created by Andrzej Z on 7/16/2015.
 */

object ApiController {

    public val api: ApiService = createRestAdapter().create(javaClass<ApiService>())

    fun createRestAdapter(): RestAdapter {
        val restAdapter = RestAdapter.Builder()
                .setEndpoint(Constants.BASE_URL)
                .build()

        return restAdapter
    }

}