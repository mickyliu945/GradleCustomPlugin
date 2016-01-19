package com.micky.gradle;

import org.gradle.api.*;

class MyNestPluginExtension {
	def receiver = "Kate Zhou"
	def email = "KateZhou@gmail.com"
}

class MyCustomPluginExtension {
	def message = "From MyCustomPluginExtention"
	def sender = "MyCustomPluin"
}

class MyCustomPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.extensions.create('myArgs', MyCustomPluginExtension)
		project.myArgs.extensions.create('nestArgs', MyNestPluginExtension)
		project.task('customTask', type: MyCustomTask)
	}
}
