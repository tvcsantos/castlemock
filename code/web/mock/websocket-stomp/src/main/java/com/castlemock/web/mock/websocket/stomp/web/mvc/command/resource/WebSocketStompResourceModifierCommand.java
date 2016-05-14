/*
 * Copyright 2016 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.castlemock.web.mock.websocket.stomp.web.mvc.command.resource;

/**
 * The WebSocketStompResourceModifierCommand is used when the user want to set the same status
 * to multiple WebSocket Stomp resources
 * @author Karl Dahlgren
 * @since 1.5
 */
public class WebSocketStompResourceModifierCommand {

    private String webSocketStompResourceStatus;
    private String[] webSocketStompResourceIds;

    public String getWebSocketStompResourceStatus() {
        return webSocketStompResourceStatus;
    }

    public void setWebSocketStompResourceStatus(String webSocketStompResourceStatus) {
        this.webSocketStompResourceStatus = webSocketStompResourceStatus;
    }

    public String[] getWebSocketStompResourceIds() {
        return webSocketStompResourceIds;
    }

    public void setWebSocketStompResourceIds(String[] webSocketStompResourceIds) {
        this.webSocketStompResourceIds = webSocketStompResourceIds;
    }
}
