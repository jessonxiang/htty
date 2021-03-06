package com.github.cjqcn.htty.core.worker;

import com.github.cjqcn.htty.core.http.HttyRequest;
import com.github.cjqcn.htty.core.http.HttyHandler;
import com.github.cjqcn.htty.core.http.HttyResponse;
import io.netty.handler.codec.http.HttpMethod;

public interface HttyWorker extends HttyHandler {

    void handle(HttyRequest httyRequest, HttyResponse httyResponse) throws Exception;

    HttpMethod[] HttpMethod();

    String path();
}
