package com.github.infrmods.xbus.client;

import com.github.infrmods.xbus.item.Config;
import com.github.infrmods.xbus.exceptions.XBusException;

/**
 * Created by lolynx on 6/11/16.
 */
interface ConfigClient {
    Config getConfig(String name) throws XBusException;

    void putConfig(String name, String value) throws XBusException;

    void putConfig(String name, String value, Long currentVersion) throws XBusException;

    Config watchConfig(String name) throws XBusException;

    Config watchConfig(String name, Integer timeout) throws XBusException;
}