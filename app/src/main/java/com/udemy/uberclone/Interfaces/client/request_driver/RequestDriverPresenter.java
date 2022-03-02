package com.udemy.uberclone.Interfaces.client.request_driver;

import android.content.Context;
import com.firebase.geofire.GeoLocation;
import com.google.android.gms.maps.model.LatLng;
import com.udemy.uberclone.Models.ClientBooking;
import com.udemy.uberclone.Models.FCMBody;
import com.udemy.uberclone.Utils.providers.AuthProvider;

public interface RequestDriverPresenter {

    void getClosestDrivers(LatLng originLatLng, double radius);

    void createClientBooking(LatLng originLatLng, LatLng driverFoundLatLng, String driverFoundID, Context context);

    void driverFound(String key, GeoLocation location);

    void driverNotFound();

    void buildNotification(String token, String time, String km);

    void sendNotification(FCMBody body, ClientBooking clientBooking, AuthProvider authProvider);

    void showError(String error);

    void success(String mensaje);

    void toMapClientBooking();

    void toMapClient();

    void removeListener(AuthProvider authProvider);

}
