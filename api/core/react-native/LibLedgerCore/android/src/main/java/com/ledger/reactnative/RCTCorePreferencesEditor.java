// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

package com.ledger.reactnative;

import co.ledger.core.PreferencesEditor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/** Interface for editting Preferences. All changes to the editor are persisted to the disk only when comitted. */
public class RCTCorePreferencesEditor extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, PreferencesEditor> javaObjects;
    public Map<String, PreferencesEditor> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCorePreferencesEditor(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, PreferencesEditor>();
    }

    @Override
    public String getName()
    {
        return "RCTCorePreferencesEditor";
    }
    @ReactMethod
    public void release(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCorePreferencesEditor", "First parameter of RCTCorePreferencesEditor::release should be an instance of RCTCorePreferencesEditor");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, PreferencesEditor> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putString(Map<String, String> currentInstance, String key, String value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putString(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putInt(Map<String, String> currentInstance, String key, int value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putInt(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putLong(Map<String, String> currentInstance, String key, long value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putLong(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putBoolean(Map<String, String> currentInstance, String key, boolean value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putBoolean(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putStringArray(Map<String, String> currentInstance, String key, ArrayList<String> value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putStringArray(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void putData(Map<String, String> currentInstance, String key, byte[] value, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.putData(key, value);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Removes the data associated with the given key.
     * @param key The key to remove from the Preferences
     * @return The reference of self in order to chain the call to the editor.
     */
    @ReactMethod
    public void remove(Map<String, String> currentInstance, String key, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            PreferencesEditor javaResult = currentInstanceObj.remove(key);

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferencesEditor rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferencesEditor.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCorePreferencesEditor");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Persists the changes to the Preferences. */
    @ReactMethod
    public void commit(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            PreferencesEditor currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.commit();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
