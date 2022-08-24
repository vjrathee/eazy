package org.brainypeople.eazy.response;

import java.util.List;

public class Response {
    private Integer id;
    private String statusMessage;
    private List<String> errorMessage;
    private Object data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public List getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(List errorMessage) {
        this.errorMessage = errorMessage;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
