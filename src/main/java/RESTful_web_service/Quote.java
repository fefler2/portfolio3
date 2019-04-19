package RESTful_web_service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties
public class Quote {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public Quote(){

    }


}
