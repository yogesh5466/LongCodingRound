package com.example.myapp;

import java.util.Date;

public class Request {
    int reqid;
    String userid;
    int propid;
    Date date;
    boolean isAccepted;
    int Amountbid;
    boolean isloaninit;

    public void setAccepted(boolean accepted) {
        this.isAccepted = accepted;
    }

    public void setAmountbid(int amountbid) {
        this.Amountbid = amountbid;
    }

    public void setReqid(int reqid){
        this.reqid = reqid;
    }
    public void setUserid(String userid){
        this.userid = userid;
    }
    public void setPropid(int propid){
        this.propid = propid;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setIsloaninit(boolean isloaninit){
        this.isloaninit = isloaninit;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public boolean isIsloaninit() {
        return isloaninit;
    }

    public Date getDate() {
        return date;
    }

    public int getAmountbid() {
        return Amountbid;
    }

    public int getPropid() {
        return propid;
    }

    public int getReqid() {
        return reqid;
    }

    public String getUserid() {
        return userid;
    }

    public boolean issold(PropertyDetails propertyDetails){
        if(propertyDetails.isbought){
            return false;
        }
        return true;
    }
}
