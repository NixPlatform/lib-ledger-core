// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from dynamic.djinni

#include "DynamicType.hpp"  // my header
#include "enum_from_string.hpp"

namespace ledger { namespace core { namespace api {

std::string to_string(const DynamicType& dynamicType) {
    switch (dynamicType) {
        case DynamicType::OBJECT: return "OBJECT";
        case DynamicType::INT32: return "INT32";
        case DynamicType::INT64: return "INT64";
        case DynamicType::DOUBLE: return "DOUBLE";
        case DynamicType::BOOLEAN: return "BOOLEAN";
        case DynamicType::DATA: return "DATA";
        case DynamicType::ARRAY: return "ARRAY";
        case DynamicType::STRING: return "STRING";
        case DynamicType::UNDEFINED: return "UNDEFINED";
    };
};
template <>
DynamicType from_string(const std::string& dynamicType) {
    if (dynamicType == "OBJECT") return DynamicType::OBJECT;
    else if (dynamicType == "INT32") return DynamicType::INT32;
    else if (dynamicType == "INT64") return DynamicType::INT64;
    else if (dynamicType == "DOUBLE") return DynamicType::DOUBLE;
    else if (dynamicType == "BOOLEAN") return DynamicType::BOOLEAN;
    else if (dynamicType == "DATA") return DynamicType::DATA;
    else if (dynamicType == "ARRAY") return DynamicType::ARRAY;
    else if (dynamicType == "STRING") return DynamicType::STRING;
    else return DynamicType::UNDEFINED;
};

std::ostream &operator<<(std::ostream &os, const DynamicType &o)
{
    switch (o) {
        case DynamicType::OBJECT:  return os << "OBJECT";
        case DynamicType::INT32:  return os << "INT32";
        case DynamicType::INT64:  return os << "INT64";
        case DynamicType::DOUBLE:  return os << "DOUBLE";
        case DynamicType::BOOLEAN:  return os << "BOOLEAN";
        case DynamicType::DATA:  return os << "DATA";
        case DynamicType::ARRAY:  return os << "ARRAY";
        case DynamicType::STRING:  return os << "STRING";
        case DynamicType::UNDEFINED:  return os << "UNDEFINED";
    }
}

} } }  // namespace ledger::core::api
