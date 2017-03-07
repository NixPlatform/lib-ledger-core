// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#pragma once

#include <functional>
#include <iostream>
#include <string>

namespace ledger { namespace core { namespace api {

enum class BitcoinLikeFeePolicy : int {
    PER_BYTE,
    PER_KBYTE,
};
std::string to_string(const BitcoinLikeFeePolicy& bitcoinLikeFeePolicy);
std::ostream &operator<<(std::ostream &os, const BitcoinLikeFeePolicy &o);

} } }  // namespace ledger::core::api

namespace std {

template <>
struct hash<::ledger::core::api::BitcoinLikeFeePolicy> {
    size_t operator()(::ledger::core::api::BitcoinLikeFeePolicy type) const {
        return std::hash<int>()(static_cast<int>(type));
    }
};

}  // namespace std
