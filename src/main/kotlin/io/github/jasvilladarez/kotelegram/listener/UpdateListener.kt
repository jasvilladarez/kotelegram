/*
 * Copyright 2017 Jasmine Villadarez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jasvilladarez.kotelegram.listener

import io.github.jasvilladarez.kotelegram.model.Message

interface UpdateListener {

    /**
     * Called when a new message is received
     */
    fun onMessageReceived(message: Message)

    /**
     * Called when an error occurred while performing an operation
     *
     * Not required to implement
     */
    fun onError(error: Throwable) {}
}