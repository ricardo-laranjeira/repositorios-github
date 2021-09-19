package com.example.repositoriesgithub.domain

import com.example.repositoriesgithub.core.UseCase
import com.example.repositoriesgithub.data.model.Repo
import com.example.repositoriesgithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}