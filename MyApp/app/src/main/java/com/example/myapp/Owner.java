package com.example.myapp;

public class Owner extends Users{
    int ownerid;
    int NoofProp;
    int Noofpropsold;

    public void setNoofProp(int noofProp) {
        NoofProp = noofProp;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    public void setNoofpropsold(int Noofpropsold){
        this.Noofpropsold = Noofpropsold;
    }
}
