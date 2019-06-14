package cn.wildfirechat.client;

/**
 * Created by heavyrainlee on 2018/1/26.
 */

public interface ConnectionStatus {
    int ConnectionStatusRejected = -3;
    int ConnectionStatusLogout = -2;
    int ConnectionStatusUnconnected = -1;
    int ConnectionStatusConnecting = 0;
    int ConnectionStatusConnected = 1;
    int ConnectionStatusReceiveing = 2;
}
