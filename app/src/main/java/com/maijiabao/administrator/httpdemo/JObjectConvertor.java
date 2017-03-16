package com.maijiabao.administrator.httpdemo;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Administrator on 3/15/2017.
 */
public class JObjectConvertor   {
    public static ArrayList<Category>  convert(JSONArray array) throws JSONException{
        ArrayList<Category> list = new ArrayList<Category>();
        for(int i =0,len = array.length();i<len;i++){
           String name =  array.getJSONObject(i).get("categoryName").toString();
            String desc =  array.getJSONObject(i).get("categoryDesc").toString();
            Category obj  = new Category(name,desc);
            list.add(obj);
        }

        return list;

    }
}