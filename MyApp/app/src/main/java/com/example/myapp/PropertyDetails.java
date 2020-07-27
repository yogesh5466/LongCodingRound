package com.example.myapp;

public class PropertyDetails implements House{
    int propid;
    int ownerid;
    int houseid;
    boolean isbought;
    String imageurl;
    int BHKconfig;

    @Override
    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    @Override
    public void setAreaName(String Area) {

    }

    @Override
    public void setPincode(int pincode) {

    }

    public void setPropid(int propid){
        this.propid = propid;
    }

    public void setOwnerid(int ownerid){
        this.ownerid = ownerid;
    }

    public void setIsbought(boolean isbought){
        this.isbought = isbought;
    }
    public void setImageurl(String imageurl){
        this.imageurl = imageurl;
    }
    public void setBHKconfig(int BHKconfig){
        this.BHKconfig = BHKconfig;
    }
    public int getBHKconfig() {
        return BHKconfig;
    }


}
