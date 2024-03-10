use std::collections::HashSet;

impl Solution {

    /* Second solution */
    pub fn intersection(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        let set_nums1: HashSet<i32> = nums1.into_iter().collect();
        let set_nums2: HashSet<i32> = nums2.into_iter().collect();

        set_nums1.intersection(&set_nums2).cloned().collect()
    }


    /* First solution 
    pub fn intersection(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        
        if nums1.len() <= nums2.len() {
            Solution::findIntersection(nums1, nums2)
        } else {
            Solution::findIntersection(nums2, nums1)
        }
    }
    
    pub fn findIntersection(numsShort: Vec<i32>, numsLong: Vec<i32>) -> Vec<i32> {
        let mut intersects: HashSet<i32> = HashSet::new();
        for candidate in numsShort.iter() {
            if numsLong.contains(candidate) {
                intersects.insert(*candidate);
            }
        }

        Vec::from_iter(intersects)
    }*/
}