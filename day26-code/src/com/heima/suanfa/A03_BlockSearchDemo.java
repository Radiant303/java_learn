package com.heima.suanfa;

public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {
                10, 20, 30,
                40, 50, 60,
                70, 80, 90,100
        };

        //数据分块

        Block b1  =  new Block( 30, 0, 2);
        Block b2  =  new Block(60, 3, 5);
        Block b3  =  new Block(100, 6, 9);

        int number = 30;

        Block[] blockArr = {b1,b2,b3};
        int index = getIndex(blockArr,arr,number);

        System.out.println(index);


    }
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        int index = findIndexBlock(blockArr,number);
        if (index == -1)return -1;

        int startIndex = blockArr[index].getStartIndex();
        int endIndex = blockArr[index].getEndIndex();

        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    private static int findIndexBlock(Block[] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }

}

class Block{
    private int max ;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
