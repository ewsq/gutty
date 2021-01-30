package com.doopp.gutty.demo;

import com.doopp.gutty.framework.Gutty;
import com.doopp.gutty.framework.json.JacksonMessageConverter;
import com.doopp.gutty.framework.view.FreemarkerViewResolver;

public class MVCApplication {

    public static void main(String[] args) {
        new Gutty()
                .loadProperties(args)
                // .addModules(new AbstractModule() {
                //    @Singleton
                //    @Provides
                //    @Named("executeGroup")
                //    public EventLoopGroup executeGroup() {
                //        return new NioEventLoopGroup();
                //    }
                // })
                .setBasePackages(MVCApplication.class.getPackage().getName())
                .setMessageConverter(JacksonMessageConverter.class)
                .setViewResolver(FreemarkerViewResolver.class)
                .addFilters(null, null)
                .start();
    }
}
