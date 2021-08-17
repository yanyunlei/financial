package com.healthme.log;

public class LogBean {
    private String service;

    private String method;

    private String time;

    private String event;

    private String target;

    private String info;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "LogBean{" +
                "service='" + service + '\'' +
                ", method='" + method + '\'' +
                ", target='" + target + '\'' +
                ", time='" + time + '\'' +
                ", event='" + event + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
