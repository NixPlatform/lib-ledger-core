// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#ifndef DJINNI_GENERATED_KEYCHAINENGINES_HPP
#define DJINNI_GENERATED_KEYCHAINENGINES_HPP

#include <string>
#ifndef LIBCORE_EXPORT
    #if defined(_MSC_VER) && _MSC_VER <= 1900
       #include <libcore_export.h>
    #else
       #define LIBCORE_EXPORT
    #endif
#endif

namespace ledger { namespace core { namespace api {

class KeychainEngines {
public:
    virtual ~KeychainEngines() {}

    static LIBCORE_EXPORT std::string const BIP32_P2PKH;

    static LIBCORE_EXPORT std::string const BIP49_P2SH;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_KEYCHAINENGINES_HPP
