package com.maijiabao.administrator.httpdemo.models;

import com.maijiabao.administrator.httpdemo.models.Category;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Administrator on 3/15/2017.
 */
public class JObjectCategoryConvertor {
    public static ArrayList<Category>  convert(JSONArray array) {
        ArrayList<Category> list = new ArrayList<Category>();
        try{
            for(int i =0,len = array.length();i<len;i++){
                String name =  array.getJSONObject(i).get("categoryName").toString();
                String desc =  array.getJSONObject(i).get("categoryDesc").toString();
                String type =  array.getJSONObject(i).get("type").toString();
                String id =  array.getJSONObject(i).get("_id").toString();
                Category obj  = new Category(name,desc);
                obj.id = id;
                obj.type = type;
                list.add(obj);
            }
        }catch (JSONException ex){
            ex.printStackTrace();
        }


        return list;

    }
}
