// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeOperation;
import co.ledger.core.BitcoinLikeTransaction;
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

/**Class representing a Bitcoin Operation */
public class RCTCoreBitcoinLikeOperation extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeOperation> javaObjects;
    public Map<String, BitcoinLikeOperation> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeOperation(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeOperation>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeOperation";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeOperation", "First parameter of RCTCoreBitcoinLikeOperation::release should be an instance of RCTCoreBitcoinLikeOperation");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeOperation> elem : this.javaObjects.entrySet())
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
     *Get operation's transaction
     *@return BitcoinLikeTransaction object
     */
    @ReactMethod
    public void getTransaction(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOperation currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransaction javaResult = currentInstanceObj.getTransaction();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransaction");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
