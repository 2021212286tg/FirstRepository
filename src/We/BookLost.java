package We;

public class BookLost extends Lost {
    private String bookName;//具体书名
    private String additionalInformation;//书上附加信息（补充信息说明）
    private byte[] profileOfBook;//书的图片

    public BookLost(String name, String time, byte[] photo, String collectionLocation, String bookName, String additionalInformation, byte[] profileOfBook) {
        super(name, time, photo, collectionLocation);
        this.bookName = bookName;
        this.additionalInformation = additionalInformation;
        this.profileOfBook = profileOfBook;
    }

    public void setBookName(String bookName) {
        bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public byte[] getProfileOfBook() {
        return profileOfBook;
    }

    public void setProfileOfBook(byte[] profileOfBook) {
        this.profileOfBook = profileOfBook;
    }

}
