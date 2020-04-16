package com.playworld.assignment.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.playworld.assignment.network.BackEndApi
import com.playworld.assignment.network.WebServiceClient
import org.json.JSONArray
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardViewModel(application: Application) : AndroidViewModel(application),
    Callback<JSONArray> {

    //var progressDialog: SingleLiveEvent<Boolean>? = null
    var storyListing: MutableLiveData<JSONArray>? = null

    init {

        //progressDialog = SingleLiveEvent<Boolean>()
        storyListing = MutableLiveData<JSONArray>()
    }


    fun loadStories() {
        //progressDialog?.value = true
        WebServiceClient.client.create(BackEndApi::class.java).STORIES().execute().isSuccessful

    }

    override fun onResponse(call: Call<JSONArray>?, response: Response<JSONArray>?) {
        //progressDialog?.value = false
        storyListing?.value = response?.body()

    }

    override fun onFailure(call: Call<JSONArray>?, t: Throwable?) {
        //progressDialog?.value = false

    }

}