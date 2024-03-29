package com.seunggyu.stitch.data.model

import com.seunggyu.stitch.data.RetrofitApi

object UserRepository {
    /**
     * 로그인을 위한 Repository
     * RemoteDataSource의 retrofit 인스턴스 service에 초기화
     * login 함수 호출 시 RetrofitService의 login 함수 호출해 네트워크 통신 수행
     */
    private val service = RetrofitApi.retrofitService

    suspend fun getUser(user: User) = service.getUserData(user.id)
}
