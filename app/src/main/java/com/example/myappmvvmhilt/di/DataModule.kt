package com.example.myappmvvmhilt.di

import com.example.myappmvvmhilt.data.WebImageRepositoryImpl
import com.example.myappmvvmhilt.domain.WebImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun getRepository(impl: WebImageRepositoryImpl): WebImageRepository
}