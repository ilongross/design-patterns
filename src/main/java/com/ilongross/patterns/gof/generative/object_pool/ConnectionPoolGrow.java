package com.ilongross.patterns.gof.generative.object_pool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrow {


    private static List<ConnectionResource> resourceList = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionResourceFromPool() throws Exception {

        if(resourceList.size() > 0) {

            ConnectionResource resource = resourceList.get(resourceList.size() - 1);
            resourceList.remove(resourceList.size() - 1);
            return resource;
        }
        else {
            return new ConnectionResource();
        }
    }

    public static void returnConnectionResourceToPool(ConnectionResource resource) {
        resourceList.add(resource);
    }


}
