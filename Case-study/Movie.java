class Movie {
    private String id;
    private String name;
    private String genre;
    private int duration; // phút

    public Movie(String id, String name, String genre, int duration) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    // Getter, Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + genre + " | " + duration + " phút";
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
    }
}
