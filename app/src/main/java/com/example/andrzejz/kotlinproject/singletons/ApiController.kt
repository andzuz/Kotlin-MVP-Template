package com.example.andrzejz.kotlinproject.singletons

import com.example.andrzejz.kotlinproject.network.models.IpResponse
import com.example.andrzejz.kotlinproject.network.traits.ApiService
import com.example.andrzejz.kotlinproject.singletons.Constants
import retrofit.Retrofit
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by Andrzej Z on 7/16/2015.
 */

object ApiController {

    public val api: ApiService = createAdapter().create(ApiService::class.java)

    fun createAdapter(): Retrofit {
        val restAdapter = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .build()

        return restAdapter
    }

    fun getGoogle(): Observable<IpResponse> {
        return api.getGoogle().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

}