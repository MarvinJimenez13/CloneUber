package com.udemy.uberclone.Interfaces.driver.map_driver;

import com.google.android.gms.maps.model.LatLng;
import com.udemy.uberclone.Utils.providers.AuthProvider;

public interface MapDriverPresenter {

    void isDriverWorking(AuthProvider authProvider);

    void removeLocation(AuthProvider authProvider);

    void saveLocation(AuthProvider authProvider, LatLng currentLatLng);

    void generateTokenNoti(AuthProvider authProvider);

    void removeEventListener(AuthProvider authProvider);

    void disconnect();

}
