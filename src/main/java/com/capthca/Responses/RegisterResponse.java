package com.capthca.Responses;

import java.util.UUID;

public class RegisterResponse {

    String sec = "";
    String pub = "";

    public RegisterResponse() {
        sec = String.valueOf(UUID.randomUUID());
        pub = String.valueOf(UUID.randomUUID());
    }

    public String getSec() {
        return sec;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
}
