/**
 * 该包下放置ChannelHandler
 * 主要过滤器有：
 * AuditHandler -> HttyWrappedHandler  -> HttyInterceptorHandler-> HttyRouterHandler -> HttyDispatcherHandler
 * 分别是审计、Http封装、URL改写、Http路由Handler(分配请求处理器)、请求处理
 */
package com.github.cjqcn.htty.core.netty.handler;