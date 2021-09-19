package com.example.repositoriesgithub.data.repositories

import com.example.repositoriesgithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}