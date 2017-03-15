package com.framgia.weatherforecast.service;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;

import com.framgia.weatherforecast.R;

public class GPSTracker extends Service implements LocationListener {
    private Context mContext;
    boolean isGPSEnabled = false;
    boolean isNetworkEnabled = false;
    boolean canGetLocation = false;
    private double mLatitude;
    private double mLongitude;
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1;
    public LocationManager locationManager;
    public Location location;

    public GPSTracker(Context context) {
        this.mContext = context;
        getLocation();
    }
    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext
                .getSystemService(LOCATION_SERVICE);
            isGPSEnabled = locationManager
                .isProviderEnabled(LocationManager.GPS_PROVIDER);
            isNetworkEnabled = locationManager
                .isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!isGPSEnabled && !isNetworkEnabled) {
            } else {
                this.canGetLocation = true;
                if (isNetworkEnabled) {
                    if (ActivityCompat
                        .checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED && ActivityCompat
                        .checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {
                        return null;
                    }
                    locationManager.requestLocationUpdates(
                        LocationManager.NETWORK_PROVIDER,
                        MIN_TIME_BW_UPDATES,
                        MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    if (locationManager != null) {
                        location = locationManager
                            .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            mLatitude = location.getLatitude();
                            mLongitude = location.getLongitude();
                        }
                    }
                }
                if (isGPSEnabled) {
                    if (location == null) {
                        locationManager.requestLocationUpdates(
                            LocationManager.GPS_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                        if (locationManager != null) {
                            location = locationManager
                                .getLastKnownLocation(LocationManager.GPS_PROVIDER);
                            if (location != null) {
                                mLatitude = location.getLatitude();
                                mLongitude = location.getLongitude();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return location;
    }
    public void stopUsingGPS() {
        if (locationManager != null) {
            if (ActivityCompat
                .checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED && ActivityCompat
                .checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
                return;
            }
            locationManager.removeUpdates(GPSTracker.this);
        }
    }
    public double getLatitude(){
        if(location != null){
            mLatitude = location.getLatitude();
        }
        return mLatitude;
    }
    public double getLongitude(){
        if(location != null){
            mLongitude = location.getLongitude();
        }
        return mLongitude;
    }
    public boolean canGetLocation() {
        return this.canGetLocation;
    }
    public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);
        alertDialog.setTitle(R.string.title_dialog);
        alertDialog.setMessage(R.string.mesage_dialog);
        alertDialog.setPositiveButton(R.string.action_settings, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                mContext.startActivity(intent);
            }
        });
        alertDialog.setNegativeButton(R.string.cancel_dialog, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.show();
    }

    @Override
    public void onLocationChanged(Location location) {
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}
