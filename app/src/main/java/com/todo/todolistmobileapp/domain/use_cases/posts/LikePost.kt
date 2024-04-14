package com.todo.todolistmobileapp.domain.use_cases.posts

import com.todo.todolistmobileapp.domain.model.Post
import com.todo.todolistmobileapp.domain.repository.PostsRepository
import java.io.File
import javax.inject.Inject

class LikePost @Inject constructor(private val repository: PostsRepository){

    suspend operator fun invoke(idPost: String, idUser: String) = repository.like(idPost, idUser)

}