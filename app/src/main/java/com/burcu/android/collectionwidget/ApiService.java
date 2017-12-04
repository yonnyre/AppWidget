/*
 * Copyright 2003-2017 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */

package com.burcu.android.collectionwidget;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Julio Cesar on 29/11/2017.
 */

public interface ApiService {

    String API_BASE_URL = "https://incidentes-synms.c9users.io";

    @GET("api/v1/incidentes")
    Call<List<com.burcu.android.collectionwidget.stockwidget.Incidente>> getStocks();

}

