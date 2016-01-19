package com.micky.gradle;

import org.gradle.api.*;

class MyCustomPluginExtension {
	def message = "From MyCustomPluginExtention"
	def sender = "MyCustomPluin"
}

class MyCustomPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.extensions.create('myArgs', MyCustomPluginExtension)
		project.task('customTask', type: MyCustomTask)
	}
}
