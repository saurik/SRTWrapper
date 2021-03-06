package com.github.thibaultbee.srtwrapper

class Srt {
    init {
        System.loadLibrary("crypto")
        System.loadLibrary("ssl")
        System.loadLibrary("srt")
        System.loadLibrary("jnisrt")
    }

    external fun startUp(): Int
    external fun cleanUp(): Int
    external fun setLogLevel(level: Int)
}