package com.bobo.basic.List;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by bobo on 2018/9/13/10:53.
 */
public class MyDelayed implements Delayed {
    public MyDelayed () {

    }
    @Override
    public long getDelay(TimeUnit unit) {
        return unit.toMillis(100L);
    }

    @Override
    public int compareTo(Delayed o) {
       Long time =  this.getDelay(TimeUnit.SECONDS) - o.getDelay(TimeUnit.SECONDS);
       return time.intValue();
    }
}
