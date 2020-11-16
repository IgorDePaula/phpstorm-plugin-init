package com.github.igordepaula.phpstormplugininit.services

import com.intellij.openapi.project.Project
import com.github.igordepaula.phpstormplugininit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
