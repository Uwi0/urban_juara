package com.kakapo.kotlin.urbanjuara.di

import com.kakapo.kotlin.urbanjuara.common.Constants
import com.kakapo.kotlin.urbanjuara.data.remote.UrbanJuaraApi
import com.kakapo.kotlin.urbanjuara.data.repositories.UrbanJuaraRepositoryImpl
import com.kakapo.kotlin.urbanjuara.domain.repositories.UrbanJuaraRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUrbanJuaraApi(): UrbanJuaraApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UrbanJuaraApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUrbanJuaraReposritory(api: UrbanJuaraApi): UrbanJuaraRepository{
        return UrbanJuaraRepositoryImpl(api)
    }
}