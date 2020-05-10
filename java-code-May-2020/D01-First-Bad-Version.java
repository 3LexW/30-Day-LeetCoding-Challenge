/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Use finary searching
        int left = 1;
        int right = n;

        
        while(left < right){
            int middle = (right - left) / 2 + left;
            //Middle is not bad version, search after middle
            if (!isBadVersion(middle))
                left = middle+1;
            //Middle is bad version, it can be the first one, so we move right pointer to middle
            else
                right = middle;
        }
        
        return left;
    }
}
