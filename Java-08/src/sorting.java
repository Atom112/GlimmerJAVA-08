/*-----排序方法-----*/
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {
    public void Title(List<Songs> list){
        Collections.sort(list,Comparator.comparing(Songs::getTitle,String.CASE_INSENSITIVE_ORDER));
    }
    public void Artist(List<Songs> list){
        Collections.sort(list,Comparator.comparing(Songs::getArtist,String.CASE_INSENSITIVE_ORDER));
    }
    public void bpm (List<Songs> list){
        Collections.sort(list,Comparator.comparing(Songs::getBpm,Comparator.naturalOrder()));
    }
}
