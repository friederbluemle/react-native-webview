package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Event emitted when there is a loading progress event.
 */
public class TopLoadingProgressEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topLoadingProgress";

    public TopLoadingProgressEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
