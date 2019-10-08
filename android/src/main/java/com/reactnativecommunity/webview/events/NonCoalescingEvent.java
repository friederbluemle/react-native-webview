package com.reactnativecommunity.webview.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

public class NonCoalescingEvent extends Event<NonCoalescingEvent> {
    final WritableMap mEventData;
    private final String mEventName;

    NonCoalescingEvent(int viewId, WritableMap eventData, String eventName) {
        super(viewId);
        mEventData = eventData;
        mEventName = eventName;
    }

    @Override
    public String getEventName() {
        return mEventName;
    }

    @Override
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), mEventData);
    }

    @Override
    public boolean canCoalesce() {
        return false;
    }

    @Override
    public short getCoalescingKey() {
        return 0;
    }
}
