class Trie {
    class TrieNode{
        TrieNode[] children;
        boolean end;
        TrieNode(){
            children = new TrieNode[26];
            end = false;
        }
    }
    TrieNode trieroot;
    /** Initialize your data structure here. */
    public Trie() {
        trieroot = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode root = trieroot;
        for (char c: word.toCharArray()){
            if (root.children[c-'a'] == null) root.children[c-'a'] = new TrieNode();
            root = root.children[c-'a'];
        }
        root.end = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode root = trieroot;
        for (char c: word.toCharArray()){
            if (root.children[c-'a'] == null) return false;
            root = root.children[c-'a'];
        }
        return root.end;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode root = trieroot;
        for (char c: prefix.toCharArray()){
            if (root.children[c-'a'] == null) return false;
            root = root.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
