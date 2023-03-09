package com.kumar.springannotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope( ConfigurableBeanFactory.SCOPE_SINGLETON) // default
public class SingletonBean {

    public SingletonBean(){
        System.out.println("SingletonBean ...");
    }
}
