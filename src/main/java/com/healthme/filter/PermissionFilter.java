package com.healthme.filter;

import com.healthme.util.LogIdUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author root
 */
@Component
public class PermissionFilter implements Filter {
    private static Logger logger = LoggerFactory.getLogger(PermissionFilter.class);


    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("init=============>");
    }


    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LogIdUtil.setLogIdByFilter("user");
        logger.info("{}|{}", LogIdUtil.getLogId(), getIp(servletRequest));

//        servletResponse.setContentType();

        filterChain.doFilter(servletRequest, servletResponse);
        LogIdUtil.remove();
        logger.info("remove=============<");
    }


    public void destroy() {

    }

    private String getIp(ServletRequest servletRequest){
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // 使用x-forwarded-for或Proxy-Client-IP或WL-Proxy-Client-IP得到ip地址
        String ipString = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            // 若以上三种方式均为获取到ip则证明获得客户端并没有采用反向代理直接使用getRemoteAddr()获取客户端的ip地址
            ipString = request.getRemoteAddr();
        }

        // 多个路由时，取第一个非unknown的ip
        final String[] arr = ipString.split(",");
        for (final String str : arr) {
            if (!"unknown".equalsIgnoreCase(str)) {
                ipString = str;
                break;
            }
        }

        return ipString;
    }
}
