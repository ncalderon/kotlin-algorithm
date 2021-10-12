package com.ncalderon.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ApplaudoChallenge {

    static class Node {

        int value;
        int pos;
        Node nextNode;

        public Node(int value, int pos) {
            this.value = value;
            this.pos = pos;
        }
    }

    public static List<Node> listToNodes(List<Integer> list){
        List<Node> nodes = new ArrayList<Node>(list.size());
        Node head = null;
        Node tail = null;
        for (int i = 0; i < list.size(); i++){
            Node currentNode = new Node(list.get(i), i);
            if (i == 0){
                head = currentNode;
            } else if (i == list.size()-1){
                tail = currentNode;
                tail.nextNode = head;
            } else {
                nodes.get(i-1).nextNode = currentNode;
            }
            nodes.add(currentNode);
        }
        return nodes;
    }


    /*

    https://medium.com/beyond-programming/alaaddin-and-his-carpet-algorithm-problem-of-the-week-i-8b4e39cc13bb

    private static int optimalPoint(int[] magic, int[] dist) {

        // First, handle unsuccessful journey
        if (Arrays.stream(magic).sum() < Arrays.stream(dist).sum()) {
            return -1;
        }

        int totalValue = 0;
        int startIndex = 0;
        int length = magic.length;

        for (int i = 0; i < length; i++) {
            if (totalValue < 0) {
                startIndex = i;
                totalValue = 0;
            }

            totalValue += (magic[i] - dist[i]);
        }
        return startIndex;
    }
    */

    public static int optimalPoint(List<Integer> magic, List<Integer> dist) {
        // Write your code here
        if (magic.isEmpty() || dist.isEmpty())
            return -1;

        List<Node> magicNodes = listToNodes(magic);
        List<Node> distNodes = listToNodes(magic);

        for (Node node: magicNodes){
            Node currentNode = node;
            do {
                node = node.nextNode;
                long result = node.value - dist.get(node.pos);
                if (result < 0)
                    break;
            } while (currentNode != node);
            if (currentNode == node)
                return currentNode.pos;
            else
                return -1;
        }
        return -1;
    }

    public static void main (String[] args) {

        List<Integer> magicList = new LinkedList<Integer>(
                Arrays.asList(2,4,5,2)
        );
        List<Integer> distList = new LinkedList<Integer>(
                Arrays.asList(2,4,5,2)
        );
        assert optimalPoint(magicList, distList) == 1;

        magicList = new LinkedList<Integer>(
                Arrays.asList(2,4,5,2, 5)
        );
        distList = new LinkedList<Integer>(
                Arrays.asList(2,4,5,2, 5)
        );
        assert optimalPoint(magicList, distList) == 1;

    }
}
