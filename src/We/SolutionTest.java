package We;

public class SolutionTest {
    public static void main(String[] args) {
        Solution s = new Solution();
        Lost lost1 = new Lost("一卡通", "2022-07-09", null, "LIBRARY");
        Lost lost2 = new Lost("大话西游", "2022-07-08", null, "canteen");
        Lost lost3 = new Lost("钱包", "2022-07-10", null, "LIBRARY");
        Lost[] losts = {lost1, lost2, lost3};
        Lost[] select = s.selectByKeyword(losts, "LIBRARY");
        s.sortLost(losts);
        SolutionTest test = new SolutionTest();
        test.toString(losts);
        System.out.println("************************************");
        test.toString(select);
    }

    public void toString(Lost[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.format("丢失物品:%-10s", a[i].getName());
            System.out.format("丢失时间:%-10s", a[i].getName());
            System.out.format("物品照片为%-10s", a[i].getPhoto());
            System.out.format("丢失地点%-10s", a[i].getCollectionLocation());
            System.out.println();
        }
    }
}