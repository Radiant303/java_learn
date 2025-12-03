package com.itheima.test7;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Goods[] arr = new Goods[3];

        //2.创建三个商品对象
        Goods g1 = new Goods("001","iphone",8888.0,10);
        Goods g2 = new Goods("002","华为P40",6999.0,10);
        Goods g3 = new Goods("003","枸杞",12.7,10);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getName() + " " + goods.getPrice()+ " " + goods.getCount());
        }
    }
}
