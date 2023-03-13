package com.csi.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RunTimeExceptoin extends RuntimeException{
    public  RunTimeExceptoin(String msg){
        super(msg);
    }
}
