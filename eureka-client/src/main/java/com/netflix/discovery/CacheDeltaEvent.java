package com.netflix.discovery;

import com.netflix.appinfo.InstanceInfo;

public class CacheDeltaEvent extends DiscoveryEvent {
    private final InstanceInfo instance;

    public CacheDeltaEvent(InstanceInfo instance)  {
        super();
        this.instance = instance;
    }
}
