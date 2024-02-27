package day19_StringBuilder.DE19_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hasan");
        String str = sb.append("Kardes").substring(0,2);

        System.out.println(sb);

        // deleteVharAT
        sb.delete(1,2); // 1.indexten  den 2. index e kadar karekterleri siler ( 1 dahil, 2 hariç)
        System.out.println(sb);
        sb.deleteCharAt(4); // 4. index teki karekteri siler
        System.out.println(sb);
        str ="kkk";
        sb.insert(2,str); // 2.indexten itibaren str yi , sb ye ekler
        System.out.println(sb);
        sb.setLength(5);        // ilk 5 karekteri alır(içinde yazan sayı kadar) gerisini siler
        System.out.println(sb);
        sb.setCharAt(1,'='); // verilen indexin yerine verilen char yazılır
        System.out.println(sb);


    }
}
