package com.healthme.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.healthme.util.LogIdUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author root
 */
@Component
@Aspect
public class SystemLogAspect {
    private static Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private LogBean combination(JoinPoint joinPoint, SystemLog systemLog, String target) {
        String event = systemLog.event();
        String service = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String method = joinPoint.getSignature().getName();

        LogBean logBean = new LogBean();
        logBean.setService(service);
        logBean.setMethod(method);
        logBean.setEvent(event);
        logBean.setTarget(target);
        logBean.setTime(simpleDateFormat.format(new Date()));
        return logBean;
    }

    @Before(value = "@annotation(systemLog)")
    public void before(JoinPoint joinPoint, SystemLog systemLog){
        LogBean logBean = combination(joinPoint, systemLog, "REQ");
        Object[] args = joinPoint.getArgs();
        String argsStr = "";

        try {
            if (args != null){
                ObjectMapper objectMapper = new ObjectMapper();
                argsStr = objectMapper.writeValueAsString(args);
            }
        } catch (JsonProcessingException e) {
            logger.error("{}|{}", LogIdUtil.getLogId(), e.getMessage());
        }
        logBean.setInfo(argsStr);

        logger.info("{}|{}", LogIdUtil.getLogId(), logBean.toString());
    }

    @AfterReturning(value = "@annotation(systemLog)",returning = "resp")
    public void AfterReturning(JoinPoint joinPoint, Object resp, SystemLog systemLog){
        LogBean logBean = combination(joinPoint, systemLog, "RESP");
        String result = "";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            result = objectMapper.writeValueAsString(resp);
        } catch (JsonProcessingException e) {
            logger.error("{}|{}", LogIdUtil.getLogId(), e.getMessage());
        }

        if (result.length() > 100){
            result = result.substring(0, 100) + "*******";
        }
        logBean.setInfo(result);

        logger.info("{}|{}", LogIdUtil.getLogId(), logBean.toString());
    }

    @AfterThrowing(throwing = "ex", value = "@annotation(systemLog)")
    public void doAfterThrow(JoinPoint joinPoint, Throwable ex, SystemLog systemLog) {
        LogBean logBean = combination(joinPoint, systemLog, "ERROR");
        logBean.setInfo(ex.getMessage());
        logger.info("{}|{}", LogIdUtil.getLogId(), logBean.toString());
    }
}
