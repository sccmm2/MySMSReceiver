package com.example.sung.mysmsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MySMSReceiver";

    public MyReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive() 호출됨");

        Intent myIntent = new Intent(context, MainActivity.class);
        /**
         * 메인 액티비티를 띄우는데 액티비키가 없을경우는 FLAG_ACTIVITY_NEW_TASK 속성을 통하여 생성
         * 메인 액티비티가 메모리에 할당 되어있는 경우 FLAG_ACTIVITY_SINGLE_TOP 속성 설정
         **/
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        context.startActivity(myIntent);
    }
}
