package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;

/**
 * Event emitted when there is an error in loading.
 */
public class TopLoadingErrorEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topLoadingError";

    public TopLoadingErrorEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
