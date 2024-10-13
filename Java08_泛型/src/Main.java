import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Songs<String>> songs = new ArrayList<>();
        songs.add(new Songs("sunrise","A",80));
        songs.add(new Songs("noprice","Basaka",85));
        songs.add(new Songs("thanks","988",90));
        songs.add(new Songs("$100","&12K",95));
        songs.add(new Songs("havana","ZZZ",98));
        songs.add(new Songs("114514","臭死",120));

        System.out.println("请选择歌曲的排序方式（选填编号）：1-歌曲字母升序  2-歌手字母升序  3-bpm升序");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(songs, Comparator.comparing(Songs::getTitle,String.CASE_INSENSITIVE_ORDER));
                break;
            case 2:
                Collections.sort(songs,Comparator.comparing(Songs::getArtist,String.CASE_INSENSITIVE_ORDER));
                break;
            case 3:
                Collections.sort(songs,Comparator.comparing(Songs::getBpm,Comparator.naturalOrder()));
                break;
        }
        songs.forEach(System.out::println);
    }
}
