package com.melon.myapp.receiver;

//import cn.jpush.android.api.JPushInterface;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.melon.myapp.Constants;
import com.melon.myapp.bean.Notify;
import com.melon.myapp.db.DatabaseHelper;
import com.melon.myapp.functions.h5.WebActivity;
import com.melon.mylibrary.util.CommonUtil;


/**
 * 自定义接收器 如果不定义这个 Receiver，则： 1) 默认用户会打开主界面 2) 处理不了自定义消息
 */
public class MyJpushReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

    }
//    private DatabaseHelper mDatabaseHelper;
//    private static final String TAG = "JPush";
//    RuntimeExceptionDao<Notify, Integer> notifyDao;
//    private DatabaseHelper getDBHelper(Context ctx) {
//        if (mDatabaseHelper == null) {
//            mDatabaseHelper = OpenHelperManager.getHelper(ctx, DatabaseHelper.class);
//        }
//        return mDatabaseHelper;
//    }
//    @Override
//    public void onReceive(final Context context, Intent intent) {
//        if(notifyDao==null) {
//            notifyDao = getDBHelper(context).getNotifyDao();
//        }
//
//        Bundle bundle = intent.getExtras();
//        Log.d(TAG, "[MyReceiver] onReceive - " + intent.getAction() + ", extras: " + printBundle(bundle));
//        if (JPushInterface.ACTION_REGISTRATION_ID.equals(intent.getAction())) {
//            String regId = bundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
//            Log.d(TAG, "[MyReceiver] 接收Registration Id : " + regId);
//            // send the Registration Id to your server...
//
//        } else if (JPushInterface.ACTION_MESSAGE_RECEIVED.equals(intent.getAction())) {
//            Log.d(TAG, "发了消息");
//        } else if (JPushInterface.ACTION_NOTIFICATION_RECEIVED.equals(intent.getAction())) {
//            // 发了通知
//            Log.e(TAG, "发了通知");
//            String alterValue = bundle.getString(JPushInterface.EXTRA_ALERT);
//            // 存数据库
//            notifyDao.create(new Notify(System.currentTimeMillis()+"", alterValue));
//
//            // 发通知，更新界面。
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    context.sendBroadcast(new Intent(Constants.BROADCAST_NEW_NOTIFY));
//                }
//            }, 1000);
//        } else if (JPushInterface.ACTION_NOTIFICATION_OPENED.equals(intent.getAction())) {
//            Log.d(TAG, "[MyReceiver] 用户点击打开了通知");
//            try {
//                String alterValue = bundle.getString(JPushInterface.EXTRA_ALERT);
//                if (!CommonUtil.isEmpty(alterValue)) {
//                    if (alterValue.startsWith("http") || alterValue.startsWith("https")) {
//                        Intent mIntent = new Intent(context, WebActivity.class);
//                        mIntent.putExtra("url", alterValue);
//                        mIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        context.startActivity(mIntent);
//                    } else {
//                        //复制到剪切板
//                        CommonUtil.addToClipboard(context, alterValue);
//                    }
//                }
//
//
////                String extraJson = bundle.getString(JPushInterface.EXTRA_EXTRA);
////
////                JSONObject extraObj = new JSONObject(extraJson);
////                //String type = extraObj.optString("type"); // 1、单店 2、爱街 3、写字楼  4、特卖活动
////                String id = extraObj.optString("id");
////                int action = extraObj.optInt("action"); // 1、消息 2、专题(跳转到详情时，隐藏分享) 3、单品 4、团购 5、普通网页
////                String url = extraObj.optString("url");
////
////                Log.d(TAG, "id: " + id + ", action: " + action + ", url: " + url);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else if (JPushInterface.ACTION_RICHPUSH_CALLBACK.equals(intent.getAction())) {
//            Log.d(TAG, "[MyReceiver] 用户收到到RICH PUSH CALLBACK: " + bundle.getString(JPushInterface.EXTRA_EXTRA));
//            // 在这里根据 JPushInterface.EXTRA_EXTRA 的内容处理代码，比如打开新的Activity，打开一个网页等..
//
//        } else if (JPushInterface.ACTION_CONNECTION_CHANGE.equals(intent.getAction())) {
//            boolean connected = intent.getBooleanExtra(JPushInterface.EXTRA_CONNECTION_CHANGE, false);
//            Log.e(TAG, "[MyReceiver]" + intent.getAction() + " connected state change to " + connected);
//        } else {
//            Log.d(TAG, "[MyReceiver] Unhandled intent - " + intent.getAction());
//        }
//    }
//
//    // 打印所有的 intent extra 数据
//    private static String printBundle(Bundle bundle) {
//        StringBuilder sb = new StringBuilder();
//        for (String key : bundle.keySet()) {
//            if (key.equals(JPushInterface.EXTRA_NOTIFICATION_ID)) {
//                sb.append("\nkey:" + key + ", value:" + bundle.getInt(key));
//            } else if (key.equals(JPushInterface.EXTRA_CONNECTION_CHANGE)) {
//                sb.append("\nkey:" + key + ", value:" + bundle.getBoolean(key));
//            } else {
//                sb.append("\nkey:" + key + ", value:" + bundle.getString(key));
//            }
//        }
//        return sb.toString();
//    }

}
