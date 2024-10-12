public class Songs<T> {
    private T title;
    private T artist;
    private T bpm;

     public Songs(T title, T artist, T bpm) {
         this.title = title;
         this.artist = artist;
         this.bpm = bpm;
     }

     public String getTitle() {
         return (String) title;
     }
     public String getArtist() {
         return (String) artist;
     }
     public Integer getBpm() {
         return (Integer) bpm;
     }

    @Override
    public String toString(){      //便于打印列表中的内容
        return "曲目：" + title + " 歌手：" + artist + " BPM：" + bpm;
    }

}
