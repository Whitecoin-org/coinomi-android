package com.coinomi.core.coins;

import com.coinomi.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class WhitecoinMain extends PeerFamily {
    private WhitecoinMain() {
        id = "whitecoin.main";

        addressHeader = 73;
        p2shHeader = 87;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 500;
        dumpedPrivateKeyHeader = 201;

        name = "Whitecoin";
        symbol = "XWC";
        uriScheme = "whitecoin";
        bip44Index = 10;
        unitExponent = 8;
        feeValue = value(10000); // 0.0001 XWC
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 XWC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Whitecoin Signed Message:\n");
    }

    private static WhitecoinMain instance = new WhitecoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}