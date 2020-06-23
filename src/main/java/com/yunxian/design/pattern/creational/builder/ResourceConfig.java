package com.yunxian.design.pattern.creational.builder;


import org.apache.commons.lang3.StringUtils;

public class ResourceConfig {
    /**协议*/
    private String protocol ;
    /**主机*/
    private String host;
    /**端口*/
    private int port;

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    private ResourceConfig(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;

    }

    public static class Builder {
        private String protocol = DefaultContains.PROTOCOL;
        private String host = DefaultContains.SERVER_HOST;
        private int port = DefaultContains.PORT;

        public ResourceConfig build() {
            return new ResourceConfig(this);
        }

        public Builder setProtocol(String protocol) {
            if (StringUtils.isBlank(protocol)) {
                throw new IllegalArgumentException("protocol is not null");
            }      this.protocol = protocol;
            return this;
        }

        public Builder setHost(String host) {
            if (StringUtils.isBlank(host)) {
                throw new IllegalArgumentException("host is not null");
            }      this.host = host;
            return this;
        }

        public Builder setPort(int port) {
            if (port <= 0) {
                throw new IllegalArgumentException("Port cannot be less than 0");
            }      this.port = port;
            return this;
        }
    }



}
