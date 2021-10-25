class MinStack {
public:
    vector<int> v;
    MinStack() {
        v.clear();
    }
    
    void push(int val) {
       v.push_back(val);
    }
    
    void pop() {
        v.pop_back();
    }
    
    int top() {
       return v[v.size()-1];
    }
    
    int getMin() {
        int minimum = INT_MAX;
        for(int i=0;i<v.size();i++)
        {
            minimum= min(v[i],minimum);
        }
        return minimum;;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */