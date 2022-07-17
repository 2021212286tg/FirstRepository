package We;

//父类失物类
public class Lost {
    private String name;//失物名称
    private String time;//失物丢失时间
    private byte[] photo;//失物图片
    private String collectionLocation;//失物领取地点

    public Lost(String name, String time, byte[] photo, String collectionLocation) {
        this.name = name;
        this.time = time;
        this.photo = photo;
        this.collectionLocation = collectionLocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCollectionLocation() {
        return collectionLocation;
    }

    public void setCollectionLocation(String collectionLocation) {
        this.collectionLocation = collectionLocation;
    }
}
