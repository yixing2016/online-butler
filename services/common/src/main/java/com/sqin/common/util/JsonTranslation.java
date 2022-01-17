package com.sqin.common.util;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Sheng, Qin
 * 2022-01-17 14:55
 */
public final class JsonTranslation {
    private static Gson gson = new GsonBuilder().create();

    public static String object2JsonString(Object object) {
        return gson.toJson(object);
    }

    /**
     * @description: support customized strategy to exclusion some fields in object.
     * @param object
     * @param exclusionStrategy
     * @return
     */
    public static String object2JsonStringWithExclusionStrategy(Object object, ExclusionStrategy exclusionStrategy) {
        Gson gson;
        if(exclusionStrategy == null) {
            gson = new GsonBuilder().create();
        } else {
            gson = new GsonBuilder().setExclusionStrategies(exclusionStrategy).create();
        }
        return gson.toJson(object);
    }

}
