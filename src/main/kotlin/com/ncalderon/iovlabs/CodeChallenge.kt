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