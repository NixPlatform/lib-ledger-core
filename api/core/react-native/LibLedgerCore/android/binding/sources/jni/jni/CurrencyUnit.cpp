// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

#include "CurrencyUnit.hpp"  // my header
#include "Marshal.hpp"

namespace djinni_generated {

CurrencyUnit::CurrencyUnit() = default;

CurrencyUnit::~CurrencyUnit() = default;

auto CurrencyUnit::fromCpp(JNIEnv* jniEnv, const CppType& c) -> ::djinni::LocalRef<JniType> {
    const auto& data = ::djinni::JniClass<CurrencyUnit>::get();
    auto r = ::djinni::LocalRef<JniType>{jniEnv->NewObject(data.clazz.get(), data.jconstructor,
                                                           ::djinni::get(::djinni::String::fromCpp(jniEnv, c.name)),
                                                           ::djinni::get(::djinni::String::fromCpp(jniEnv, c.symbol)),
                                                           ::djinni::get(::djinni::String::fromCpp(jniEnv, c.code)),
                                                           ::djinni::get(::djinni::I32::fromCpp(jniEnv, c.numberOfDecimal)))};
    ::djinni::jniExceptionCheck(jniEnv);
    return r;
}

auto CurrencyUnit::toCpp(JNIEnv* jniEnv, JniType j) -> CppType {
    ::djinni::JniLocalScope jscope(jniEnv, 5);
    assert(j != nullptr);
    const auto& data = ::djinni::JniClass<CurrencyUnit>::get();
    return {::djinni::String::toCpp(jniEnv, (jstring)jniEnv->GetObjectField(j, data.field_name)),
            ::djinni::String::toCpp(jniEnv, (jstring)jniEnv->GetObjectField(j, data.field_symbol)),
            ::djinni::String::toCpp(jniEnv, (jstring)jniEnv->GetObjectField(j, data.field_code)),
            ::djinni::I32::toCpp(jniEnv, jniEnv->GetIntField(j, data.field_numberOfDecimal))};
}

}  // namespace djinni_generated
