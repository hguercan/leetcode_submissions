use std::collections::HashSet;

impl Solution {
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
    }
}