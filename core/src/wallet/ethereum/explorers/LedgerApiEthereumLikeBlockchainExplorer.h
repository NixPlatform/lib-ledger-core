/*
 *
 * LedgerApiEthereumLikeBlockchainExplorer
 *
 * Created by El Khalil Bellakrid on 29/07/2018.
 *
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Ledger
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


#ifndef LEDGER_CORE_LEDGERAPIETHEREUMLIKEBLOCKCHAINEXPLORER_H
#define LEDGER_CORE_LEDGERAPIETHEREUMLIKEBLOCKCHAINEXPLORER_H

#include <wallet/common/explorers/AbstractLedgerApiBlockchainExplorer.h>
#include <wallet/ethereum/explorers/EthereumLikeBlockchainExplorer.h>
#include <wallet/ethereum/explorers/api/EthereumLikeTransactionsParser.h>
#include <wallet/ethereum/explorers/api/EthereumLikeTransactionsBulkParser.h>
#include <wallet/ethereum/explorers/api/EthereumLikeBlockParser.hpp>
#include <api/EthereumLikeNetworkParameters.hpp>

namespace ledger {
    namespace core {
        using LedgerApiBlockchainExplorer = AbstractLedgerApiBlockchainExplorer<EthereumLikeBlockchainExplorerTransaction, EthereumLikeBlockchainExplorer::TransactionsBulk, EthereumLikeTransactionsParser, EthereumLikeTransactionsBulkParser, EthereumLikeBlockParser, api::EthereumLikeNetworkParameters>;
        class LedgerApiEthereumLikeBlockchainExplorer : public EthereumLikeBlockchainExplorer,
                                                        public LedgerApiBlockchainExplorer,
                                                        public DedicatedContext,
                                                        public std::enable_shared_from_this<LedgerApiEthereumLikeBlockchainExplorer>{
        public:
            LedgerApiEthereumLikeBlockchainExplorer(const std::shared_ptr<api::ExecutionContext>& context,
                                           const std::shared_ptr<HttpClient>& http,
                                           const api::EthereumLikeNetworkParameters& parameters,
                                           const std::shared_ptr<api::DynamicObject>& configuration);
            Future<std::shared_ptr<BigInt>> getNonce(const std::string &address) override;


            Future<void *> startSession() override;
            Future<Unit> killSession(void *session) override;
            Future<Bytes> getRawTransaction(const String& transactionHash) override;
            Future<String> pushTransaction(const std::vector<uint8_t>& transaction) override;

            FuturePtr<EthereumLikeBlockchainExplorer::TransactionsBulk>
            getTransactions(const std::vector<std::string> &addresses, Option<std::string> fromBlockHash = Option<std::string>(),
                            Option<void *> session = Option<void *>()) override;

            FuturePtr<Block> getCurrentBlock() override;
            FuturePtr<EthereumLikeBlockchainExplorerTransaction> getTransactionByHash(const String &transactionHash) override;

            Future<int64_t > getTimestamp() override;

            std::shared_ptr<api::ExecutionContext> getExplorerContext() override;
            api::EthereumLikeNetworkParameters getNetworkParameters() override;
//            std::shared_ptr<LedgerApiBlockchainExplorer> getSharedFromThis() override;
//            void inflateBlockchainExplorerTransaction(std::shared_ptr<EthereumLikeBlockchainExplorerTransaction> &transaction) override;
        private:
            api::EthereumLikeNetworkParameters _parameters;
        };
    }
}


#endif //LEDGER_CORE_LEDGERAPIETHEREUMLIKEBLOCKCHAINEXPLORER_H
