package com.cert.ocp8.course.deveduardodogs.module4.practice3;

public final class PeerSingleton {

    private static final String[] HOST_NAMES = new String[5];
    private static final PeerSingleton INSTANCE = new PeerSingleton();

    static {
        // Read from File
        HOST_NAMES[0] = "192.168.1.2";
        HOST_NAMES[1] = "192.168.1.4";
        HOST_NAMES[2] = "192.168.2.3";
        HOST_NAMES[3] = "192.168.2.5";
        HOST_NAMES[4] = "192.168.2.14";
    }

    private PeerSingleton() { }

    public String[] getHostNames() {
        return HOST_NAMES;
    }

    public static PeerSingleton getInstance(){
        return INSTANCE;
    }
}
