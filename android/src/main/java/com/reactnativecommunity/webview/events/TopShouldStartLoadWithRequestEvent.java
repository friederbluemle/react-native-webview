package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;

/**
 * Event emitted when shouldOverrideUrlLoading is called.
 */
public class TopShouldStartLoadWithRequestEvent extends NonCoalescingEvent {
    public static final String EVENT_NAME = "topShouldStartLoadWithRequest";

    public TopShouldStartLoadWithRequestEvent(int viewId, WritableMap eventData) {
        super(viewId, eventData, EVENT_NAME);
        mEventData.putString("navigationType", "other");
    }
}
