package edu.sfsu.cs.orange.ocr.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;

public class PermissionHelper {
    @TargetApi(Build.VERSION_CODES.M)
    public static void requestPermission(Activity context, String[] permissions, int requestCode) {
        for (int i = 0; i < permissions.length; i++) {
            if (context.checkSelfPermission(permissions[i]) != PackageManager.PERMISSION_GRANTED) {
                context.requestPermissions(new String[]{permissions[i]}, requestCode);
            }
        }
    }

}