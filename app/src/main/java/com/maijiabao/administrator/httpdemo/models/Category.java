package com.maijiabao.administrator.httpdemo.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Category {
    public Category(String name,String desc){
        this.categoryDesc = desc;
        this.categoryName = name;
    }
    public String categoryName;
    public String categoryDesc;
    public String id;
    public String type;

    public static ArrayList<Category> GetCategories(JSONArray array){
        ArrayList<Category> list=  new ArrayList<>();
        try{
            for(int i =0,len = array.length();i<len;i++){
                JSONObject obj  = array.getJSONObject(i);
            }
        }catch (JSONException ex){
            ex.printStackTrace();
        }

        return list;
    }
}
