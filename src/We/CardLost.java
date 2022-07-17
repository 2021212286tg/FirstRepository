package We;

public class CardLost extends Lost {
    private String id;//一卡通卡号
    private String studentName;//学生姓名
    private String academy;//学生所属学院
    private byte[] profileOfCard;//一卡通图片

    public CardLost(String name, String time, byte[] photo, String collectionLocation, String id, String studentName, String academy, byte[] profileOfCard) {
        super(name, time, photo, collectionLocation);
        this.id = id;
        this.studentName = studentName;
        this.academy = academy;
        this.profileOfCard = profileOfCard;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public byte[] getProfileOfCard() {
        return profileOfCard;
    }

    public void setProfileOfCard(byte[] profileOfCard) {
        this.profileOfCard = profileOfCard;
    }
}
