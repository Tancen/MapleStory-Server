package net.server;

public class ChannelNetworkConfig
{
    public ChannelNetworkConfig() {
    }

    public ChannelNetworkConfig(String localIP, String publicIP, int localPort, int publicPort) {
        this.localIP = localIP;
        this.publicIP = publicIP;
        this.localPort = localPort;
        this.publicPort = publicPort;
    }

    public String getLocalIP() {
        return localIP;
    }

    public void setLocalIP(String localIP) {
        this.localIP = localIP;
    }

    public String getPublicIP() {
        return publicIP;
    }

    public void setPublicIP(String publicIP) {
        this.publicIP = publicIP;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    public int getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(int publicPort) {
        this.publicPort = publicPort;
    }

    private String localIP = "";
    private String publicIP = "";
    private int localPort = 0;
    private int publicPort = 0;


}
