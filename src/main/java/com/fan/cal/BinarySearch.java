package com.fan.cal;

/**
 * -1,0,3,5,9,12
 * 二分查找
 * 二分查找是一种基于比较目标值和数组中间元素的教科书式算法
 * 如果目标值等于中间元素，则找到目标值
 * 如果目标值较小，则继续再左侧搜索
 * 如果目标值较大，则继续在右侧搜索
 *
 * 复杂度
 * 时间复杂度：O(log N)
 * 空间复杂度O(1)
 *
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        int index = search(nums,9);
        System.out.println("index:"+index);
    }

    public static int search(int[] nums,int target){
        int pivot;
        int left=0;
        int right=nums.length-1;
        while(left <= right){
            pivot = left +(right - left) / 2;
            if(nums[pivot] == target){
                return pivot;
            }else  if (target < nums[pivot]){  //如果目标值小于中心，则right指针移动到中心位置-1
                right = pivot - 1;
            }else{
                left = pivot + 1;
            }
        }
        return -1;
    }

}
