package com.java.test_20_12_7;

import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<int[]> list = threeSum(nums);
        System.out.println(Arrays.toString(list.get(0)));
    }

    /**
     * 同一元素不能算作两次
     */
    private static List<int[]> threeSum(int[] nums){
        if (nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        int n = nums.length;
        //数组排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<int[]> list = new ArrayList<>();
        for (int i  = 0; i < n-1; i++){
            /**
             * 建议在 i 以下的循环使用指针方式  否则执行时间有可能会过长
             * 当 nums[i]+nums[L]+nums[R]==0nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,RL,R 移到下一位置，寻找新的解
             * 若和大于 00，说明 nums[R]nums[R] 太大，RR 左移
             * 若和小于 00，说明 nums[L]nums[L] 太小，LL 右移
             */
            a:for (int j = i+1; j < n-1; j++){
                for (int k = j+1; k < n; k++){
                    //在三个数字相加为0的前提下
                    if (nums[i] + nums[j] + nums[k] == 0){
                        //判断list中是否存在对应的三个子元素都相同的元素
                        for (int l = 0; l < list.size(); l++){
                            if (list.get(l)[0] == nums[i] && list.get(l)[1] == nums[j]
                                    && list.get(l)[2] == nums[k]){
                                continue a;
                            }
                        }
                        //如果没有则往list中加入一个元素 而且跳到最外层循环
                        list.add(new int[]{nums[i], nums[j], nums[k]});
                        continue a;
                    }
                }
            }
        }
        return list;
    }
}
