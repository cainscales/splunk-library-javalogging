package com.splunk.logging;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class HttpEventCollectorSslConfiguration {
    final TrustManager trustManager;
    final SSLSocketFactory sslSocketFactory;

    public HttpEventCollectorSslConfiguration(SSLSocketFactory sslSocketFactory, TrustManager trustManager) {
        this.trustManager = trustManager;
        this.sslSocketFactory = sslSocketFactory;
    }

    public TrustManager getTrustManager() { return this.trustManager; }
    public SSLSocketFactory getSslSocketFactory() { return this.sslSocketFactory; }



}
