package com.company.arrays;

public class ContainerWithMostWater {

    static int maxArea(int[] height){
        //2 pointer method
        int maxArea = 0;
        int p1 = 0;
        int p2 = height.length - 1;
        while(p1 < p2){
            //for area equation can only use the smallest height
            //width is going to be dist between both pointers
            if (height[p1] < height[p2]){
                maxArea = Math.max(maxArea, height[p1]*(p2-p1));
                p1 += 1;
            } else {
                maxArea = Math.max(maxArea, height[p2]*(p2-p1));
                p2 -= 1;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] height = {4,3,2,1,4};
        System.out.println(maxArea(height));

    }
}
