package org.banchoobot.sdk.entities

import java.io.File

/**
 * 日志类配置
 */
class LoggerConfig (
        val name: String,
        val format: String = "[#thread] #time #name #level - #message",
        val isWritingToFile: Boolean,
        val logFilePath: String = "logs${File.separator}$name.log",
        val createNewFile: Boolean
){
    constructor(clazz: Class<*>, format: String = "[#thread] #time #name #level - #message", isWritingToFile: Boolean = false, createNewFile: Boolean = true)
            : this(clazz.name,
                    format,
                    isWritingToFile,
                    "logs${File.separator}${clazz.simpleName}.log",
                    createNewFile
            )

}
