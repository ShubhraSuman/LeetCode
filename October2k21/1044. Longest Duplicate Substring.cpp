string longestDupSubstring(string S) {
     unordered_set<string_view> seen;
     string_view ans;
     int start = 0, end = S.size() - 1;
     while(start <= end) {
          int len = (start + end) / 2;
          bool found = false;
          for(int i = 0; i < S.size() - len + 1; i++) {
          string_view sv = string_view(S).substr(i, len);
               if(seen.find(sv) != seen.end()) {
                    found = true;
                    ans = sv;
                    break;
               } else {
                    seen.emplace(sv);
               }
          }
          if(found) {
               start = len + 1;
          } else {
               end = len - 1;
          }
          seen.clear();
     }
     return {ans.begin(), ans.end()};
}
//IMP LINKS:
//https://www.learncpp.com/cpp-tutorial/an-introduction-to-stdstring_view/#:~:text=C%2B%2B17%20introduces%20another%20way%20of%20using%20strings%2C%20std%3A%3Astring_view%2C,use%20std%3A%3Astring_view%20by%20replacing%20every%20std%3A%3Astring%20with%20std%3A%3Astring_view.
//https://anshika-bhargava0202.medium.com/leetcode-1044-longest-increasing-substring-f40fac0a6169
//TESTCASES:
//"ppyprwwynqfidzoroopgecnvdgupnlwxwjjpynpxvptmgmirzerrwlslshudljlkbanxbuidrhocsaadxcqgzleadrbsnspcxgfaimugpwyfhwfhhwhvxvpuyhixibaqpvsdigpofyeqyljekswxrckwdwyeatlulnglkuzuwmglcctjqgwwzvflayzqpqucdqzfpegmhcxuxqhxkamsxeczspgixgatcxjkfgtupiwdeicozvbackiwoxgyfrysgrlevolbmawccazzbiubipialpxmjyzrwtqtjznnunjkuujthcrmjuofaofyyviwfnxujdbmigzdbmdjwmqjddjjidzohgetthcrmsnzbxzgwicvhcsgeqvovwyikgiiaksgrrgktwhtowezzmxhbfbgktaamzeizwbcexckuejpgmgtckrgiwiopgaaaihvorfpjebsnxixmiqcfjqwqtlovqdywsibqwjuwehwguwdqnavpxltxtfowcobihawjpgtgwwmcwiftudksvhyykoskyuifgyipemyswgmusywztkobnuqrvvnxffrtwoijwpdaelhtlpweyupbvumalqaumiryikyijqpisgpgqpjwrvesforvcygzrjuwxiyewfezggvprbcfdyavzdwovgntyakcdhbunyumvzmljsktiyudvxygofyjhlvbqballbchamarhewmqwoaepq"
//"ttwphlndxvcruhoaapgcfovcqopxbyzcidwhbwmpbdaiyanfhotksdvamvtpzvvugyryqyxujwbcxffxnsbtbabrcyndqrtdljjjayplrhrdkbeerdgfoghpwvrdtbxpoqpbsvwksgihlaxrkilhnqewfsqwvqqnzfbebdjqheieunlfxdkqrqcsxgdbrtgmsotvvzdeijnxztqpvlmfpjicsfrdmtbtqqmiqsdhgtoqlszvfqlysnoipqytxpmsrvxlsurceauhouzdqalnwoguxywmjdtlblrauelxmjwcxxnatjfkachlnzxdhxqqwyojstzcrmykisgylckdjylqcuzwtksklgmhxgfzmrmobjgianujssoonukgwtqkyoehkxfqznqolerjueurpxnhzvegghwzqqyakilucywadvqayrrsotfmntebgnvzrsstulludafuyunheufvmlriccizxjxvbpaeofopflwimtxahjacxwwplojj"
//"pmyiaxmicpmvqywlkisfzzutlxxjipitwcfxgqqfnxizowkqfmzsvkxryknasyvthozahbmapwqocupxcktmmtddxgatzftamrsvtddjpbnrojcqonmzxmknashplmykdbadiiccdkbyyzifqxvqfwgwihxgnrhqlmqprnjawuzcotutbkgnykuuwtzzzppmoyfmplhpznpnlwwbndekakpsmehzmbcfoyudgwsvehzgsfwqdkihiiwxfskicrbmoevxvpmmymihlkmgnuyohcofzfkehccwxezxypnnvqzrilr"
//
