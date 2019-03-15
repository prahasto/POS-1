package com.shafco.pos.model;

public class Outlet {
    private Integer id;
    private String code_outlet;
    private String name_outlet;

    public Integer getId(){
        return  id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getCode_outlet(){
        return code_outlet;
    }
    public void setCode_outlet(String code_outlet){
        this.code_outlet = code_outlet;
    }

    public String getName_outlet(){
        return name_outlet;
    }
    public  void setName_outlet(String name_outlet){
        this.name_outlet = name_outlet;
    }
}
