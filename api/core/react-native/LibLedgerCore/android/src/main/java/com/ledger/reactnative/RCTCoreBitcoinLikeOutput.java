// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.BitcoinLikeOutput;
import co.ledger.core.BitcoinLikeScript;
import co.ledger.core.DerivationPath;
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

/**Class representing Bitcoin outputs */
public class RCTCoreBitcoinLikeOutput extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeOutput> javaObjects;
    public Map<String, BitcoinLikeOutput> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeOutput(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeOutput>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeOutput";
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
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeOutput", "First parameter of RCTCoreBitcoinLikeOutput::release should be an instance of RCTCoreBitcoinLikeOutput");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeOutput> elem : this.javaObjects.entrySet())
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
     *Get transaction hash in which output was 'created'
     *@return String, transaction hash containing output
     */
    @ReactMethod
    public void getTransactionHash(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getTransactionHash();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get index of output in list of all outputs contained in same transaction
     *@return 32 bits integer, index of output
     */
    @ReactMethod
    public void getOutputIndex(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getOutputIndex();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get amount of output
     *@return Amount object, amount of output
     */
    @ReactMethod
    public void getValue(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            Amount javaResult = currentInstanceObj.getValue();

            String uuid = UUID.randomUUID().toString();
            RCTCoreAmount rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreAmount.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreAmount");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get script (witness script) cryptographic puzzle that determines the conditions to spend the output
     *@return in Bytes (variable size depending on type of script P2PKH, P2SH), locking script to spend UTXO
     */
    @ReactMethod
    public void getScript(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getScript();
            WritableNativeMap result = new WritableNativeMap();
            String finalJavaResult = new String(javaResult);
            result.putString("value", finalJavaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void parseScript(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeScript javaResult = currentInstanceObj.parseScript();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeScript rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeScript.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeScript");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get address that spent the output
     *@return Optional String, address that spent
     */
    @ReactMethod
    public void getAddress(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getAddress();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void getDerivationPath(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            BitcoinLikeOutput currentInstanceObj = this.javaObjects.get(sUid);

            DerivationPath javaResult = currentInstanceObj.getDerivationPath();

            String uuid = UUID.randomUUID().toString();
            RCTCoreDerivationPath rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreDerivationPath.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreDerivationPath");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
