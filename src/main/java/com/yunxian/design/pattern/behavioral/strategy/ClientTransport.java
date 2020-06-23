package com.yunxian.design.pattern.behavioral.strategy;

public class ClientTransport {

    private ClientConnectionManager connectionManager;

    protected  final boolean  REUSE_CONNECTION;

    public ClientTransport(boolean defaultValue){
        REUSE_CONNECTION  = Configs.getOrDefaultValue(
                Contains.TRANSPORT_CONNECTION_REUSE,defaultValue);
    }

    public  ClientConnectionManager  getConnectionManagerStratege(){
        if (REUSE_CONNECTION){
            connectionManager =  new ReuseClientConnectionManager(
                    true);
        }else{
            connectionManager = new AloneClientConnectionManager(
                    true);
        }
        return connectionManager;
    }

    public Connection fetchConnection() {
        return connectionManager.getConnection();
    }
}
