import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        List<Songs> list = new ArrayList<>();    //向列表中添加歌曲
        list.add(new Songs("sunrise","A",80));
        list.add(new Songs("noprice","Basaka",85));
        list.add(new Songs("thanks","988",90));
        list.add(new Songs("$100","&12K",95));
        list.add(new Songs("havana","ZZZ",98));
        list.add(new Songs("114514","臭死",120));

        sorting s = new sorting();
        System.out.println("请选择歌曲的排序方式（选填编号）：1-歌曲字母升序  2-歌手字母升序  3-bpm升序");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){      //选择歌曲的排序方式
            s.Title(list);
        } else if(choice == 2){
            s.Artist(list);
        } else if(choice == 3){
            s.bpm(list);
        }

        list.forEach(System.out::println);
    }
}
