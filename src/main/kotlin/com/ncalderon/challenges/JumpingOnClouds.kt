package com.ncalderon.challenges

class JumpingOnClouds {
    /**
     *  Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
     *
     *  For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .
     *
     *  Function Description
     *
     *  Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
     *
     *  jumpingOnClouds has the following parameter(s):
     *
     *  c: an array of binary integers
     *  Input Format
     *
     *  The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .
     *
     *  Constraints
     *
     *  Output Format
     *
     *  Print the minimum number of jumps needed to win the game.
     *
     *  Sample Input 0
     *
     *  7
     *  0 0 1 0 0 1 0
     *  Sample Output 0
     *
     *  4
     */
    fun jumpingOnClouds(c: Array<Int>): Int {
        var jumps = 0
        var currentCloud = 0
        while (currentCloud < c.size){
            when {
                isPossibleCloud(currentCloud+2, c) -> {
                    currentCloud += 2
                    jumps++
                }
                isPossibleCloud(currentCloud+1, c) -> {
                    currentCloud += 1
                    jumps++
                }
                else -> {
                    currentCloud += 1
                }
            }
        }
        return jumps
    }

    private fun isPossibleCloud(cloudIndex: Int, c: Array<Int>): Boolean {
        if (cloudIndex >= c.size)
            return false

        if (c[cloudIndex] == 0)
            return true;

        return false
    }
}
