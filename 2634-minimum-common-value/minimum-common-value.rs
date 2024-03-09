impl Solution {
    pub fn get_common(nums1: Vec<i32>, nums2: Vec<i32>) -> i32 {
        let mut index_one: usize = 0;
        let mut index_two: usize = 0;

        while index_one < nums1.len() && index_two < nums2.len() {
            let val_one = nums1[index_one];
            let val_two = nums2[index_two];

            if val_one == val_two {
                return val_one;
            } else if val_one < val_two {
                index_one += 1;
            } else {
                index_two += 1;
            }
        }

        -1
    }
}