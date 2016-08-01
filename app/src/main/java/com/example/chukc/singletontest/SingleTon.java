package com.example.chukc.singletontest;

/**
 * Created by chukc on 2016/8/1.
 */

/*饿汉*/
//public class SingleTon {
//    private static SingleTon instance=new SingleTon();
//    private static SingleTon getInstanse(){
//        return instance;
//    }
//}

/*懒汉*/
//public class SingleTon {
//    private static SingleTon instance=null;
//    private static SingleTon getInstanse(){
//        if(instance==null)
//            instance=new SingleTon();
//        return instance;
//    }
//}

    /*双重检查锁定*/
//public class SingleTon {
//    private volatile  static SingleTon instance=null;    //volatile 变量在各个线程中是一致的
//    public static SingleTon getInstanse(){
//        if(instance==null){
//            synchronized (SingleTon.class){
//                if(instance==null)
//                    instance=new SingleTon();
//            }
//        }
//        return instance;
//    }
//}

    /*静态内部类*/
public class SingleTon {
    public static SingleTon getInstanse(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        private static final SingleTon instance=new SingleTon();
    }
}

