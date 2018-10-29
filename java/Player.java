public class Player {

    private String no,name,id,fed,rtg,club;

    public Player(String no, String name, String id, String fed, String rtg, String club) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.fed = fed;
        this.rtg = rtg;
        this.club = club;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public String getRtg() {
        return rtg;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
