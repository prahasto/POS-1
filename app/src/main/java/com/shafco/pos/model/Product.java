package com.shafco.pos.model;

public class Product {
    private Integer id;
    private String code_product;
    private String name_product;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getCode_product(){
        return code_product;
    }
    public void setCode_product(String code_product){
        this.code_product = code_product;
    }

    public String getName_product(){
        return name_product;
    }
    public void setName_product(String name_product){
        this.name_product = name_product;
    }
}
