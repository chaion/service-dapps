package com.chaion.makkiiserver.pokket.model;

public interface TransactionStatusListener {
    /**
     * called when transaction is confirmed.
     *
     * @param transactionHash transaction hash
     * @param status confirmed or failure
     */
    void transactionConfirmed(String transactionHash, boolean status);
}