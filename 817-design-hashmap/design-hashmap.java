class MyHashMap {

    private List<Integer> keyList;
    private List<Integer> valueList;

    public MyHashMap() {
        this.keyList = new ArrayList<>();
        this.valueList = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        var keyOccurenceIndex = keyList.indexOf(key);
        if (keyOccurenceIndex == -1) {
            keyList.add(key);
            valueList.add(value);
        } else {
            valueList.set(keyOccurenceIndex, value);
        }
    }
    
    public int get(int key) {
        var retrievedValue = -1;
        var keyOccurenceIndex = keyList.indexOf(key);
        if (keyOccurenceIndex != -1) {
            retrievedValue = valueList.get(keyOccurenceIndex);
        }
        return retrievedValue;
    }
    
    public void remove(int key) {
        var keyOccurenceIndex = keyList.indexOf(key);
        if (keyOccurenceIndex != -1) {
            keyList.remove(keyOccurenceIndex);
            valueList.remove(keyOccurenceIndex);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */