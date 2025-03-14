class Solution {
	//Time Complexity:O(nlogn+nlogm) m = no of rooms
    public int minMeetingRooms(int[][] intervals) {

       Arrays.sort(intervals,(a,b)-> a[0]-b[0]); 
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for (int i =0;i < intervals.length;i++){
        if (!pq.isEmpty() && intervals[i][0]>= pq.peek()){
            pq.poll();
        }
        pq.add(intervals[i][1]);
       }
       return pq.size();
    }
}
