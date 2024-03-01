class MyHashMap {

    private int[] keyValueArr;

    public MyHashMap() {
        this.keyValueArr = new int[1000001];
        Arrays.fill(keyValueArr, -1);
    }
    
    public void put(int key, int value) {
        keyValueArr[key] = value;
    }
    
    public int get(int key) {
        return keyValueArr[key];
    }
    
    public void remove(int key) {
        keyValueArr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */