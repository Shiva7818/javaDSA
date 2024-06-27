public class frogJump {
   static boolean frog(int []stones,int index,int k,int jump)
    {
        if(stones[index]!=jump)
        return false;
        if(index==stones.length-1)
        {
            if(stones[index]==jump)
            return true;
            else
            return false;
        }
        return frog(stones,index+1,k-1,jump+k-1)||frog(stones,index+1,k,jump+k)||frog(stones,index+1,k+1,jump+k+1);
    }
    public static void main(String[] args) {
        int stones[] ={0,1,3,5,6,8,12,17};
        System.out.println(frog(stones,0,1,0));
    }
}
