package com.xbus.result;

import com.xbus.item.Config;

/**
 * Created by lolynx on 6/11/16.
 */
public class GetConfigResult extends Result {
    public static class RESPONSE extends Response<GetConfigResult>{}

    public Config config;

    public long revision;
}
