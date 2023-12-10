package com.mumbaitest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mumbaitest.data.ApiResponse
import com.mumbaitest.retrofit.APIClient
import com.mumbaitest.retrofit.ApiService
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainVm():ViewModel() {
    var apiService: ApiService = APIClient.getRetrofit().create(ApiService::class.java)
 private val _apiResult1 = MutableLiveData<ApiResponse>()
 val apiResult2 : LiveData<ApiResponse>
     get() = _apiResult1

    fun UserLogin(){
    viewModelScope.launch {
        val call = apiService.apiHit()
        call.enqueue(object:Callback<ApiResponse>{
            override fun onResponse(
                call: Call<ApiResponse>,
                response: Response<ApiResponse>) {
                _apiResult1.postValue(response.body())
                Log.d("MYTAG",response.body()?.total_pages.toString())
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
    }

}