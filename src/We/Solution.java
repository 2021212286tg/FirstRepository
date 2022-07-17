package We;

import java.util.ArrayList;

public class Solution {
    //排序失物丢失时间
    public void sortLost(Lost[] lostArray) {
        for (int i = 0; i < lostArray.length - 1; i++) {
            for (int j = i + 1; j < lostArray.length; j++) {
                if (lostArray[i].getTime().compareTo(lostArray[j].getTime()) > 0) {
                    Lost temp = lostArray[i];
                    lostArray[i] = lostArray[j];
                    lostArray[j] = temp;
                }
            }
        }
    }

    //搜索失物
    public Lost[] selectByKeyword(Lost[] lostArray, String Keyword) {
        ArrayList<Lost> list = new ArrayList<>();
        for (Lost lost : lostArray) {
            if (lost.getCollectionLocation().contains(Keyword)) {
                list.add(lost);
            }
        }
        return list.isEmpty() ? null : list.toArray(new Lost[0]);
    }
}
