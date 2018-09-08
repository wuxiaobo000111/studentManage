package com.bobo.thrift.service.impl;

import com.bobo.thrift.service.Hello;
import org.apache.thrift.TException;

/**
 * Created by bobo on 2018/9/7/10:16.
 */
public class HelloImpl implements Hello.Iface {
    @Override
    public String helloString(String para) throws TException {
        return para;
    }

    @Override
    public int helloInt(int para) throws TException {
        return 0;
    }

    @Override
    public boolean helloBoolean(boolean para) throws TException {
        return false;
    }

    @Override
    public void helloVoid() throws TException {
        System.out.println("Hello World");
    }

    @Override
    public String helloNull() throws TException {
        return null;
    }
}
