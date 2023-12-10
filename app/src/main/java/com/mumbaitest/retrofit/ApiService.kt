package com.mumbaitest.retrofit

import com.mumbaitest.data.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    fun apiHit():Call<ApiResponse>
/*

    @POST("login")
    fun userLogin(@Body request: LoginRequest): Call<LoginResponse>

    @POST("fetchusers")
    fun fetchUserDetails(@Body request: HomePageRequest): Call<HomePageResponse>

    @POST("getallmodeofpay")
    fun getPaymentMode(@Body request: PaymentModeRequest): Call<PaymentModeReponse>

    @POST("topupamtdropdown")
    fun getTopupAmt(@Body request: TopAmtRequest): Call<TopAmtResponse>

    @POST("addmanualtopup")
    fun addManualTopup(@Body request: AddManualTopRequest): Call<AddManualTopResponse>

    @POST("receiveamttopup")
    fun receivedManualTop(@Body request: ReceivedAmtTopRequest): Call<ReceivedAmtTopResponse>

    @POST("getallfranopelist")
    fun getAllFranopeList(@Body request: GetFranListRequest): Call<GetAllFranListResponse>

    @POST("dashboardcountdetail")
    fun dashboardUserDetails(@Body request: DashboardCountDetailsRequest): Call<DashboardCountDetailsResponse>

    @POST("searchuser")
    fun getSearchUserDetails(@Body request: SearchUserRequest): Call<DashboardCountDetailsResponse>

    @POST("getalluserinfo")
    fun getAllUserInfoDetails(@Body request: GetAllUserInfoRequest): Call<GetAllUserInfoResponce>

    @POST("resetpassword")
    fun resetPassword(@Body request: ResetPasswordRequest): Call<ResetPasswordResponse>

    @POST("resetmacaddress")
    fun macReset(@Body request: ResetMacAddressRequest): Call<ResetMacAddressResponse>
*/


}