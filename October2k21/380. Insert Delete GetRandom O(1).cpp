class RandomizedSet {
public:
     vector<int> v;
    RandomizedSet() {
       v.clear();
    }
    
    bool insert(int val) {
        if(find(v.begin(),v.end(),val)==v.end())
        {
            v.push_back(val);
            return true;
        }
        return false;
    }
    
    bool remove(int val) {
         auto it = find(v.begin(),v.end(),val);
         if(it!=v.end())
         {
             int index = it - v.begin();
             int lastIndex = v.size()-1;
             v[index] = v[lastIndex];
             v.pop_back();
             return true;
         }
        return false;
    }
    
    int getRandom() {
        int index = rand()%v.size();
        return v[index];
    }
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */