package com.micky.gradle;

import org.gradle.api.*;

class MyCustomPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.task('customTask', type: MyCustomTask)
	}
}
