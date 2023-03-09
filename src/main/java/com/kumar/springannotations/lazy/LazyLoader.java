package com.kumar.springannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // on demand at runtime
public class LazyLoader {
    public  LazyLoader(){
        System.out.println("LazyLoader on demand at runtime");
    }
}
