package com.github.cjqcn.htty.core.worker;

import com.github.cjqcn.htty.core.http.HttyRequest;
import com.github.cjqcn.htty.core.http.HttyResponse;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * @description:
 * @author: chenjinquan
 * @create: 2018-09-11 21:03
 **/
public class MethodNotSupportHttyWorker implements HttyWorker {

    private static final String resStrTemplate = "Request method %s not supported.";

    @Override
    public void handle(HttyRequest httyRequest, HttyResponse httyResponse) throws Exception {
        httyResponse.sendString(HttpResponseStatus.METHOD_NOT_ALLOWED,
                String.format(resStrTemplate, httyRequest.method().name()));
    }

    @Override
    public HttpMethod[] HttpMethod() {
        throw new IllegalStateException("Not supported to call");
    }

    @Override
    public String path() {
        throw new IllegalStateException("Not supported to call");
    }


}
