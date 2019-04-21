package com.xiaopengwei.springboot.file.upload.util;import org.apache.coyote.http11.AbstractHttp11Protocol;import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;/** * <p> * 大文件上传处理 * </p> * * @author XiaoPengwei.com * @since 2019-04-17 */@Configurationpublic class TomcatLargeFileUploadHandler {    //Tomcat large file upload connection reset    @Bean    public TomcatServletWebServerFactory tomcatEmbedded() {        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {                //-1 means unlimited                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);            }        });        return tomcat;    }}