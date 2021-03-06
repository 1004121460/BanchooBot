package org.banchoobot.sdk.interfaces

import org.banchoobot.frame.qq.deserializer.events.Message

/**
 * 消息功能
 */
interface IMessageFunction {
    fun onMessage(event: Message)
}