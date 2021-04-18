package com.geek.algorithm.light.Algorithm.practice.firstTimes;

import com.geek.algorithm.light.Algorithm.base.ListNode;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        int len = stack.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = stack.pop();
        }
        return res;
    }


//递归解法
//    public int[] reversePrint(ListNode head) {
//        if (null == head) {
//            return new int[0];
//        }
//        List<Integer> result = new ArrayList<>();
//        recursion(head.next, result);
//        result.add(head.val);
//        int len = result.size();
//        return result.stream().mapToInt(Integer::valueOf).toArray();
//    }
//
//    private void recursion(ListNode node, List<Integer> res) {
//        if (null == node) {
//            return;
//        }
//        recursion(node.next, res);
//        res.add(node.val);
//
//    }
}
