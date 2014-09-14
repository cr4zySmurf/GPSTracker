package com.eporebski.gpstracker;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Elvis on 14/09/2014.
 */
public class TrackerService extends IntentService {

    public TrackerService() {
        super("TrackerService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("TrackerService", "Received an sms, started TrackerService");
        // get last known location

        // check if outdated

        // check gps status

        // check network status

        // check internet connectivity

        // get current location

        // generate json object

        // check php server status

        // send json to php server

        // check server response

    }
}
