package com.candratop3.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class mytoast {
    public static void superToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}