package com.example.myappmvvmhilt

import com.example.myappmvvmhilt.data.models.WebImageResponse
import javax.inject.Inject

class Server @Inject constructor() {

    fun getImage() =
        WebImageResponse("https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/25dcb99b-15b9-4af8-ac2b-deccfce2b369/1920x")
}