

public class Songs {
    private String title;
    private String artist;
    private int bpm;

    public Songs(String title, String artist, int bpm) {   //创造Songs
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;

    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getBpm(){
        return bpm;
    }
    @Override
    public String toString(){      //便于打印列表中的内容
        return "曲目：" + title + " 歌手：" + artist + " BPM：" + bpm;
    }

}


