package com.example.andrzejz.kotlinproject.network.traits

import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.singletons.Constants
import retrofit.Callback
import retrofit.RestAdapter
import retrofit.http.GET
import rx.Observable
import java.util.*

/**
 * Created by Andrzej Z on 7/16/2015.
 */

interface ApiService {

    @GET(Constants.ENDPOINT)
    fun getGoogle(): Observable<IpResponse>

}