package com.speedata.carinfor.utils;

import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 *
 * @author :EchoXBR in  2017/8/25 下午1:50.
 *         功能描述:TODO
 */

public class SoundPlayUtils {
    private  static SoundPool soundPool;
    private static int soundId;
    private static SoundPlayUtils intance;

    private SoundPlayUtils() {
    }
    public static SoundPlayUtils getIntance(){
        if(intance==null) {
            intance = new SoundPlayUtils();
            intance.initSound();
        }
        return intance;
    }

    private static void  initSound(){
        //        mBarLeft.setOnClickListener(this);
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        if (soundPool == null) {
            Log.e("as3992", "Open sound failed");
        }
        soundId = soundPool.load("/system/media/audio/ui/VideoRecord.ogg", 0);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        soundPool.play(soundId, 1, 1, 0, 0, 1);

    }
}
