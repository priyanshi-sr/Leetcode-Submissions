class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        return(Seat(seats,students));
    }
      public static int Seat(int[] seats,int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res+= Math.abs(seats[i]-students[i]);
        }
        return  res;
    }

}