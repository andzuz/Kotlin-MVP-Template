package com.example.andrzejz.kotlinproject.singletons

import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.network.traits.ApiService
import com.example.andrzejz.kotlinproject.singletons.Constants
import retrofit.RestAdapter
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by Andrzej Z on 7/16/2015.
 */

object ApiController {

    public val api: ApiService = createRestAdapter().create(ApiService::class.java)

    fun createRestAdapter(): RestAdapter {
        val restAdapter = RestAdapter.Builder()
                .setEndpoint(Constants.BASE_URL)
                .build()

        return restAdapter
    }

    fun getGoogle(): Observable<IpResponse> {
        return api.getGoogle().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

}