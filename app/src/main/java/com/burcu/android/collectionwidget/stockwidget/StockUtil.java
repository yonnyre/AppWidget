/*
 * Copyright 2003-2017 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */

package com.burcu.android.collectionwidget.stockwidget;


import java.util.ArrayList;

public class StockUtil {

    private static final String DECIMAL_FORMAT = "#0.000";


    public static ArrayList<Stock> getInitialStockList() {


        final ArrayList<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock("Hola1", "hola","vago"));
        stocks.add(new Stock("Hola2", "vago","sd"));
        stocks.add(new Stock("Hola3", "vago","sd"));


        return stocks;

    }

}
