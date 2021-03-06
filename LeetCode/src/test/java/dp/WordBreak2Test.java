package dp;

import main.dp.WordBreak2;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordBreak2Test {


    @Test
    void wordBreak() {
        String[] dict = {"cat", "cats", "and", "sand", "dog"};
        List<String> wordDict = getWordDict(dict);
        assertEquals(2, new WordBreak2().wordBreak("catsanddog", wordDict).size());

        String[] dict1 = {"apple", "pen", "applepen", "pine", "pineapple"};
        wordDict = getWordDict(dict1);
        assertEquals(3, new WordBreak2().wordBreak("pineapplepenapple", wordDict).size());

        String[] dict2 = {"cats", "dog", "sand", "and", "cat"};
        wordDict = getWordDict(dict2);
        assertEquals(0, new WordBreak2().wordBreak("catsandog", wordDict).size());


        String[] dict3 = {"a"};
        wordDict = getWordDict(dict3);
        assertEquals(1, new WordBreak2().wordBreak("a", wordDict).size());

        String[] dict4 = {"aaaa", "aaa"};
        wordDict = getWordDict(dict4);
        assertEquals(2, new WordBreak2().wordBreak("aaaaaaa", wordDict).size());

    }


    List<String> getWordDict(String[] strings) {
        if (strings == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(strings);
    }
}