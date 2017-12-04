/*
 * Copyright 2003-2017 Monitise Group Limited. All Rights Reserved.
 *
 * Save to the extent permitted by law, you may not use, copy, modify,
 * distribute or create derivative works of this material or any part
 * of it without the prior written consent of Monitise Group Limited.
 * Any reproduction of this material must contain this notice.
 */

package com.burcu.android.collectionwidget;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alumno on 30/11/2017.
 */

public class IncidenteRepository {

    private static IncidenteRepository _INSTANCE = null;

    private IncidenteRepository(){}

    public static IncidenteRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new IncidenteRepository();
        return _INSTANCE;
    }

    private List<Incidente> incidentes = new ArrayList<>();

    public List<Incidente> getIncidentes() {
        return this.incidentes;
    }

    public void agregarIncidente(Incidente incidente){
        this.incidentes.add(incidente);
    }
}
