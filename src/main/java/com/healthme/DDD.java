package com.healthme;


import com.healthme.model.BthWarnData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DDD {

    public static void main(String[] args) throws IOException {
        Timer timer = new Timer();
        timer.schedule(new myTask(), 500, 300);
    }

    public static class myTask extends TimerTask{
        @Override
        public void run() {
            try {
                SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                System.out.println(simpleDateFormat.format(new Date()));
            }catch (Exception e){
                e.getMessage();
            }
        }
    }
}
