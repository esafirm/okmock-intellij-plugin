package com.github.esafirm.okmockintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.esafirm.okmockintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
