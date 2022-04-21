class MyHashSet {
    List<Integer> l1;
    public MyHashSet() {
        l1 = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
        {
            l1.add(key);
        }
    }
    
    public void remove(int key) {
        if(contains(key))
        {
            l1.remove(new Integer(key));
        }
    }
    
    public boolean contains(int key) {
        return l1.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
