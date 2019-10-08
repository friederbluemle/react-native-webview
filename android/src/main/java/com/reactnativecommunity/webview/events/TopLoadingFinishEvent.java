package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;

/**
 * Event emitted when loading is completed.
 */
public class TopLoadingFinishEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topLoadingFinish";

    public TopLoadingFinishEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
