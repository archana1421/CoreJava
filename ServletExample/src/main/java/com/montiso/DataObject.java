package com.montiso;

/**
 * Created by armanchi on 7/21/2016.
 */
public class DataObject {


        String name;
        String desc;
        int price;
        DataObject(String n,String d,int p)
        {
            name=n;
            desc=d;
            price=p;
        }
        public String getName()
        {
            return name;
        }
        public String getDesc()
        {
            return desc;
        }
        public int getPrice()
        {
            return price;
        }
        public void setName(String nm)
        {
            name=nm;

        }
        public void setDesc(String ds)
        {
            desc=ds;
        }
        public void setPrice(int pr)
        {
            price=pr;
        }


}
