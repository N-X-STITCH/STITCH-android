package com.seunggyu.stitch.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private var _googleEmail = MutableLiveData<String>()
    private var _googleToken = MutableLiveData<String>()
    private var _googleTokenAuth = MutableLiveData<String>()
    private var _googleNickName = MutableLiveData<String>()
    private var _googlePhotoUrl = MutableLiveData<String>()
    private var _googleId = MutableLiveData<String>()
    private var _kakaoId = MutableLiveData<String>()
    private var _kakaoNickName = MutableLiveData<String>()
    private var _kakaoPhotoUrl = MutableLiveData<String>()

    val googleEmail: LiveData<String>
        get() = _googleEmail

    val googleToken: LiveData<String>
        get() = _googleToken

    val googleTokenAuth: LiveData<String>
        get() = _googleTokenAuth

    val googleNickName: LiveData<String>
        get() = _googleNickName

    val googlePhotoUrl: LiveData<String>
        get() = _googlePhotoUrl

    val googleId: LiveData<String>
        get() = _googleId

    val kakaoId: LiveData<String>
        get() = _kakaoId

    val kakaoNickName: LiveData<String>
        get() = _kakaoNickName

    val kakaoPhotoUrl: LiveData<String>
        get() = _kakaoPhotoUrl

    init {
        _googleEmail.value = ""
        _googleToken.value = ""
        _googleTokenAuth.value = ""
        _googleNickName.value = ""
        _googlePhotoUrl.value = ""
        _googleId.value = ""
        _kakaoId.value = ""
        _kakaoNickName.value = ""
        _kakaoPhotoUrl.value = ""
    }

    fun setGoogleEmail(email: String) {
        _googleEmail.value = email
    }

    fun getGoogleEmail() : String {
        return _googleEmail.value.toString()
    }

    fun setGoogleToken(token: String) {
        _googleToken.value = token
    }

    fun getGoogleToken() : String {
        return _googleToken.value.toString()
    }

    fun setGoogleTokenAuth(tokenAuth: String) {
        _googleTokenAuth.value = tokenAuth
    }

    fun getGoogleTokenAuth() : String {
        return _googleTokenAuth.value.toString()
    }

    fun setGoogleNickName(name: String) {
        _googleNickName.value = name
    }

    fun getGoogleNickName() : String {
        return _googleNickName.value.toString()
    }

    fun setGooglePhotoUrl(photoUrl: String) {
        _googlePhotoUrl.value = photoUrl
    }

    fun getGooglePhotoUrl() : String {
        return _googlePhotoUrl.value.toString()
    }

    fun setGoogleId(id: String) {
        _googleId.value = id
    }

    fun getGoogleId() : String {
        return _googleId.value.toString()
    }
    fun setKakaoId(email: String) {
        _kakaoId.value = email
    }

    fun getKakaoId() : String {
        return _kakaoId.value.toString()
    }

    fun setKakaoNickName(name: String) {
        _kakaoNickName.value = name
    }

    fun getKakaoNickName() : String {
        return _kakaoNickName.value.toString()
    }

    fun setKakaoPhotoUrl(photoUrl: String) {
        _kakaoPhotoUrl.value = photoUrl
    }

    fun getKakaoPhotoUrl() : String {
        return _kakaoPhotoUrl.value.toString()
    }
}