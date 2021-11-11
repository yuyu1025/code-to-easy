package com.github.yuyu1025.codetoeasy.services

import com.intellij.openapi.project.Project
import com.github.yuyu1025.codetoeasy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
