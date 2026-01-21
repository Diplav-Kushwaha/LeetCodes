 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);

        int leftResult = binarySearchAsc(mountainArr, 0, peak, target);
        if (leftResult != -1) {
            return leftResult;
        }
        return binarySearchDesc(mountainArr, peak + 1, n - 1, target);
    }

    private int findPeak(MountainArray arr, int n) {
        int low = 0, high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private int binarySearchAsc(MountainArray arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            if (val < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private int binarySearchDesc(MountainArray arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;
            if (val > target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
