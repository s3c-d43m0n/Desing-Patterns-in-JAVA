package com.designpattern.behavioral;

import com.designpattern.behavioral.observer.impl.CryptoCurrencyBuyer;
import com.designpattern.behavioral.observer.impl.CryptoCurrencySeller;
import com.designpattern.behavioral.observer.impl.PriceWatcher;
import com.designpattern.behavioral.subject.impl.CryptoCurrency;

public class Demo {
    public static void main(String[] args) {
        //Let's say bitcoin current price is $1000.0
        CryptoCurrency bitcoin = new CryptoCurrency("Bitcoin", 1000.0);

        //Observer for watching price for bitcoin
        PriceWatcher bitcoinWatcher = new PriceWatcher("Bitcoin Watcher", bitcoin);

        //Buyer1 will buy 2.5 stocks if price is going down till $980.0
        CryptoCurrencyBuyer buyer1 = new CryptoCurrencyBuyer("Buyer 1",bitcoin,980.0, 2.5);

        //Buyer2 will buy 5.5 stocks if price is going down till $960.0
        CryptoCurrencyBuyer buyer2 = new CryptoCurrencyBuyer("Buyer 2",bitcoin,960.0, 5.5);

        //Seller1 will sell 3.0 stocks if price is going above $1020.0
        CryptoCurrencySeller seller1 = new CryptoCurrencySeller("Seller 1", bitcoin, 1020.0, 3.0);

        //Seller2 will sell 7.0 stocks if price is going above $1050.0
        CryptoCurrencySeller seller2 = new CryptoCurrencySeller("Seller 2", bitcoin, 1050.0, 7.0);

        //Now lets change the price and check behaviour of observers
        bitcoin.setPrice(999.0);
        bitcoin.setPrice(970.0);
        bitcoin.setPrice(995.0);
        bitcoin.setPrice(1021.0);
        bitcoin.setPrice(980.0);
        bitcoin.setPrice(950.0);
        bitcoin.setPrice(1010.0);
        bitcoin.setPrice(1060.0);
        bitcoin.setPrice(1000.0);
    }
}
