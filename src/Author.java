public class Author {
    String authorFirstName;
    String authorLastName;
    public Author (String authorFirstName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorFirstName () {
        return authorFirstName;
    }
    public String getAuthorLastName () {
        return authorLastName;
    }
}
