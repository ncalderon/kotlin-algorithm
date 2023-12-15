package com.ncalderon.iovlabs

class Node (var id: Int,var peers: Set<Node>){
    override fun equals(other: Any?): Boolean {
        if (other is Node){
            return other.id == id
        }
        return false
    }

    override fun hashCode(): Int {
        return id
    }
}

/*

is = []

t0: current node = node1 -> processing = node2,node3 -> fs = node1
t1: current node = node2 -> processing = node1,node3,node4 -> = fs = node1, node2
t2: current node = node1 -> end -> fs = node1, node2
t3: current node = node3 -> processing = node 5 -> fs = node1, node2, node3
t4: current node = node5 -> end -> fs = node1, node2, node3, node5
t5: current node = node4 -> end -> fs = node1, node2, node3, node5, node4

node1, node2, node3, node5, node4

 */

fun solution(node: Node, memo: MutableSet<Node> = mutableSetOf()): Set<Node> {
    if (memo.contains(node))
        return memo
    else
        memo.add(node)

    for (peer in node.peers){
        solution(peer, memo);
    }
    return memo
}