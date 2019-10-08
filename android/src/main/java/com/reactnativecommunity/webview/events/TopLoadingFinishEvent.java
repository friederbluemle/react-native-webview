package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Event emitted when loading is completed.
 */
public class TopLoadingFinishEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topLoadingFinish";

    public TopLoadingFinishEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
    }
}
