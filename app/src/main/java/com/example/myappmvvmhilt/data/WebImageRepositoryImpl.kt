package com.example.myappmvvmhilt.data

import com.example.myappmvvmhilt.Server
import com.example.myappmvvmhilt.data.mappers.WebImageUIMapper
import com.example.myappmvvmhilt.domain.WebImageRepository
import com.example.myappmvvmhilt.domain.WebImageUIData
import javax.inject.Inject

class WebImageRepositoryImpl @Inject constructor(
    private val server: Server,
    private val mapper: WebImageUIMapper
) : WebImageRepository {

    override fun getImage(): WebImageUIData {
        val response = server.getImage()
        return mapper(response)
    }
}