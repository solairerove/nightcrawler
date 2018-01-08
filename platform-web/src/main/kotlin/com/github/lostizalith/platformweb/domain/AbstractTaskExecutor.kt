package com.github.lostizalith.platformweb.domain

/**
 * Basic task running due configuration.
 */
abstract class AbstractTaskExecutor : TaskExecutor {

    override fun execute(task: Task): Result {
        return resolveResult(task.id, task.configuration)
    }

    protected abstract fun resolveResult(taskId: String, configuration: TaskConfiguration): Result
}