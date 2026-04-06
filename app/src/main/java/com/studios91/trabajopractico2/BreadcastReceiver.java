package com.studios91.trabajopractico2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class BreadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent llamada = new Intent(Intent.ACTION_DIAL);
        llamada.setData(Uri.parse("tel:2664618598"));
        Log.d("bread", "Desbloqueo detectado");
        llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(llamada);

    }

}