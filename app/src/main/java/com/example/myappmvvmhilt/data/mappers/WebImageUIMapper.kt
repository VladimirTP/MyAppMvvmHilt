package com.example.myappmvvmhilt.data.mappers

import com.example.myappmvvmhilt.data.models.WebImageResponse
import com.example.myappmvvmhilt.domain.WebImageUIData
import javax.inject.Inject

class WebImageUIMapper @Inject constructor() {

    operator fun invoke(response: WebImageResponse): WebImageUIData = with(response) {
        WebImageUIData(
            url = url.orEmpty()
        )
    }
}