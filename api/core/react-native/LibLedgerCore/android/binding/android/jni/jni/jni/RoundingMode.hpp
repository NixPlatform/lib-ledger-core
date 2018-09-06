// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

#ifndef DJINNI_GENERATED_ROUNDINGMODE_HPP_JNI_
#define DJINNI_GENERATED_ROUNDINGMODE_HPP_JNI_

#include "../../include/RoundingMode.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class RoundingMode final : ::djinni::JniEnum {
public:
    using CppType = ::ledger::core::api::RoundingMode;
    using JniType = jobject;

    using Boxed = RoundingMode;

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return static_cast<CppType>(::djinni::JniClass<RoundingMode>::get().ordinal(jniEnv, j)); }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, CppType c) { return ::djinni::JniClass<RoundingMode>::get().create(jniEnv, static_cast<jint>(c)); }

private:
    RoundingMode() : JniEnum("RoundingMode") {}
    friend ::djinni::JniClass<RoundingMode>;
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_ROUNDINGMODE_HPP_JNI_
