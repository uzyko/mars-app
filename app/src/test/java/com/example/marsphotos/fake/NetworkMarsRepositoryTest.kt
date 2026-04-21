package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import org.junit.Test
import org.junit.Assert.assertEquals
import kotlinx.coroutines.test.runTest

class NetworkMarsRepositoryTest {
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}