   //Make use of trie DS and store words in reverse order
    const int ALPHABET_SIZE = 26;
    class Trie{
        Trie* node[ALPHABET_SIZE];
        bool endsHere = false;
        
        public:
        void insert(string& s)
        {     
           // start from the root node
           Trie* curr = this;
           for(int i=s.length()-1;i>=0;i--)
           {
               // create a new node if the path doesn't exist
               if(curr->node[s[i]-'a']== nullptr)
               {
                   curr->node[s[i]-'a'] = new Trie();
               }
               // go to the next node
               curr = curr->node[s[i]-'a'];
           }
           // mark that a word ends at this node
           curr->endsHere = true;
        }
        
        bool search(string& s)
        {
           Trie* curr = this;
           for(int i=s.length()-1;i>=0;i--)
           {
               // create a new node if the path doesn't exist
               if(curr->node[s[i]-'a']== nullptr)
               {
                   return false;
               }
               // go to the next node
               curr = curr->node[s[i]-'a'];
               if(curr -> endsHere) return true;      
           }
            return false;
        }      
    };
class StreamChecker {
public:
    Trie *T = new Trie();
    string queryStream = "";
    StreamChecker(vector<string>& words) {
         for(auto& w : words) T -> insert(w);
    }
    
    bool query(char c) {
         queryStream += c;                                  
        return T -> search(queryStream);
    }
};

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker* obj = new StreamChecker(words);
 * bool param_1 = obj->query(letter);
 */
