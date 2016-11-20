import java.util.*;

class Solution {
    public static void main(String[] argh) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        ArrayList<String> query = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        if (n >= 1 && n <= 100000) {
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                in.nextLine();
                phoneBook.put(name, phone);
            }
            int j = 0;
            while (in.hasNext()) {
                query.add(in.nextLine());
                j++;
            }
            if (j >= 1 && j <= 100000) {
                Set<Map.Entry<String, Integer>> set = phoneBook.entrySet();
                for (String itemQuery : query) {
                    if (phoneBook.containsKey(itemQuery)) {
                        System.out.println(itemQuery + "=" + phoneBook.get(itemQuery));
                    } else {
                        System.out.println("Not found");
                    }
                }
            }
        }
    }
}
