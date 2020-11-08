package com.github.moathalshorman.intellijstories.services

import com.intellij.openapi.project.Project
import com.github.moathalshorman.intellijstories.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
