use std::collections::HashMap;
use std::collections::HashSet;


impl Solution {
    pub fn find_judge(n: i32, trust: Vec<Vec<i32>>) -> i32 {
        if trust.is_empty() && n == 1 {
            return n
        } else if trust.is_empty() && n != 1 {
            return -1
        }

        let mut trust_relations_count = HashMap::new();
        let mut people_who_trust = HashSet::new();
        for trust_relation in trust.iter() {
            let person_who_trusts = trust_relation[0];
            let trusted_person = trust_relation[1];
            trust_relations_count.entry(trusted_person).and_modify(|counter| *counter += 1).or_insert(1);
            people_who_trust.insert(person_who_trusts);
        }
        for (&person, &count) in trust_relations_count.iter() {
            if count == n - 1 && !people_who_trust.contains(&person) {
                return person
            }
        }
        return -1 
    }
}