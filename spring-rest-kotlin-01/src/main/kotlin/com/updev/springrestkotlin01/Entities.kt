package com.updev.springrestkotlin01

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Article(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String,
    var content: String,
    var createdAt: LocalDateTime = LocalDateTime.now(),

    // https://blog/my-first-title My First Title
    val slug: String = title.toSlug()
)