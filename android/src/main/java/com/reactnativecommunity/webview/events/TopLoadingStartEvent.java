package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Event emitted when loading has started.
 */
public class TopLoadingStartEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topLoadingStart";

    public TopLoadingStartEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
