package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;

/**
 * Event emitted when a http error is received from the server.
 */
public class TopHttpErrorEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topHttpError";

    public TopHttpErrorEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
